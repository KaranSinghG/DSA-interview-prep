# Binary Search

## Pattern

Binary Search

---

## Key Idea

Since the array is sorted, we can eliminate half of the search space in each step by comparing the middle element with the target.

---

## Algorithm

* Initialize two pointers:

  * `left = 0`
  * `right = n - 1`
* While `left <= right`:

  * Find `mid`
  * If `nums[mid] == target` → return index
  * If target is smaller → search left half
  * If target is larger → search right half
* If not found → return `-1`

---

## Complexity

* **Time:** O(log n)
* **Space:** O(1)

---

## Important Notes

* Always calculate mid as:

  ```java
  left + (right - left) / 2
  ```

  to avoid integer overflow.
* Ensure search space reduces every iteration to avoid infinite loops.

---

## Status

Solved
