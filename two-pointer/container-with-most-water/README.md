# Container With Most Water

## Pattern  
Two Pointers

## Key Idea  
Water is limited by the smaller height.  
Move the pointer which has smaller height to try finding a better container.

## Algorithm  
- Start with two pointers:
  - left = 0
  - right = n - 1
- While left < right:
  - Calculate area using current left and right
  - Update maximum area
  - Move the pointer with smaller height inward
- Return maximum area

Time Complexity  
O(n)

Space Complexity  
O(1)
