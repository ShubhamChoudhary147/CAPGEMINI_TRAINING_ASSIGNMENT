# ACTIVITY 1 – Understanding Stack Operations
## Part A: Conceptual Questions

---

### 1. Define Stack and explain LIFO principle.

A Stack is a linear data structure in which insertion and deletion of elements take place only from one end, called the TOP.

Stack follows the LIFO (Last In First Out) principle.

LIFO means the element inserted last will be removed first.

Example:
Push(10)
Push(20)
Push(30)
Pop() → 30 will be removed first

---

### 2. What is Stack Overflow and Stack Underflow?

Stack Overflow:
Stack Overflow occurs when we try to push an element into a stack that is already full.

Example:
If stack size is 3 and it already contains 3 elements, then pushing another element will cause overflow.

Stack Underflow:
Stack Underflow occurs when we try to pop an element from an empty stack.

Example:
If stack is empty and we perform pop(), it will cause underflow.

---

### 3. Write real-life examples of Stack.

Some real-life examples of Stack are:

- Stack of plates
- Browser Back button
- Undo and Redo operations
- Function calls (Call Stack)
- Stack of books

---

### 4. What is the time complexity of Push and Pop operations?

Push operation: O(1)
Pop operation: O(1)
Peek operation: O(1)

These operations take constant time because only the top element is accessed or modified.
