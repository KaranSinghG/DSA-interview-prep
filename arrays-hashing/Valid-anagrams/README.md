# Valid Anagram
## Pattern
Array and Hashing - Frequency Counting
## Key idea
Using a fixed array of size 26 to store the frequency of each character.  
Increment count for characters in the first string.  
Decrement count for characters in the second string.  
If the strings are anagrams, all values will end as 0.
## Solved
O(n) using two frequency arrays – Solved independently  
O(n) using single array (increment/decrement) – After hint
## Algorithm
1. If the lengths of both strings are different → return false.
2. Create an array of size 26 to store character frequencies.
3. Iterate through the first string and increment the corresponding index.
4. Iterate through the second string and decrement the corresponding index.
5. If any value becomes negative → return false.
6. Iterate through the array.
7. If any value is not 0 → return false.
8. Return true.
## Complexity ##
Time - O(n)  
Space - O(1)
## Learning
Initially used two frequency arrays to store character counts for both strings.  
Improved solution uses a single array where:  
- characters from the first string increment the count  
- characters from the second string decrement the count
- This reduces space usage and simplifies the logic.
