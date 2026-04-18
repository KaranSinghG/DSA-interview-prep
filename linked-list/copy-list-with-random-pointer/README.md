# Copy List with Random Pointer

## Pattern
Linked List + Hashing

## Key Idea
Use a HashMap to map each original node to its copied node.  
Then, in a second pass, assign the `next` and `random` pointers using this map.

## Algorithm
1. Traverse the original list and create a copy of each node.
2. Store mapping: original node → copied node.
3. Traverse the list again:
   - Set `copy.next = map.get(original.next)`
   - Set `copy.random = map.get(original.random)`
4. Return the copied head using `map.get(head)`.

## Complexity
- Time Complexity: O(n)
- Space Complexity: O(n)

## Important Notes
- Do NOT create a separate head manually.
- Always use `map.get(head)` as the new head.
- Two-pass approach keeps logic clean and avoids duplication.

## Solved
Hint
