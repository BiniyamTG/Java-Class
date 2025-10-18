## **Objectives**

By the end of this note, you will understand:

- **Access Modifiers** in Java  
- **Packages** and how to use them  
- **OOP Principles:**
  - Encapsulation  
  - Inheritance  
  - Polymorphism  
  - Abstraction  
- **Class**, **Method**, and **Constructor** basics  



## **Access Modifiers in Java**

### What Are Modifiers?

- **Modifiers** define **how classes, methods, or variables are accessed**.  
- **Two types:**
  1. **Access Modifiers:** Control visibility  
  2. **Non-access Modifiers:** Add other properties (e.g., `static`, `final`, `abstract`)

---

### **Types of Access Modifiers**

| Modifier | Within Class | Within Package | Outside Package (Subclass) | Outside Package |
|-----------|---------------|----------------|-----------------------------|-----------------|
| **private** | ✅ | ❌ | ❌ | ❌ |
| **default** *(no keyword)* | ✅ | ✅ | ❌ | ❌ |
| **protected** | ✅ | ✅ | ✅ | ❌ |
| **public** | ✅ | ✅ | ✅ | ✅ |

---

### **Quick Tips**

- Use **private** for **data hiding**.  
- Use **public** for **methods** you want accessible everywhere.  
- Use **protected** when working with **inheritance**.  
- No modifier = **package-private** (default).  

---

## 📦 **Java Packages**

### 🧱 Definition

A **package** is a collection of related **classes, interfaces, and sub-packages**.

### 📂 Types

1. **Built-in packages:** e.g. `java.lang`, `java.util`, `java.io`, `java.sql`  
2. **User-defined packages:** custom packages created by developers.  

---

### 🌟 **Advantages**

1. Organizes code → easier maintenance  
2. Prevents naming conflicts  
3. Provides access control  

---

### 🧭 **How to Access Packages**

1. `import package.*;` → imports all classes in the package  
2. `import package.ClassName;` → imports only one class  
3. **Fully Qualified Name:** use full path (no import required)

```java
java.util.Date date = new java.util.Date();
````

---

## **Object-Oriented Programming (OOP) Principles**

---

### **Abstraction**

**Definition:** Hiding complex details and showing only essential features.

**Achieved by:**

* `abstract` classes
* `interfaces`

**Example (Car Analogy):**

* Driver uses **steering** and **pedals** but doesn’t see engine details → **internal logic is hidden**.

---

### **Encapsulation**

**Definition:** Binding data (variables) and code (methods) together and restricting direct access to data.

**How:**

* Use **private** for variables
* Use **public getters/setters** for access

```java
public class MyClass {
  private int age = 25;
  private int salary = 3000;

  public int getAge() { return age; }
  public int getSalary() { return salary; }
}
```

**Advantages:**

* Data hiding
* Controlled access
* Easier testing
* Can make class **read-only** or **write-only**

---

### **Inheritance**

**Definition:** A class **inherits** properties and behavior from another class.

**Keyword:** `extends`

**Purpose:**

* Code reusability
* Hierarchical relationships

**Example:**

```java
class Employee {}
class Faculty extends Employee {}
class Teacher extends Faculty {}
```

Relationship:
`Teacher → Faculty → Employee`

---

### 🧩 **Polymorphism**

**Definition:** One interface, many methods.
Same method name, different parameters (method overloading).

```java
public class MultiplyClass {
  public int multiply(int a, int b) {
    return a * b;
  }

  public double multiply(double a, double b) {
    return a * b;
  }
}
```

**Example Output:**

```java
MultiplyClass m = new MultiplyClass();
System.out.println(m.multiply(2, 4));     // 8
System.out.println(m.multiply(5.6, 3.5)); // 19.6
```

---

## **Classes and Objects**

### **Definition**

* **Class** → Template/blueprint for objects.
* **Object** → Instance of a class.

**Structure:**

```java
class Box {
  double width;
  double height;
  double depth;
}
```

**Create Object:**

```java
Box mybox = new Box();
mybox.width = 10;
mybox.height = 20;
mybox.depth = 15;
```

---

### **Calculating Volume Example**

```java
public class BoxClass {
  public static void main(String[] args) {
    Box mybox = new Box();
    mybox.width = 10;
    mybox.height = 20;
    mybox.depth = 30;
    double volume = mybox.width * mybox.height * mybox.depth;
    System.out.println("Volume of box: " + volume);
  }
}
```

---

## **Methods**

**Definition:** A block of code that performs a specific task.

**Syntax:**

```java
returnType methodName(parameterList) {
  // body
  return value;
}
```

**Example:**

```java
public int addNumbers(int a, int b) {
  return a + b;
}
```

### **Void vs Return**

* **void** → no value returned
* **non-void** → must use `return` keyword

---

### **Method with Parameters**

```java
public double calcVolume(double w, double h, double d) {
  return w * h * d;
}
```

```java
Box mybox = new Box();
double v = mybox.calcVolume(10, 20, 30);
System.out.println("Volume: " + v);
```

---

### **Return Type Rule**

Return type must match the declared method type:

```java
double volume() {
  double resultVal = width * height * depth;
  return resultVal; // ✅ Correct
}
```

---

## **Constructors**

**Definition:** Special methods used to **initialize objects**.

**Rules:**

* Same name as class
* No return type
* Automatically called on object creation

**Example:**

```java
class Box {
  double width, height, depth;

  Box() {
    width = 5;
    height = 10;
    depth = 3;
  }

  double volume() {
    return width * height * depth;
  }
}
```

```java
Box b1 = new Box();
System.out.println(b1.volume()); // Uses initialized values
```

---

## 🧭 **Tips to Remember**

| Concept       | Keyword                 | Purpose                |
| ------------- | ----------------------- | ---------------------- |
| Encapsulation | `private`, `public`     | Data protection        |
| Inheritance   | `extends`               | Code reuse             |
| Polymorphism  | `method overloading`    | One name, many actions |
| Abstraction   | `abstract`, `interface` | Hide complexity        |
| Constructor   | `class name`            | Object initialization  |

---

## **Real-World Analogy**

| Java Concept      | Analogy                                           |
| ----------------- | ------------------------------------------------- |
| **Class**         | Blueprint of a house                              |
| **Object**        | Actual house built from blueprint                 |
| **Constructor**   | Builder setting default dimensions                |
| **Encapsulation** | Locked door hiding internals                      |
| **Abstraction**   | Car interface (steering, pedals) hiding mechanics |
| **Inheritance**   | Family traits passed from parent to child         |
| **Polymorphism**  | One remote controlling multiple devices           |




Would you like me to make it **visually enhanced** (with color-coded code blocks and emojis styled for Notion or GitHub dark mode)?
```
