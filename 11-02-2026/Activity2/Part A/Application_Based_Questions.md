# ACTIVITY 2 – Advanced Stack Applications

**Subject:** Data Structures  
**Topic:** Stacks | Stack Implementation | Basic Stack Problems  

---

# Objective

To strengthen understanding of Stack by solving real-world and application-based problems using stack implementation.

---

# Part A: Application-Based Questions

## 1. Stack in Function Calls (Call Stack)

When a function is called, its execution details are pushed into memory using a stack.  
When the function completes, it is removed (popped) from the stack.

This mechanism is known as the **Call Stack**.

### Example Flow:

main() → A() → B()

Execution order:
- Push main
- Push A
- Push B
- Pop B
- Pop A
- Pop main

Stack helps in managing recursive function calls efficiently.

---

## 2. Stack in Undo/Redo Operations

Undo and Redo operations use two stacks:

- Undo Stack
- Redo Stack

### Working:
- Perform action → Push into Undo stack
- Undo → Pop from Undo and push into Redo
- Redo → Pop from Redo and push into Undo

Because stack follows LIFO (Last In First Out), it is ideal for this operation.

---

## 3. Stack in Expression Evaluation

Stack is used in:

- Infix to Postfix conversion
- Postfix evaluation
- Balanced parentheses checking

It helps in:
- Maintaining operator precedence
- Correct order of evaluation

---

## 4. Infix vs Prefix vs Postfix

| Type    | Example  | Operator Position |
|----------|----------|------------------|
| Infix    | A + B    | Between operands |
| Prefix   | + A B    | Before operands  |
| Postfix  | A B +    | After operands   |

Postfix expressions are easier for computers to evaluate.

---