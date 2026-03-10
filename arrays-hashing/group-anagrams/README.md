# Group Anagrams
## Pattern
Array and Hashing - Signature hashing
## Key idea
Generate a unique signature for each string based on character frequency.  
Strings with the same signature are anagrams and will be grouped together using a HashMap.
## Solved
With a hint
## Algorithm
1. Create a Hashmap to store Signature -> List<String> 
2. Start iterating over the array
3. Create signature using character frequency
4. Check if signature present in hashmap
5. If yes -> add string in the existing list
6. Else -> create new list, add the current element
7. After processing all strings, return all values from the HashMap.
## Complexity
Time - O(n * k)  
Space - O(n * k)
## Learning
Brute Force - Compare every pair of strings and check if they are anagrams -> O(n^2).
Optimized - Generate a signature for each string and store it in a HashMap.  
Strings with the same signature belong to the same anagram group. -> O(n*k)
