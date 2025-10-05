## 1. Variables in Java

A **variable** in Java is a container that holds data during program execution. Each variable has a **type** that determines what kind of data it can store (e.g., int, double, String).

## 2. Variable Naming Rules in Java

- Must begin with a letter (a–z, A–Z), dollar sign `$`, or underscore `_`.
- Cannot begin with a digit.
- Can contain letters, digits, `$`, or `_`.
- Cannot be a Java reserved keyword.
- Naming conventions:
  - Use **camelCase** for variable names: `myVariable`.
  - Use meaningful names reflecting the purpose of the variable.
  
**Examples:**
```java
int age;
double salary;
String firstName;
int _count;
int $value;
````

# Java Keywords

**Keywords** are reserved words in Java that have a special meaning.  

- They **cannot be used** as variable names, class names, or identifiers.  
- They are predefined in the Java language.

## Variable Types 

# Java Variables: Local, Instance, and Class (Static) Variables


## 1. Local Variables

- **Declared inside a method, constructor, or block.**
- **Scope:** Only exists inside that method/block.
- **Lifetime:** Exists only while the method is executing.
- **Initialization:** Not initialized automatically; you must assign a value before using.

**Example:**
```java
public class Example {
    public void showLocal() {
        int x = 10; // local variable
        System.out.println("Local variable x: " + x);
    }

    public static void main(String[] args) {
        Example obj = new Example();
        obj.showLocal();
        // System.out.println(x); // ❌ Error: x is not visible here
    }
}
````


✅ **Key point:** Local variables are temporary; they disappear when the method finishes.

---

## 2. Instance Variables

- **Declared inside a class but outside any method, constructor, or block.**
- **Scope:** Belongs to the object of the class.
- **Lifetime:** Exists as long as the object exists.
- **Default values:** Initialized automatically (e.g., `int = 0`, `boolean = false`, `Object = null`).

**Example:**
```java
public class Example {
    int number; // instance variable

    public void showInstance() {
        number = 25;
        System.out.println("Instance variable number: " + number);
    }

    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();

        obj1.showInstance(); // prints 25
        obj2.showInstance(); // prints 25, separate copy for obj2
    }
}

````


## 3. Class (Static) Variables

- **Declared with the `static` keyword inside a class but outside methods.**
- **Scope:** Belongs to the class itself, not to any object.
- **Lifetime:** Exists as long as the program runs.
- **Shared:** Shared across all objects of the class.

**Example:**
```java
public class Example {
    static int count = 0; // static variable

    public void increment() {
        count++;
    }

    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();

        obj1.increment();
        obj2.increment();

        System.out.println("Static variable count: " + Example.count); // prints 2
    }
}
````


---

## Quick Comparison Table

| Feature                 | Local Variable        | Instance Variable       | Class (Static) Variable |
|-------------------------|--------------------|-----------------------|------------------------|
| **Declared in**          | Method/block       | Class (outside methods)| Class (outside methods)|
| **Scope**                | Inside method/block| Object                | Whole class            |
| **Lifetime**             | Method execution   | Object lifetime       | Program lifetime       |
| **Default value**        | ❌ No              | ✅ Yes                 | ✅ Yes                  |
| **Shared across objects**| ❌ No              | ❌ No                  | ✅ Yes                  |
