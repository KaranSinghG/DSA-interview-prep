# Reverse Linked List

## Pattern
Linked List 

## Key Idea
Reverse the direction of links in the linked list by iterating once and changing each node’s `next` pointer to point to the previous node.

## Algorithm
1. Initialize:
   - `prev = null`
   - `curr = head`
   - `next = null`  

2. Traverse the list:
   - Store next node → `next = curr.next`
   - Reverse link → `curr.next = prev`
   - Move `prev` → `prev = curr`
   - Move `curr` → `curr = next`

3. Return `prev` (new head of reversed list)

## Complexity
- Time: O(n)
- Space: O(1)

## Important Notes
- Always store `next` before breaking the link
- Final answer is `prev`, not `head`
- Works for empty and single-node lists

## Solved
Self
