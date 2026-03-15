# Longest Consecutive Sequence
## Pattern
Arrays & Hashing
## Key Idea
Sorting would solve this easily, but that would take **O(n log n)** time.  
To achieve **O(n)** time, we store all numbers in a **HashSet** for constant time lookup.  
A number is considered the **start of a sequence** only if:  
num - 1 does not exist in the set.  
This ensures we only start counting sequences from the **first number of that sequence**, preventing repeated work.
## Solved
Hint for detecting sequence start.
## Algorithm
1. Insert all elements into a **HashSet**.
2. Iterate through the numbers.
3. For each number:
   - If `num - 1` is **not in the set**, it means this is the **start of a sequence**.

4. Start counting the sequence:
   - Initialize `current = num`
   - While `current + 1` exists in the set:
     - Move to the next number
     - Increase the sequence length

5. Track the **maximum sequence length** found.
6. Return the maximum length.
## Complexity
Time Complexity: **O(n)**  
Each number is processed at most once during sequence expansion.  
Space Complexity: **O(n)**  
Extra space is used to store numbers in the HashSet.
## Learning
The key optimization is detecting the **start of a sequence**.  
Instead of checking every number repeatedly, we only start counting when:  
num - 1 is not present  
This guarantees each sequence is counted **exactly once**, making the algorithm **O(n)**.
