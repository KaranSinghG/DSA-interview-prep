# Linked List Cycle Detection

## Pattern
Fast & Slow Pointer (Floyd’s Cycle Detection)

## Key Idea
Use two pointers moving at different speeds:
- Slow pointer moves 1 step
- Fast pointer moves 2 steps

If a cycle exists, the fast pointer will eventually meet the slow pointer.
If no cycle exists, the fast pointer will reach null.

## Algorithm
1. Initialize two pointers:
   - slow = head
   - fast = head
2. Traverse while fast != null and fast.next != null:
   - Move slow by 1 step
   - Move fast by 2 steps
3. If slow == fast:
   - Cycle exists → return true
4. If loop ends:
   - No cycle → return false

## Complexity
- Time: O(n)
- Space: O(1)

## Important Notes
- Always check fast != null && fast.next != null to avoid NullPointerException
- Works for all edge cases:
  - Empty list
  - Single node
  - Self-loop cycle

## Solved
Hint
