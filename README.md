
# Problem 1:
**Requirement:**
Given a string _s_, find the longest palindromic substring in _s_. You may assume that the maximum length of _s_ is 1000.

**Approach:**
1. Receives string input over an API: 
- POST method: http://localhost:8080/api/
- Persist data into h2 database
2. Stores the longest palindrome in provided database
- Dynamic Programming
- Time complexity O(n^2) n = length of input
- Space complexity O(n^2)
3. Retrieves the stored palindrome over an API: 
- GET method: http://localhost:8080/api/{input}

**Test:**
Test by Postman

**Run:**
Run DemoApplication.java as Spring Boot application

# Problem 2:
**Requirement:**
Have the function BinaryReversal(str) take the str parameter being passed, which will be a positive integer, take its binary representation (padded to the nearest N * 8 bits), reverse that string of bits, and then finally return the new reversed string in decimal form. For example: if str is "47" then the binary version of this integer is 101111 but we pad it to be 00101111. Your program should reverse this binary string which then becomes: 11110100 and then finally return the decimal version of this string, which is 244.

**Approach:**
Traverse through the char array of the binary number, using 2 pointers, and swap the element of pointer's index.

**Test:**
Test by JUnit5 

**Run:**
Run App.java as Java project
