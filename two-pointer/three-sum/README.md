# Three Sum

**Pattern**  
Two Pointers

---

## Key Idea

Fix one number and convert the problem into Two Sum (sorted array + two pointers).

---

## Algorithm

1. Sort the array
2. Iterate through the array from `i = 0` to `n - 3`
   * If `i > 0` and `nums[i] == nums[i - 1]`, skip this index to avoid duplicates
3. For each index `i`:
   * Initialize two pointers:
     * `left = i + 1`
     * `right = n - 1`
4. While `left < right`:
   * Calculate:
     ```
     sum = nums[i] + nums[left] + nums[right]
     ```
   * If `sum < 0`:
     * Move `left++` to increase sum
   * Else if `sum > 0`:
     * Move `right--` to decrease sum
   * Else (`sum == 0`):
     * Add `[nums[i], nums[left], nums[right]]` to result
     * Move both pointers:
       ```
       left++
       right--
       ```
     * Skip duplicates for `left`:
       ```
       while left < right and nums[left] == nums[left - 1]:
           left++
       ```
     * Skip duplicates for `right`:
       ```
       while left < right and nums[right] == nums[right + 1]:
           right--
       ```
---

## Complexity

Time Complexity : O(n^2)  
Space Complexity : O(1)
