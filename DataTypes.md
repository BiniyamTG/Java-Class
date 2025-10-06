# Data Types in Java

## 1. Data Types
In Java, a **data type** specifies the size and type of values that can be stored in a variable (identifier). Java has two main categories:

- **Primitive Data Types** – store simple values like numbers, characters, or boolean.
- **Non-Primitive (Reference) Data Types** – store references (addresses) to objects.

---

## 2. Primitive Data Types
Primitive types are the most basic built-in data types in Java.

### a) Integer Types
Used for whole numbers.

| Type  | Size | Range | Default Value | Example |
|-------|------|-------|---------------|---------|
| byte  | 1 B  | -128 to 127 | 0 | `byte b = 10;` |
| short | 2 B  | -32,768 to 32,767 | 0 | `short s = 11;` |
| int   | 4 B  | -2,147,483,648 to 2,147,483,647 | 0 | `int i = 10;` |
| long  | 8 B  | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 | 0 | `long l = 100012;` |

**Example:**
```java
public class Demo {
    public static void main(String[] args) {
        byte b = 20;
        short s = 20;
        int i = 20;
        long l = 20;
        System.out.println(b + ", " + s + ", " + i + ", " + l);
    }
}

```

### b) Floating-point Types
Used for decimal numbers.

| Type   | Size | Default Value | Example |
|--------|------|---------------|---------|
| float  | 4 B  | 0.0f          | `float f = 10.3f;` |
| double | 8 B  | 0.0d          | `double d = 11.123;` |

**Example:**
```java
public class Demo {
    public static void main(String[] args) {
        float f = 20.25f;
        double d = 20.25;
        System.out.println(f + ", " + d);
    }
}

```
### c) Character Type
| Type | Size | Range | Example |
|------|------|-------|---------|
| char | 2 B  | 0 to 65,535 (Unicode) | `char c = 'a';` |

**Example:**
```java
public class Demo {
    public static void main(String[] args) {
        char ch = 'S';
        char ch2 = '&';
        System.out.println(ch + ", " + ch2);
    }
}
```

### d) Boolean Type
Represents `true` or `false` values.

| Type    | Default Value | Example |
|---------|---------------|---------|
| boolean | false         | `boolean b = true;` |

**Example:**
```java
public class Demo {
    public static void main(String[] args) {
        boolean t = true;
        boolean f = false;
        System.out.println(t + ", " + f);
    }
}
```

## 3. Reference (Non-Primitive) Data Types
Used to store references to objects.

Examples include **Strings, Arrays, Classes, and Interfaces**.  
A reference variable points to the memory address of an object rather than holding the actual value.

**Example:**
```java
String str = "Hello World";
System.out.println(str);
```

Here, `str` is a reference variable pointing to a String object.

---

## 4. Type Casting in Java
Type casting is converting one data type into another.

### a) Widening (Automatic) Type Conversion
- Converts a smaller type to a larger type.
- Done automatically by Java.

**Examples:** `byte → short → int → long → float → double`

```java
int i = 100;
double d = i; // automatic conversion

```

### b) Narrowing (Explicit) Type Conversion
- Converts a larger type to a smaller type.
- Requires explicit casting by the programmer.

```java
double d = 100.5;
int i = (int) d; // explicit conversion

```

