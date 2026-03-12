# Encode and Decode Strings
## Pattern
String Manipulation - Encoding Design
## Key idea
Use length-prefix encoding to uniquely identify each string.  
Each string is stored as:  
length + "#" + string  
This allows safe decoding even if the string contains special characters.
## Solved
Self
## Algorithm
ENCODE  
1. Iterate through the list of strings.
2. For each string:
   - Append its length.
   - Append a delimiter "#".
   - Append the string itself.
3. Return the encoded string.  
DECODE
1. Iterate through the encoded string.
2. Read characters until "#" to determine the length.
3. Convert the length to integer.
4. Extract substring from (index + 1) to (index + 1 + length).
5. Add substring to result list.
6. Move index to the end of the extracted substring.
7. Repeat until end of string.
## Complexity ##
Time - O(n)  
Space - O(n)
## Learning
Using only a delimiter character is unsafe because the input strings may contain that character.  
Length-prefix encoding guarantees correct decoding regardless of string content.
