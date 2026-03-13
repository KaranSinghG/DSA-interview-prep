# Product of Array Except Self
## Pattern
Arrays - Prefix / Suffix Accumulation
## Key Idea
result[i] = product of elements to the left of i × product of elements to the right of i
## Solved
Initial approach: Division method  
Final solution: Hint used (Prefix × Suffix product)
## Algorithm
Prefix Pass  
1. Initialize product = 1
2. Create result array
3. For each index i:
   - result[i] = product
   - product = product × nums[i]

   Suffix Pass  
4. Initialize suffix product = 1
5. Traverse array from right to left
6. For each index i:
   - result[i] = result[i] × suffix product
   - suffix product = suffix product × nums[i]
7. Return result
## Complexity ##
Time - O(n)  
Space - O(n)
## Learning
Division is not required.  
By storing prefix products first and multiplying them with suffix products in reverse traversal, we can compute the result in O(n) time with constant extra space.
