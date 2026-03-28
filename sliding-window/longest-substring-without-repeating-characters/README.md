# Longest Substring Without Repeating Characters

## Pattern
Sliding Window + HashMap

## Key Idea
Maintain a window with unique characters.
If a duplicate is found, shrink the window from the left just enough to remove the duplicate.

## Algorithm
- Use two pointers `l` and `r` to represent the window
- Use a HashMap to store last seen index of characters
- Expand `r`:
  - If character is already seen → move `l` to `lastIndex + 1`
  - Ensure `l` never moves backward using `Math.max`
- Update max length at each step

## Complexity
- Time: O(n)
- Space: O(n)

## Important Notes
- Always use `l = Math.max(l, lastIndex + 1)` to avoid incorrect shrinking
- Store index (not just presence) in map
- Final answer should consider last window

## Solved
Self
