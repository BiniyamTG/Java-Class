# **Operators, Expressions, Statements, and Loops**

## **Objectives**

By the end of this lesson, you will:

✅ Understand how **operators** form the core of computation in Java.  
✅ Learn how **expressions**, **statements**, and **blocks** shape program flow.  
✅ Master **control statements** that give life to your logic.  
✅ Command the power of **loops** to automate repetition efficiently and elegantly.


## **1. Operators is The Building Blocks of Logic**

### Concept

Operators are **symbols that tell Java to perform specific operations** on data.  
If variables are *nouns*, operators are *verbs* — they describe the action.

Example:

```java
a + b
````

Here:

* `a`, `b` → operands (values on which the action is performed)
* `+` → operator (the action to perform)
* `a + b` → expression (complete action producing a result)

> In short:
> **Operands = what**, **Operator = how**, **Expression = result of how applied to what**

---

### **Families of Operators in Java**

| Type       | What It Does               | Common Examples    |              |    |
| ---------- | -------------------------- | ------------------ | ------------ | -- |
| Arithmetic | Math operations            | `+ - * / %`        |              |    |
| Unary      | Act on one operand         | `++ -- ! ~`        |              |    |
| Relational | Compare values             | `== != > < >= <=`  |              |    |
| Logical    | Combine boolean conditions | `&&                |              | !` |
| Assignment | Assign or update variables | `= += -= *= /= %=` |              |    |
| Bitwise    | Work on bits directly      | `&                 | ^ << >> >>>` |    |
| Ternary    | Short-hand if-else         | `? :`              |              |    |

---

### **Operator Precedence (The Rule of Who Comes First)**

Just like math, Java follows strict rules about *which operations happen first*.

| Precedence Level | Category       | Operators               | Associativity |              |              |
| ---------------- | -------------- | ----------------------- | ------------- | ------------ | ------------ |
| 1                | Postfix        | `expr++ expr--`         | Left → Right  |              |              |
| 2                | Unary          | `++expr --expr + - ~ !` | Right → Left  |              |              |
| 3                | Multiplicative | `* / %`                 | Left → Right  |              |              |
| 4                | Additive       | `+ -`                   | Left → Right  |              |              |
| 5                | Shift          | `<< >> >>>`             | Left → Right  |              |              |
| 6                | Relational     | `< > <= >= instanceof`  | Left → Right  |              |              |
| 7                | Equality       | `== !=`                 | Left → Right  |              |              |
| 8                | Bitwise AND    | `&`                     | Left → Right  |              |              |
| 9                | Bitwise XOR    | `^`                     | Left → Right  |              |              |
| 10               | Bitwise OR     | `                       | `             | Left → Right |              |
| 11               | Logical AND    | `&&`                    | Left → Right  |              |              |
| 12               | Logical OR     | `                       |               | `            | Left → Right |
| 13               | Ternary        | `? :`                   | Right → Left  |              |              |
| 14               | Assignment     | `= += -= *= /= %= &= ^= | = <<= >>=`    | Right → Left |              |

**Tip:**
If you’re unsure, always use **parentheses** to make order explicit.
Good code *reads clearly*, not just *executes correctly*.

---

## **Arithmetic Operators**

Arithmetic operators perform fundamental mathematical operations.

| Operator | Meaning             | Example | Output (if a=10, b=3) |
| -------- | ------------------- | ------- | --------------------- |
| `+`      | Addition            | `a + b` | 13                    |
| `-`      | Subtraction         | `a - b` | 7                     |
| `*`      | Multiplication      | `a * b` | 30                    |
| `/`      | Division (integer)  | `a / b` | 3                     |
| `%`      | Modulus (remainder) | `a % b` | 1                     |

---

### Prefix vs Postfix Increment

| Expression | Meaning              | When Value Changes |
| ---------- | -------------------- | ------------------ |
| `++a`      | Increment *then* use | Immediately        |
| `a++`      | Use *then* increment | After expression   |

```java
int a = 5;
System.out.println(++a); // 6
System.out.println(a++); // 6 (then becomes 7)
```

> Think of `++a` as “preparing first, then showing.”
> And `a++` as “showing first, then preparing.”

---

### Example

```java
class ArithmeticDemo {
    public static void main(String[] args) {
        int a = 10, b = 2, c;
        c = a + b;  System.out.println("Addition: " + c);
        c = a - b;  System.out.println("Subtraction: " + c);
        c = a * b;  System.out.println("Multiplication: " + c);
        c = a / b;  System.out.println("Division: " + c);
        c = a % b;  System.out.println("Remainder: " + c);
    }
}
```
**Analogy:** Arithmetic operators are the calculator buttons Java presses for you.

---

## **Relational Operators**

Used to compare two values.
They **always return `true` or `false`.**

| Operator | Description      | Example  | Result (if a=5, b=10) |
| -------- | ---------------- | -------- | --------------------- |
| `==`     | Equal to         | `a == b` | false                 |
| `!=`     | Not equal        | `a != b` | true                  |
| `>`      | Greater than     | `a > b`  | false                 |
| `<`      | Less than        | `a < b`  | true                  |
| `>=`     | Greater or equal | `a >= b` | false                 |
| `<=`     | Less or equal    | `a <= b` | true                  |

---

```java
class RelationalDemo {
    public static void main(String[] args) {
        int a = 40, b = 40;
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
    }
}
```

> **Common Bug Alert:** Don’t confuse `=` (assignment) with `==` (comparison).

---

## **Logical Operators**

Used to combine multiple boolean expressions.

| Operator | Meaning | Example       | Result            |      |   |       |                           |
| -------- | ------- | ------------- | ----------------- | ---- | - | ----- | ------------------------- |
| `&&`     | AND     | `a>5 && b<10` | true if both true |      |   |       |                           |
| `        |         | `             | OR                | `a>5 |   | b<10` | true if at least one true |
| `!`      | NOT     | `!(a>5)`      | reverses result   |      |   |       |                           |

---

```java
class LogicalDemo {
    public static void main(String[] args) {
        boolean a = true, b = false;
        System.out.println("a && b: " + (a && b));  // false
        System.out.println("a || b: " + (a || b));  // true
        System.out.println("!a: " + (!a));          // false
    }
}
```

**Think Visually:**

* `&&` → both gates open → flow
* `||` → one gate open → flow
* `!` → reverses the signal

---

## **Assignment Operators**

Assignment operators are like *shorthand containers* for math + assignment together.

| Operator | Meaning             | Example  | Equivalent  |
| -------- | ------------------- | -------- | ----------- |
| `=`      | Assign              | `a = 5`  | —           |
| `+=`     | Add and assign      | `a += 3` | `a = a + 3` |
| `-=`     | Subtract and assign | `a -= 2` | `a = a - 2` |
| `*=`     | Multiply and assign | `a *= 4` | `a = a * 4` |
| `/=`     | Divide and assign   | `a /= 2` | `a = a / 2` |
| `%=`     | Modulus and assign  | `a %= 3` | `a = a % 3` |

---

```java
class AssignmentDemo {
    public static void main(String[] args) {
        int a = 30, b = 10, c;
        c = a + b;
        System.out.println("c = a + b = " + c);
        c += a;
        System.out.println("c += a = " + c);
        c -= a;
        System.out.println("c -= a = " + c);
        c *= a;
        System.out.println("c *= a = " + c);
    }
}
```

**Think of `a += b` as telling Java:** “Add `b` into `a` and keep it there.”

---

## **Ternary Operator**

A compact way to write **if-else**.

**Syntax:**

```java
variable = (condition) ? value_if_true : value_if_false;
```

```java
int age = 18;
String result = (age >= 18) ? "Adult" : "Minor";
System.out.println(result); // Adult
```

*Shortcut for quick decisions without full if-else blocks.*

---

## **Expressions, Statements, and Blocks**

| Concept    | Meaning                     | Example                  |
| ---------- | --------------------------- | ------------------------ |
| Expression | Produces a value            | `a + b`, `x > y`         |
| Statement  | Executes an action          | `System.out.println(x);` |
| Block      | Group of statements in `{}` | `{ int x=10; y=20; }`    |

Every Java program is a **composition** of these three layers.

---

```java
int sum = (num1 + num2) / 2; // expression
sum++;                       // statement
{
    int x = 10;
    System.out.println(x);   // block
}
```

---

## **Control Flow Statements**

These decide **how** your program executes — sequentially, conditionally, or repetitively.

| Category           | Description              | Keywords                      |
| ------------------ | ------------------------ | ----------------------------- |
| Decision-making    | Choose between paths     | `if`, `else`, `switch`        |
| Looping            | Repeat code              | `for`, `while`, `do-while`    |
| Branching          | Jump in flow             | `break`, `continue`, `return` |
| Exception handling | Manage errors gracefully | `try`, `catch`, `finally`     |

---

## **Java Loops Automating Repetition**

> “Computers are fast loops make them useful.”

---

### **While Loop**

Used when **repetition count is unknown** — keeps running *as long as* the condition is true.

```java
int i = 1;
while (i <= 5) {
    System.out.println("Count: " + i);
    i++;
}
```

If condition is false initially → never runs.

---

### 🔁 **Do-While Loop**

Runs **at least once**, because it checks the condition *after* executing.

```java
int i = 1;
do {
    System.out.println("Number: " + i);
    i++;
} while (i <= 5);
```

---

### **For Loop**

Perfect when you **know how many times** you need to repeat.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Iteration " + i);
}
```

