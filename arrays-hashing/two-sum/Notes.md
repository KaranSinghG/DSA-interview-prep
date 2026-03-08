# Two Sum #
## Pattern ##
Array and Hashing - Complement Look up
## Key idea ##
Instead of checking pair-wise sum  
Store current element in Hashmap, look up for the compliment of current element in the map  
compliment = target - nums[i]
## Solved ##
With a hint
## Algorithm ##
1. Create a Hashmap to store element -> index 
2. Start iterating over the array
3. Calculate the *compliment = target - nums[i]*
4. Check if compliment present in hashmap
5. If yes -> return indices
6. Else -> add the current element, index in the map
## Complexity ##
Time - O(n)
Space - O(n)
## Learning ##
Brute Force - Iterating 2 elements at a time, checking their sum - O(n^2)  
Optimized - Using Hashmap to save the element - lookup later for compliment - O(n)
