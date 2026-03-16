# Valid Palindrome

**Pattern**  
Two Pointers / String

---

## Key Idea

Use two pointers from both ends of the string.  
Skip non-alphanumeric characters and compare the remaining characters while moving inward.

---

## Algorithm

1. Initialize two pointers

```
left = 0
right = length - 1
```

2. Convert the string to lowercase.

3. While `left < right`:

- If the left character is not alphanumeric → `left++`
- If the right character is not alphanumeric → `right--`
- If characters are equal → move both pointers
- If characters are different → return `false`

4. If the loop finishes → return `true`.

---

## Complexity

Time Complexity : O(n)

Space Complexity : O(1)
