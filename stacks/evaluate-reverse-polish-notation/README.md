# Evaluate Reverse Polish Notation

# Pattern
Stack

# Key Idea
Use a stack to evaluate operators on the last two operands.

# Algorithm
- Initialize an empty stack
- Traverse each token:
  - If token is a number, push it to the stack
  - If token is an operator:
    - Pop top two elements (a, b)
    - Apply operation (b operator a)
    - Push result back to stack
- Return the final element from the stack

# Complexity
- Time: O(n)
- Space: O(n)

# Important Notes
- Order matters: b - a and b / a
- Division truncates toward zero in Java
- Handles negative numbers using Integer.parseInt

# Solved
Self
