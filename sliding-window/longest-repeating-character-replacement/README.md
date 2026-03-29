# Longest Repeating Character Replacement

## Pattern
Sliding Window (Variable Size)

## Key Idea
We try to build the longest window where we can replace at most `k` characters to make all characters the same.

Instead of tracking which characters to replace, we track:
- The frequency of characters in the current window
- The maximum frequency (`maxFreq`) of any character in the window

The number of replacements needed is:
window size - maxFreq

If this exceeds `k`, we shrink the window.

## Algorithm
1. Initialize:
   - Left pointer `l = 0`
   - Right pointer `r = 0`
   - Frequency map
   - `maxFreq = 0`
   - `maxLength = 0`

2. Iterate with right pointer `r`:
   - Add current character to map
   - Update `maxFreq`

3. Check if window is valid:
   - If `(r - l + 1 - maxFreq) > k`
     - Shrink window from left
     - Decrement frequency of `s[l]`
     - Move `l++`

4. Update maximum length:
   - `maxLength = max(maxLength, r - l + 1)`

5. Return `maxLength`

## Complexity
- Time: O(n)
- Space: O(1) (since only uppercase letters)

## Important Notes
- We do NOT decrease `maxFreq` when shrinking the window
- `maxFreq` may be slightly outdated, but still gives correct result
- We only care about maximum window length, not exact window validity at all times

## Solved
Hint
