import fetch from 'node-fetch';

interface ApiResponse {
    data: {
        children: {
            data: Submission
        }[];
    };
}

interface Submission {
    author: string;
    domain: string;
    title: string;
    subreddit: string;
    url: string;
    created_utc: string;
}

function fetchSubmissions(subreddit: string): Promise<Array<Submission>> {
    return fetch(`https://www.reddit.com/r/${subreddit}.json`) 
        .then(res => res.json<ApiResponse>())
        .then(res => res.data.children.map(child => child.data));
}

export function run(): void {
    fetchSubmissions("linux").then(submissions => {
        submissions.slice(0, 3).forEach(sub => {
            console.log(`submission ${sub.created_utc} ${sub.title}`);
        });
    });
}
