# Search in Rotated Sorted Array
## Pattern  
Binary Search (Modified)  
## Key Idea  
At any point, one half of the array is always sorted.  
Identify the sorted half and check whether the target lies within it to decide the direction.
## Algorithm  
1. Initialize `l = 0`, `r = n - 1`
2. While `l <= r`:
   - Find `mid`
   - If `nums[mid] == target` → return `mid`
   - If left half is sorted (`nums[l] <= nums[mid]`):
     - If target lies in `[nums[l], nums[mid])` → move left (`r = mid - 1`)
     - Else → move right (`l = mid + 1`)
   - Else (right half is sorted):
     - If target lies in `(nums[mid], nums[r]]` → move right (`l = mid + 1`)
     - Else → move left (`r = mid - 1`)
3. If not found → return `-1`
## ⏱️ Complexity  
- Time: O(log n)  
- Space: O(1)  
## Learning  
- Be careful with inclusive/exclusive boundaries  
## Status  
Hint  
