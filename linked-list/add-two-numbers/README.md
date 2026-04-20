# Add Two Numbers

## Pattern
Linked List

---

## Key Idea
Use a single loop to traverse both linked lists simultaneously. At each step, add corresponding digits along with carry, and build the result list.

---

## Algorithm
1. Create a dummy node (`head`) to simplify result handling.
2. Initialize `temp` pointer to build the result list.
3. Initialize `carry = 0`.
4. Traverse while either list has nodes:
   - Start sum with carry.
   - If first list node exists → add its value and move pointer.
   - If second list node exists → add its value and move pointer.
   - If sum > 9:
     - Set carry = 1
     - Reduce sum by 10
   - Else:
     - Set carry = 0
   - Create new node with computed sum and attach to result.
5. After loop, if carry > 0 → add a new node.
6. Return `head.next`.

---

## Complexity
- Time: O(max(n, m))  
- Space: O(max(n, m))

---

## Important Notes
- Single loop (`while (l1 != null || l2 != null)`) avoids duplicate logic.
- Carry is propagated correctly across all digits.
- Works for unequal length lists.
}
