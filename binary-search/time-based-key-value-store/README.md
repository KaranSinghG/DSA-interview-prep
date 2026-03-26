# Time Based Key Value Store

## Pattern
Binary Search

## Key Idea
Store all values for a key along with timestamps in increasing order.  
For retrieval, use binary search to find the latest timestamp that is less than or equal to the given timestamp.

## Algorithm
1. Use a HashMap to map:
   key → List of (timestamp, value)

2. For `set(key, value, timestamp)`:
   - Append (timestamp, value) to the list for that key

3. For `get(key, timestamp)`:
   - If key does not exist → return ""
   - Perform binary search on the list:
     - If current timestamp ≤ target:
       - Store value as potential answer
       - Move right to find a closer timestamp
     - Else:
       - Move left
   - Return the stored answer

## Complexity
- Time:
  - set → O(1)
  - get → O(log n)
- Space:
  - O(n)

## Learning
- Timestamps are strictly increasing → no need to sort
- This is a classic "find floor (≤ target)" binary search
- Always track the best candidate while searching

## Solved
Self
