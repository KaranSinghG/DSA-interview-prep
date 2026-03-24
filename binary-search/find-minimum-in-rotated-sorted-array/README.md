# Find Minimum in Rotated Sorted Array
## Pattern
Binary Search on Rotated Array
## Key Idea
Compare mid with right to locate the unsorted half containing the minimum
## Algorithm
1. Initialize l = 0, r = n - 1
2. While l <= r:
  * Compute mid
  * If nums[mid] > nums[r] → minimum is in right half → move l = mid + 1
  * Else if nums[mid] < nums[r] → minimum is in left half (including mid) → move r = mid
  * Else → array is already sorted → return nums[l]
3. Return nums[0]
## Complexity
Time: O(log n)  
Space: O(1)
## Learning
The minimum always lies in the unsorted half  
Comparing with right helps identify which half is unsorted
## Solved
Self
