# Koko Eating Bananas

## Pattern
Binary Search on Answer

## Key Idea
The eating speed (k) forms a monotonic search space:
- If a speed works (can finish within h hours), then all higher speeds will also work.
- We need to find the minimum such valid speed.

## Algorithm
1. Define search space:
   - Minimum speed = 1
   - Maximum speed = max(piles)

2. Apply binary search:
   - For mid speed, calculate total hours required.
   - Use ceiling division to compute hours for each pile.

3. Condition:
   - If total time > h → speed too slow → move right
   - Else → valid speed → store answer and move left

4. Continue until search space is exhausted.

## Complexity
- Time: O(n log m)
  - n = number of piles
  - m = max value in piles
- Space: O(1)

## Important Notes
- Use long for time calculation to avoid *integer overflow*.
- Do NOT sort the array (unnecessary overhead).
- Ceiling division trick: (b + k - 1) / k
- Early exit optimization: stop if time exceeds h.

## Solved
Self
