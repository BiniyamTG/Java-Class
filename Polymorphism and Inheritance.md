## Objectives

By the end of this guide, you will confidently understand and apply:

1. **Polymorphism** — One interface, many behaviors  
2. **Static Variables & Methods** — Shared data between all objects  
3. **Inheritance** — Reusing and extending existing code

---

## 1. Polymorphism — “Many Forms”

### Definition

Polymorphism (Greek: *poly* = many, *morph* = form) means **performing one action in many different ways**.

In Java, polymorphism allows **a single method name or interface** to behave **differently depending on the object** that’s calling it.

---

### Why It Matters

Polymorphism makes your code:

* **Flexible:** You can add new types without changing existing code.  
* **Maintainable:** Common logic is shared, but behaviors differ.  
* **Readable:** One method name works for multiple cases.

---

### Two Types of Polymorphism

| Type             | When It Happens          | Achieved By            | Example                                |
| ---------------- | ----------------------- | --------------------- | -------------------------------------- |
| **Compile-Time** | Before program runs      | **Method Overloading** | Same method name, different parameters |
| **Run-Time**     | During program execution | **Method Overriding**  | Child class redefines parent method    |

---

### 1.1 Method Overloading

**Definition:**  
When multiple methods in a class have the **same name but different parameter lists**.

Java decides **which version to call** based on:

* Number of parameters  
* Type of parameters  
* Order of parameters  

> ❌ You cannot overload by just changing the **return type**.

---

### Example: Method Overloading

```java
class AreaCalc {
  public double calcArea(int length, int width) {
    return length * width; // rectangle
  }

  public double calcArea(double radius) {
    return 3.14 * radius * radius; // circle
  }
}

public class Main {
  public static void main(String[] args) {
    AreaCalc ar = new AreaCalc();
    System.out.println("Rectangle area: " + ar.calcArea(12, 14));
    System.out.println("Circle area: " + ar.calcArea(10.0));
  }
}
````

**Output**

```
Rectangle area: 168.0
Circle area: 314.0
```

**Analogy:**
Think of “calcArea” like a **universal calculator button**. It knows whether you mean “rectangle” or “circle” from the **inputs** you give.

---

### 1.2 Constructor Overloading

Multiple constructors in the same class let you create objects in **different ways**.

```java
class Box {
  double width, height, depth;

  // Default
  Box() {
    width = 1;
    height = 1;
    depth = 1;
  }

  // Parameterized
  Box(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }

  double volume() {
    return width * height * depth;
  }
}

class DemoBox {
  public static void main(String[] args) {
    Box b1 = new Box(10, 20, 30);
    Box b2 = new Box(); // uses default
    System.out.println("b1 Volume: " + b1.volume());
    System.out.println("b2 Volume: " + b2.volume());
  }
}
```

**Output**

```
b1 Volume: 6000.0
b2 Volume: 1.0
```

**Memory Trick:**
Think of constructor overloading like **multiple “blueprints”** for the same product — you can build it in different sizes.

---

## 2. Static Variables and Methods

### Definition

The `static` keyword means **shared by all objects**.
It belongs to the **class itself**, not individual objects.

---

### Static Variable

* One copy in memory shared by all instances.
* Changes made by one object affect all others.

### Example

```java
class Employee {
  static String company = "TechHub"; // shared
  String name;
  
  Employee(String n) { name = n; }
}

public class StaticDemo {
  public static void main(String[] args) {
    Employee e1 = new Employee("Alice");
    Employee e2 = new Employee("Bob");

    System.out.println(e1.name + " works at " + Employee.company);
    e2.company = "CodeLab"; // affects all
    System.out.println(e1.name + " now works at " + e1.company);
  }
}
```

**Output**

```
Alice works at TechHub
Alice now works at CodeLab
```

**Analogy:**
Think of a static variable like a **shared classroom whiteboard** — all students (objects) see and write on the same board.

---

### Static Method

* Can be called **without creating an object**.
* Can only access **static variables or methods**.

```java
class Utils {
  static int multiply(int a, int b) {
    return a * b;
  }
}

