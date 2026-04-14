# Problem
Remove Nth Node From End of List

## Pattern
LinkList | Two Pointers 

---

## Key Idea
Maintain a gap of `n` nodes between two pointers. move them forward together.

---

## Algorithm
1. Create a dummy node pointing to head
2. Initialize two pointers `fast` and `slow` at dummy
3. Move `fast` pointer `n + 1` steps ahead
4. Move both pointers until `fast` becomes null
5. Delete the target node using `slow.next = slow.next.next`
6. Return `dummy.next`

---

## Complexity
- Time: O(n)
- Space: O(1)

---

## Important Notes
- Always move `fast` **n steps**

---

## Solved
Hint
