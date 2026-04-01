## Merge Two Sorted Lists

## Pattern
Linked List, Two Pointer

## Key Idea
Use two pointers to compare nodes from both lists and build a new sorted list.
Always attach the smaller node and move that pointer forward.
Once one list is exhausted, attach the remaining part of the other list.

## Algorithm
1. Create a dummy node to simplify handling head
2. Use a pointer `curr` to build the result list
3. Traverse both lists while both are not null:
   - Compare values
   - Attach smaller node to `curr.next`
   - Move corresponding pointer forward
4. Attach remaining nodes from non-empty list
5. Return `head.next`

## Complexity
Time Complexity: O(n + m)  
Space Complexity: O(1)

## Important Notes
- Foundation for merge sort on linked list

## Solved
Self
