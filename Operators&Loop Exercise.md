# Java Practice Exercises: Operators, Expressions, Statements, and Loops

---

## Conceptual Exercises

1. **Explain in your own words:**
   What is the difference between an *expression* and a *statement* in Java?

2. **Predict the Output:**

   ```java
   int x = 5;
   int y = ++x * 2 + x--;
   System.out.println(y);
   ```

   > Think about operator precedence and side effects.

3. **True or False:**
   a) Every Java statement must end with a semicolon.
   b) A block can contain multiple expressions but counts as one statement.
   c) The `++` operator can only be used in loops.

4. **Explain:**
   What’s the difference between `x++` and `++x`?
   When does each increment take effect?

---

## Practical Coding Exercises

### 1. Arithmetic Challenge

```java
int a = 10, b = 3;
System.out.println(a / b);
System.out.println((double)a / b);
```

* Why do the two outputs differ?
* What’s happening behind the scenes with data types?

---

### 2. Conditional Logic

Write a program that checks if a number is:

* divisible by 3 and 5
* divisible by only one of them
* divisible by neither

```java
int num = 15; // Try different values
// Your code here
```

---

### 3. While Loop Practice

Write a program using a `while` loop to print numbers from 1 to 10 **but skip** the number 5.

---

### 4. For Loop Pattern

Use a `for` loop to print the following pattern:

```
*
**
***
****
*****
```

---

### 5. Break & Continue

Create a loop from 1 to 10:

* Skip even numbers.
* Stop the loop entirely when the number reaches 9.

---

### 6. Nested Loops – Multiplication Table

Write a nested loop to print a 5×5 multiplication table.

---

### 7. Operator Exploration

Use bitwise operators `&`, `|`, and `^` on two numbers (e.g., 6 and 3).
Print the results and explain in comments what happens in binary.

---

### 8. Mini Project: Sum Until Stop

Continuously ask the user for numbers.
Add them up until the user enters `0`.
Then display the total sum.

---

