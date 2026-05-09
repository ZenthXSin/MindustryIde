import {JSDOM} from "jsdom";
import pLimit from "p-limit";
import * as path from "path";
import * as fs from "fs";
import axios from 'axios';
// @ts-ignore
import { HttpsProxyAgent } from 'https-proxy-agent';

export interface WikiSearchResult {
    docs: WikiDoc[];
}

export interface WikiDoc {
    location: string;
    text: string;
    title: string;
}

export interface FieldMeta {
    name: string;
    type: string;
    defaultValue: string;
    notes: string;
}

export type TypeMeta = {
    type: string;
    parentType: string;
    fields: FieldMeta[];
};

const config = {
    asyncLimit: 5,
    delayTime: 1000,
    estimateTimeMs: 500,
    testAmount: -1,
    onlyTypes: [] as string[],
    maxRetries: 5,
    retryDelay: 3000
};

const baseUrl = "https://mindustrygame.github.io/wiki/";

const proxyAgent = new HttpsProxyAgent('http://127.0.0.1:10090');

const client = axios.create({
    httpsAgent: proxyAgent,
    httpAgent: proxyAgent,
    timeout: 60000,
    headers: {
        'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36'
    }
});

async function fetchWithRetry(url: string, retries = config.maxRetries): Promise<string> {
    for (let attempt = 1; attempt <= retries; attempt++) {
        try {
            const response = await client.get(url);
            return response.data;
        } catch (error: any) {
            if (attempt < retries) {
                await delay(config.retryDelay);
            } else {
                throw error;
            }
        }
    }
    throw new Error('Max retries exceeded');
}

function updateProgress(current: number, total: number, success: number, failed: number) {
    const percentage = Math.round((current / total) * 100);
    const barLength = 30;
    const filled = Math.round((barLength * current) / total);
    const empty = barLength - filled;
    const bar = '█'.repeat(filled) + '░'.repeat(empty);

    process.stdout.write(`\rProgress: [${bar}] ${percentage}% | ${current}/${total} | Success: ${success} | Failed: ${failed}`);
}

async function main() {
    console.time("Fetching modding docs");

    let allDocs: WikiDoc[];
    try {
        const response = await fetchWithRetry(new URL("search/search_index.json", baseUrl).toString());
        const result = typeof response === 'string'
            ? JSON.parse(response) as WikiSearchResult
            : response as WikiSearchResult;
        allDocs = clearDuplicateBy(result.docs, "title");
    } catch (error: any) {
        console.error("\nFailed to fetch modding docs:", error.message);
        process.exit(1);
    }

    console.timeEnd("Fetching modding docs");

    const typeFileMap = new Map<string, string>();
    const typeMetaArray = new Array<TypeMeta>();
    const errorsTitle: string[] = [];

    const limit = pLimit(config.asyncLimit);

    const fetchDocs = config.onlyTypes.length
        ? allDocs.filter((d) => config.onlyTypes.includes(d.title))
        : allDocs;

    if (fetchDocs.length == 0) {
        console.log("No docs needed to fetch meta.");
        return;
    }

    console.log(`Found ${fetchDocs.length} modding docs.`);
    console.log(`Concurrency: ${config.asyncLimit}`);
    console.log();

    let completed = 0;
    let successCount = 0;
    let failedCount = 0;

    updateProgress(0, fetchDocs.length, 0, 0);

    await Promise.all(fetchDocs.map((doc) => limit(async () => {
        if (config.testAmount >= 0 && completed > config.testAmount) return;

        try {
            const meta = await fetchTypeMeta(doc);
            if (meta) {
                const filePath = path.resolve(
                    process.cwd(),
                    `./out/types/${doc.title}.json`,
                );

                typeFileMap.set(doc.title, filePath);
                typeMetaArray.push(meta);

                const dir = path.dirname(filePath);
                if (!fs.existsSync(dir)) {
                    fs.mkdirSync(dir, { recursive: true });
                }
                fs.writeFileSync(filePath, JSON.stringify(meta, null, 2));
                successCount++;
            } else {
                failedCount++;
            }
        } catch (e: any) {
            failedCount++;
            errorsTitle.push(doc.title);
        }

        completed++;
        updateProgress(completed, fetchDocs.length, successCount, failedCount);

        await delay(config.delayTime);
    })));

    console.log("\n\nDone.");
    if (errorsTitle.length > 0) {
        console.log(`Errors (${errorsTitle.length}):`);
        errorsTitle.forEach(title => console.log(`  - ${title}`));
    }
}

async function delay(ms: number) {
    return new Promise((resolve) => setTimeout(resolve, ms));
}

async function fetchTypeMeta(doc: WikiDoc): Promise<TypeMeta | null> {
    try {
        const response = await fetchWithRetry(new URL(doc.location, baseUrl).toString());
        const dom = new JSDOM(response);
        const extendElem = dom.window.document.querySelector("em a");
        if (!extendElem) return null;

        const table = dom.window.document.querySelector("table");
        if (!table) return null;

        return {
            type: doc.title,
            parentType: extendElem.textContent ?? "Object",
            fields: parseTable(table),
        };
    } catch (e: any) {
        return null;
    }
}

function parseTable(table: HTMLElement): FieldMeta[] {
    return Array.from(table.querySelectorAll("tr"))
        .map((rowElem, index) => {
            if (index === 0) return null;
            const cells = rowElem.querySelectorAll("td, th");
            return {
                name: cells[0]?.textContent?.trim() ?? "",
                type: cells[1]?.textContent?.trim() ?? "",
                defaultValue: cells[2]?.textContent?.trim() ?? "",
                notes: cells[3]?.textContent?.trim() ?? "",
            } satisfies FieldMeta;
        })
        .filter(Boolean) as FieldMeta[];
}

function clearDuplicateBy<T>(array: T[], key: keyof T): T[] {
    const set = new Set();
    return array.filter(
        (elem) => elem[key] && !set.has(elem[key]) && set.add(elem[key]),
    );
}

main();