🧩 **Flow:**
1️⃣ Initialize → 2️⃣ Check condition → 3️⃣ Execute → 4️⃣ Increment → repeat

---

### **Sum of 1–10**

```java
int sum = 0;
for (int i = 1; i <= 10; i++) {
    sum += i;
}
System.out.println("Sum: " + sum);
```

---

### **Nested Loops — Loops Inside Loops**

```java
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

Output:

```
*
* *
* * *
* * * *
* * * * *
```

---

### **Enhanced For Loop (For-Each Loop)**

Simplifies array traversal.

```java
int[] nums = {1,2,3,4,5};
for (int n : nums) {
    System.out.println(n);
}
```

Cleaner, no counters, and avoids `ArrayIndexOutOfBoundsException`.

---

## 🧩 **Quick Comparison Table**

| Loop Type | Condition Check | Runs At Least Once? | Use Case           |
| --------- | --------------- | ------------------- | ------------------ |
| while     | Before loop     | ❌ No                | Unknown iterations |
| do-while  | After loop      | ✅ Yes               | At least once      |
| for       | Before loop     | ❌ No                | Known iterations   |
| for-each  | Automatic       | ❌ No                | Collections/arrays |

---

## **Pro Tips for Loops**

1. Always make sure the condition **changes** — or it becomes an *infinite loop*.
2. Use **break** to stop early, **continue** to skip current step.
3. Prefer **for-each** for arrays and collections (less chance of bugs).
4. Write loops that are *predictable* and *readable*, not just functional.

---

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue; // skip 3
    System.out.println(i);
}
```

---

## **In One Line:**

> Operators make actions possible.
> Expressions define meaning.
> Statements execute logic.
> Blocks organize code.
> Loops repeat excellence.

---



