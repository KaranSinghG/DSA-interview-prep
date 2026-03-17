# Two Sum II

**Pattern**  
Two Pointers

---

## Key Idea

Use two pointers from both ends of the array.  
start comparing the sum if the sum if greater move the end inwards
if sum is smaller move the start inwards

---

## Algorithm

1. Initialize two pointers

```
left = 0
right = length - 1
```
2. calculate `sum = numbers[left] + numbers[right]
3. While `left < right`:

- If the sum is greater than target → `right--`
- If the sum is smaller than target → `left++`
- If sum is equal to target → return indices

4. If the loop finishes → return `[0,0]`.

---

## Complexity

Time Complexity : O(n)

Space Complexity : O(1)
