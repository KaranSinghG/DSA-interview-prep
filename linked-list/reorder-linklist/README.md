## Reorder Link List

### Pattern

Linked List Manipulation

---

### Key Idea

Find the middle of the list, reverse the second half, and merge both halves alternately.

---

### Algorithm

1. Use slow and fast pointers to find the middle of the list.
2. Split the list into two halves (`slow.next = null`).
3. Reverse the second half of the list.
4. Merge the two halves:

   * Link first node of first half to first node of second half
   * Then link back to next node of first half
   * Continue until second half is exhausted

---

### Complexity

* Time Complexity: O(n)
* Space Complexity: O(1)

---

### Important Notes

* Use `while(second != null)` for merging to avoid null pointer issues.
* Always break the list before reversing to prevent cycles.
* The second half will be equal or shorter than the first half.
* In-place manipulation is required (no extra space).

---

### Status

Solved
