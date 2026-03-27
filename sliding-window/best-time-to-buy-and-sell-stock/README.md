## Problem Name  
Best Time to Buy and Sell Stock

---

## Pattern  
Sliding Window / Greedy

---

## Key Idea  
Instead of checking all possible buy-sell pairs O(n²), keep track of the **minimum price seen so far** and calculate profit at each step.

This avoids re-computation and allows solving the problem in one pass.

---

## ⚙️ Algorithm  
1. Initialize:
   - `minPrice = prices[0]`
   - `maxProfit = 0`

2. Iterate through the array:
   - Update `minPrice = min(minPrice, prices[i])`
   - Calculate profit = `prices[i] - minPrice`
   - Update `maxProfit = max(maxProfit, profit)`

3. Return `maxProfit`

---

## Complexity  
- **Time:** O(n)  
- **Space:** O(1)

---

## Important Notes
- Always update `minPrice` before computing profit  

---

## Solved  
Hint
