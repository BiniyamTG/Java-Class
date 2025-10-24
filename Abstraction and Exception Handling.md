## Objectives

After reading this, you’ll understand:

1. **Abstraction** – how to hide unnecessary details and show only what’s needed.
2. **Exception Handling** – how to catch and handle program errors without crashing your code.

---

# 1. Abstraction in Java

---

### What is Abstraction?

**Abstraction** means *showing only what’s important* and *hiding how things work behind the scenes.*

#### Real-world example:

When you send an **email**, you just type your message and click “Send.”
You don’t worry about how the email travels across servers or what protocols it uses.
That’s **abstraction** — you use the feature without caring about the technical details.

---

### Abstraction in Java (Definition)

In Java, abstraction means **hiding implementation details** and **showing only what an object can do** — not *how* it does it.

> Example: You know your car can “start” — you don’t know (or need to know) what happens inside the engine.

---

### ⚙️ How to Achieve Abstraction in Java

There are two main ways:

1. **Abstract Classes**
2. **Interfaces**

---

## Abstract Class

### What is an Abstract Class?

An **abstract class** is like a *half-built blueprint* for other classes.

You define it using the **`abstract`** keyword.

```java
abstract class Animal {
    abstract void sound();  // abstract method
}
```

---

### Important Points

* You **cannot create objects** from an abstract class.
  Example:
  `Animal a = new Animal(); // ❌ Not allowed`
* It can have:

  * **Abstract methods** (without body)
  * **Normal methods** (with body)
* If a class has at least one abstract method → the class **must** be abstract.
* Other classes can **extend** (inherit) it and **implement** its methods.

---

### Abstract Method

An abstract method is only declared — it doesn’t have a body.

```java
abstract void methodName();
```

Example:

```java
abstract class Figure {
    abstract void calcArea(double length);
}
```

---

### Example: Using Abstract Class

```java
abstract class Figure {
    abstract void calcArea(double length);
}

class FigureImpl extends Figure {
    void calcArea(double length) {
        double result = length * length;
        System.out.println("Area of rectangle is: " + result);
    }
}

class MainClass {
    public static void main(String args[]) {
        FigureImpl fimpl = new FigureImpl();
        fimpl.calcArea(25);
    }
}
```

**Output:**

```
Area of rectangle is: 625.0
```

---

### Example: Abstract Class with Normal Method

```java
abstract class A {
    abstract void callme();

    void callmetoo() {
        System.out.println("This is a concrete method");
    }
}

class B extends A {
    void callme() {
        System.out.println("Implementation of callme by class B");
    }
}

class AbstractDemo {
    public static void main(String args[]) {
        B b = new B();
        b.callme();
        b.callmetoo();
    }
}
```

**Output:**

```
Implementation of callme by class B
This is a concrete method
```

---

### Example: Superclass Reference to Subclass Object

```java
abstract class Figure {
    double dim1, dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside area of rectangle");
        return dim1 * dim2;
    }
}

class AbstractAreas {
    public static void main(String args[]) {
        Figure fg = new Rectangle(9, 5);
        System.out.println(fg.area());
    }
}
```

**Output:**

```
Inside area of rectangle
45.0
```

---

## 2. Interface in Java

---

### What is an Interface?

An **interface** is like a **contract** or **blueprint**.
It tells classes *what to do* — but not *how* to do it.

* All methods are **abstract** (no body).
* A class that uses an interface must write code for all its methods.
* Used to achieve **100% abstraction**.

---

### Syntax

```java
interface Animal {
    void eat();
    void travel();
}
```

#### Implementation Example

```java
class MammalInt implements Animal {
    public void eat() {
        System.out.println("Mammal eats");
    }

    public void travel() {
        System.out.println("Mammal travels");
    }

    public static void main(String args[]) {
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
    }
}
```

**Output:**

```
Mammal eats
Mammal travels
```

---

### Abstract Class vs Interface

| Feature                  | Abstract Class             | Interface                    |
| ------------------------ | -------------------------- | ---------------------------- |
| **Methods**              | Can have abstract + normal | Only abstract (till Java 7)  |
| **Variables**            | Can be any type            | Always `public static final` |
| **Multiple Inheritance** | Not allowed                | Allowed                      |
| **Constructor**          | Can have                   | Cannot have                  |
| **Access Modifiers**     | Can vary                   | Always public                |
| **Keyword**              | `extends`                  | `implements`                 |

---

# 3. Exception Handling in Java

---

### What is an Exception?

An **exception** is an error that happens while your program is running.
If not handled, it can crash your program.

**Exception Handling** lets you deal with these errors *gracefully.*

---

### Common Causes of Exceptions

* Dividing by zero
* Invalid user input
* File not found
* Network failure
* Array out of range

---

### Types of Exceptions

1. **Checked Exceptions (Compile-time):**

   * Detected during compilation.
   * Must be handled using try-catch or `throws`.
   * Example: `IOException`, `FileNotFoundException`

2. **Unchecked Exceptions (Runtime):**

   * Detected while running the program.
   * Example: `NullPointerException`, `ArrayIndexOutOfBoundsException`

3. **Errors:**

   * Serious system problems (not fixable in code).
   * Example: `OutOfMemoryError`, `StackOverflowError`

---

### Exception Hierarchy

```
Throwable
   ├── Error
   └── Exception
        ├── IOException (Checked)
        └── RuntimeException (Unchecked)
```

---

### Example: Try-Catch

```java
public class Test {
    public static void main(String args[]) {
        int a[] = new int[2];
        try {
            System.out.println("Access element three: " + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " + e);
        }
        System.out.println("Out of the block");
    }
}
```

**Output:**

```
Exception thrown: java.lang.ArrayIndexOutOfBoundsException: 3
Out of the block
```

---

### throw and throws Keywords

* **throw** → used to manually throw an exception.
* **throws** → tells that a method might throw an exception.

Example:

```java
public void deposit(double amount) throws IOException {
    if(amount < 0)
        throw new IOException("Invalid Amount");
}
```

---

### finally Block

The **finally** block always runs — whether there’s an exception or not.
Used for cleanup (like closing files or connections).

```java
public class ExcepTest {
    public static void main(String args[]) {
        int a[] = new int[2];
        try {
            System.out.println("Access element three :" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
        } finally {
            a[0] = 6;
            System.out.println("First element value: " + a[0]);
            System.out.println("The finally statement is executed");
        }
    }
}
```

**Output:**

```
Exception thrown: java.lang.ArrayIndexOutOfBoundsException: 3
First element value: 6
The finally statement is executed
```

---

# Summary

| Concept                 | Meaning                                                           |
| ----------------------- | ----------------------------------------------------------------- |
| **Abstraction**         | Hiding complex details, showing only what’s necessary             |
| **Abstract Class**      | Can have abstract + normal methods; cannot create objects from it |
| **Interface**           | 100% abstraction; all methods are abstract                        |
| **Exception**           | An error during program execution                                 |
| **Checked Exception**   | Detected at compile-time                                          |
| **Unchecked Exception** | Happens at runtime                                                |
| **Error**               | Serious problem, can’t usually be handled                         |
| **try-catch-finally**   | Mechanism for safe error handling                                 |

---

