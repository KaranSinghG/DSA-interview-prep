# Contains Duplicate #
## Pattern ##
Array and Hashing - HashSet Retrieval O(1)
## Key idea ##
Instead of using array and checking for duplicates
We can use HashSet to check if exists in O(1) time complexity
(We can HasMap also, but it will take a little more space)
## Solved ##
Self
## Algorithm ##
1. Create a HashSet to store ELEMENTS 
2. Start iterating over the array
3. Check if ELEMENT present in hashset
5. If yes -> return true
6. Else -> add the current ELEMENT in the set
7. Return false
## Complexity ##
Time - O(n)
Space - O(n)
## Learning ##
Brute Force - Using arrays take up lot of space if the ELEMENT is very large
Optimized - Using HashSet to save the element - lookup later for ELEMENT - O(n)
