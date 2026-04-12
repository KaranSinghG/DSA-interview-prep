# DSA-interview-prep
DSA problems with solution and pattern

## Solved Problems Tracker

| # | Problem | Category | Difficulty | Solved | Key Insight |
|---|--------|----------|------------|--------------|-------------|
| 1 | Two Sum | Arrays & Hashing | Easy | Hint | Complement lookup using HashMap |
| 2 | Contains Duplicate | Arrays & Hashing | Easy | Self | HashSet retrieval time is O(1) |
| 3 | Valid Anagram | Arrays & Hashing | Easy | Hint | Single frequency array: increment for s and decrement for t |
| 4 | Group Anagrams | Arrays & Hashing | Medium | Hint | Signature Hashing using character frequency |
| 5 | Top K Frequent Elements | Arrays & Hashing | Medium | After Learning about Priority Queue | Frequency map → Heap of size k
| 6 | Encode and Decode String | String Manipulation | Medium | Self | Length based Encoding |
| 7 | Product of Array Except Self | Arrays & Hashing | Medium | Hint | Prefix product × Suffix product |
| 8 | Valid Sudoku | Arrays & Hashing | Medium | Hint | Track row, column, and box using boolean arrays |
| 9 | Longest Consecutive Sequence | Arrays & Hashing | Medium | Hint | Sequence start detection |
| 10 | Valid Palindrome | Two Pointers | Easy | Self | Skip non-alphanumeric characters and compare using two pointers |
| 11 | Two Sum II (Sorted Input) | Two Pointers	| Medium | Self	| Sorted array → shrink search space using left/right pointers |
| 12 | 3Sum	| Two Pointers | Medium | Hint | Fix one element and reduce to Two Sum using sorting |
| 13 | Container With Most Water | Two Pointers	| Medium | Self | Move pointer at smaller height to maximize area |
| 14 | Binary Search | Binary Search | Easy	| Self | Half search space each step using sorted property |
| 15 | Search a 2D Matrix | Binary Search | Medium | Self | Treat matrix as a virtual 1D sorted array and map indices |
| 16 | Koko Eating Bananas | Binary Search | Medium | Self | Binary search on minimum valid speed (monotonic condition) |
| 17 | Find Minimum in Rotated Sorted Array | Binary Search | Medium | Self | If mid > right → minimum in right half, else → minimum in left (including mid) 
| 18 | Search in Rotated Sorted Array | Binary Search | Medium | Hint | One half always sorted → decide direction using range check |
| 19 | Time Based Key Value Store	| Binary Search	| Medium | Self | Binary search for last timestamp ≤ target (floor search) |
| 20 | Best Time to Buy and Sell Stock | Sliding Window / Greedy | Easy | Hint | Track minimum price so far and compute profit at each step |
| 21 | Longest Substring Without Repeating Characters | Sliding Window | Medium | Self | Expand window, shrink when duplicate using hashmap |
| 22 | Longest Repeating Character Replacement | Sliding Window | Medium | Hint | Maintain max frequency in window; shrink when (window size - maxFreq > k) |
| 23 | Reverse Linked List | Linked List | Easy | Self | Reverse pointers using prev, curr, next |
| 24 | Merge Two Sorted Lists | Linked List | Easy | Self | Compare nodes and attach smaller, then append remaining |
| 25 | Linked List Cycle Detection | Linked List  | Easy | Hint | Fast pointer meets slow in cycle |
| 26 | Reorder Link List | Linked List | Medium | Hint | Find midpoint -> reverse second half -> alternate links|
