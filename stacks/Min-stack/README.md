## Min Stack

### Pattern
Stack

### Key Idea
Store the minimum value at each index while pushing to enable O(1) getMin.

### Algorithm
1. Initialize two arrays:
   - `arr` → stores stack elements
   - `minArr` → stores minimum till that index

2. Push operation:
   - Add element to `arr`
   - Store `min(val, previousMin)` in `minArr`

3. Pop operation:
   - Decrease size

4. Top operation:
   - Return last element of `arr`

5. GetMin operation:
   - Return last element of `minArr`

### Complexity
- Time:
  - Push → O(1)
  - Pop → O(1)
  - Top → O(1)
  - GetMin → O(1)

- Space:
  - O(n)

### Important Notes
- Always maintain minimum while pushing (do not compute later)
- Handle empty stack cases to avoid runtime errors
- Dynamic resizing ensures flexibility

### Solved
Self
