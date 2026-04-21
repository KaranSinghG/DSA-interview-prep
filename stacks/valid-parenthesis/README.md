## Valid Parentheses

### Pattern
Stack

### Key Idea
Use a stack to track characters. If a matching pair is found, pop the stack.

### Algorithm
1. Initialize an empty stack.
2. Traverse each character in the string:
   - If stack is empty → push current character.
   - Else check:
     - If top of stack and current character form a valid pair → pop.
     - Otherwise → push current character.
3. After traversal:
   - If stack is empty → valid parentheses.
   - Else → invalid.

### Complexity
- Time: O(n)
- Space: O(n)

### Important Notes
- This approach pushes both opening and closing brackets.
- It relies on pair matching during traversal instead of strict validation.

### Solved
Self
