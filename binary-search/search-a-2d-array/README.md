# Search a 2D Matrix

## Pattern
Binary Search

## Key Idea
There are two ways to approach this problem:

1. Use binary search twice:
   - First to find the correct row
   - Second to search within that row

2. Treat the 2D matrix as a virtual 1D sorted array:
   - Perform a single binary search
   - Map indices back to 2D using division and modulus

## Algorithm

### Approach 1: Two-Step Binary Search
- Perform binary search on rows to find the potential row
- Check if target lies within the row range
- Apply binary search on that row

### Approach 2: 1D Binary Search
- Treat matrix as a flattened sorted array of size rows * cols
- Initialize left = 0 and right = rows * cols - 1
- While left <= right:
  - Find mid index
  - Convert mid to row = mid / cols and col = mid % cols
  - Compare matrix[row][col] with target
  - Move left or right accordingly
- Return true if found, else false

## Complexity
Time: O(log (m * n))  
Space: O(1)

## Important Notes
- No actual flattening is done — only index mapping
- Binary search boundaries must be within [0, rows * cols - 1]
- 1D approach is more elegant and commonly preferred in interviews

## Status
Solved with approach 1 without hint  
Solved with approach 2 with hint
