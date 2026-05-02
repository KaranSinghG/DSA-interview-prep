# Happy Number

## Pattern
Cycle Detection (Using HashSet)

## Key Idea
If a number repeats during transformation, it is in a cycle → not happy.

## Algorithm
1. Initialize a HashSet to store visited numbers
2. While n is not equal to 1:
   - Replace n with sum of squares of its digits
   - If n is already in set → return false (cycle detected)
   - Add n to set
3. If n becomes 1 → return true

## Complexity
- Time: O(log n) per iteration
- Space: O(log n)

## Important Notes
- Cycle detection is the core concept
- Using HashSet makes detection simple

## Solved
Self
