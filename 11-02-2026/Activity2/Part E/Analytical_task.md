# Part E: Analytical Task – Time Complexity Analysis

## Objective

To analyze the time complexity of basic Stack operations and the Balanced Parentheses checking problem.

---

# Time Complexity Analysis of Stack Operations

## 1. Push Operation

Push operation inserts an element at the top of the stack.

- Operation performed in constant time.
- No traversal is required.

**Time Complexity: O(1)**

---

## 2. Pop Operation

Pop operation removes the top element from the stack.

- The top element is directly accessed and removed.
- No iteration is required.

**Time Complexity: O(1)**

---

## 3. Peek Operation

Peek operation returns the top element without removing it.

- Direct access to the top element.
- No traversal needed.

**Time Complexity: O(1)**

---

## 4. Balanced Parentheses Check

In this problem:

- We traverse the entire expression once.
- Each character is pushed or popped at most one time.

If the expression length is **n**:

- Every character is processed once.

**Time Complexity: O(n)**

---

# Space Complexity

| Operation                      | Space Complexity |
|--------------------------------|------------------|
| Push                           | O(1)             |
| Pop                            | O(1)             |
| Peek                           | O(1)             |
| Balanced Parentheses Check     | O(n)             |

Balanced parentheses requires extra stack space in worst case when all characters are opening brackets.

---

# Conclusion

Stack is a linear data structure that follows the LIFO (Last In First Out) principle. Basic operations like Push, Pop, and Peek are performed in constant time, making stack highly efficient. Stack plays a crucial role in many real-world applications such as recursion, function calls, expression evaluation, balanced parentheses checking, and undo/redo operations. Its simplicity and efficiency make it an important data structure in programming and algorithm design. A strong understanding of stack helps in solving many interview and real-world problems effectively.
