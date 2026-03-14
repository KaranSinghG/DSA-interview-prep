# Valid Sudoku
## Pattern
Arrays & Hashing
## Key Idea
For every number we see, we must make sure it does not repeat in:
- the same row
- the same column
- the same 3×3 box

So while scanning the board, we track what numbers we have already seen in each row, column, and box.

## Solved
Hint for box logic

## Algorithm
1. Create three tracking structures:
   - rows[9][10]
   - columns[9][10]
   - boxes[9][10]

2. Traverse the board cell by cell.

3. For each value:
   - If the cell is '.', skip it.

4. Convert the character to an integer.

5. Check:
   - If the number already exists in that row → return false
   - If the number already exists in that column → return false
   - If the number already exists in that box → return false

6. Otherwise mark that number as seen in row, column, and box.

7. Continue until the board is fully scanned.

8. If no conflicts are found → return true.

## Complexity
Time Complexity: O(1)  
(Sudoku board size is fixed 9×9)

Space Complexity: O(1)

## Learning
A Sudoku cell belongs to:
- one row
- one column
- one 3×3 box

The box index can be calculated using:

(i / 3) * 3 + (j / 3)

This lets us validate everything in a single traversal.