public class StaticMethodDemo {
  public static void main(String[] args) {
    int result = Utils.multiply(5, 6); // no object needed
    System.out.println(result);
  }
}
```

**Output**

```
30
```

**Rule:**
Static methods **cannot access non-static data** directly — they belong to the class, not an instance.

---

## 3. Inheritance

### Definition

Inheritance allows one class (child) to **reuse** the fields and methods of another class (parent).
It represents an **“IS-A”** relationship.

Example:
`Dog` **is a** `Animal`
`Car` **is a** `Vehicle`

---

### Syntax

```java
class Parent {
  void showParent() { System.out.println("Parent method"); }
}

class Child extends Parent {
  void showChild() { System.out.println("Child method"); }
}
```

### Example

```java
class Calculation {
  int z;
  public void addition(int x, int y) {
    z = x + y;
    System.out.println("Sum: " + z);
  }
}

public class My_Calculation extends Calculation {
  public void multiplication(int x, int y) {
    z = x * y;
    System.out.println("Product: " + z);
  }

  public static void main(String[] args) {
    My_Calculation demo = new My_Calculation();
    demo.addition(20, 10); // inherited
    demo.multiplication(20, 10);
  }
}
```

**Output**

```
Sum: 30
Product: 200
```

**Analogy:**
Child inherits traits (fields, methods) from the parent, but can also have **new or customized behaviors**.

---

## 4. Method Overriding (Run-Time Polymorphism)

When a **child class** provides a **new version** of a method that already exists in the **parent class**.

---

### Example

```java
class Animal {
  void sound() { System.out.println("Animal makes sound"); }
}

class Dog extends Animal {
  void sound() { System.out.println("Dog barks"); }
}

public class Test {
  public static void main(String[] args) {
    Animal obj = new Dog();
    obj.sound(); // Dog's version runs
  }
}
```

**Output**

```
Dog barks
```

**Why Important:**
It lets Java decide **at runtime** which version to call — enabling **dynamic behavior**.

---

## 5. The `final` Keyword

| Used With        | Meaning              | Example                  |
| ---------------- | -------------------- | ------------------------ |
| `final variable` | Cannot be changed    | `final int MAX = 100;`   |
| `final method`   | Cannot be overridden | `final void display()`   |
| `final class`    | Cannot be inherited  | `final class Vehicle {}` |

**Analogy:**
“final” means **no more edits allowed** — like locking a file.

---

## 6. The `super` Keyword

Used to **refer to parent class** elements.

### Uses:

1. Call parent **variables**
2. Call parent **methods**
3. Call parent **constructors**

---

### Example 1 — Access Parent Variable

```java
class Animal {
  String color = "white";
}

class Dog extends Animal {
  String color = "black";

  void printColor() {
    System.out.println(color);       // child's color
    System.out.println(super.color); // parent's color
  }
}
```

**Output**

```
black
white
```

---

### Example 2 — Call Parent Constructor

```java
class Animal {
  Animal() {
    System.out.println("Animal created");
  }
}

class Dog extends Animal {
  Dog() {
    super(); // calls parent constructor
    System.out.println("Dog created");
  }
}
```

**Output**

```
Animal created
Dog created
```

---

## 7. Inner Classes

Inner (nested) classes are defined **inside another class** for grouping logically related code.

```java
class Outer {
  int x = 10;

  class Inner {
    int y = 5;
  }
}

public class Main {
  public static void main(String[] args) {
    Outer outer = new Outer();
    Outer.Inner inner = outer.new Inner();
    System.out.println(inner.y + outer.x);
  }
}
```

**Output**

```
15
```

**Analogy:**
An inner class is like a **department** inside a **company** — it exists only inside the larger structure.

---

## Quick Recap Table

| Concept      | Keyword                     | Description                 |
| ------------ | --------------------------- | --------------------------- |
| Polymorphism | `overloading`, `overriding` | One name, many forms        |
| Static       | `static`                    | Shared by all objects       |
| Inheritance  | `extends`                   | Reuse code from parent      |
| Final        | `final`                     | Prevent changes             |
| Super        | `super`                     | Access parent’s data/method |
| Inner Class  | —                           | Class inside another class  |

---

## Analogy Summary

| Concept      | Analogy                                   |
| ------------ | ----------------------------------------- |
| Inheritance  | Family traits passed from parent to child |
| Static       | Shared whiteboard (common for all)        |
| Final        | Locked document (unchangeable)            |
| Polymorphism | One button, many actions                  |
| Super        | “Parent says…” reference                  |
| Inner Class  | Department inside a company               |

---
