# Top K Frequent elements
## Pattern
Array and Hashing + Heap (Priority Queue)
## Key idea
Count the frequency of each number using a HashMap.  
Use a Min Heap of size k to keep track of the k most frequent elements.  
Whenever the heap size exceeds k, remove the smallest frequency.
## Solved
Needed help understanding PriorityQueue and Comparator
## Algorithm
1. Create a HashMap to store number → frequency.
2. Iterate through the array and update the frequency of each number.
3. Create a Min Heap (PriorityQueue) with a comparator based on frequency.
4. Iterate through the map entries.
5. Add each entry to the heap.
6. If heap size becomes greater than k, remove the smallest frequency.
7. Extract the keys from the heap and store them in an integer array.
8. Return the result array.
## Complexity ##
Time - O(nlogk) heap operations  
Space - O(n)
## Learning
Learned how to use PriorityQueue (heap) in Java.  
Also understood how comparators work to define custom ordering
inside the heap based on frequency.
