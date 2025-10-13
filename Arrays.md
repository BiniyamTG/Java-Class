# Mastering Java Arrays (From Zero to Hero)

## Learning Goals

By the end of this lesson, you’ll be able to:

- Understand what an **array** is and why we use it.
- Create, initialize, and use arrays in Java.
- Loop through arrays using **for** and **enhanced for** loops.
- Pass arrays to methods.
- Work with **multi-dimensional arrays** (like tables).

---

## 🧩 1. What Is an Array?

### 🧠 Definition
An **array** is a **collection of similar data types** — think of it like a **box with numbered compartments**, where each compartment stores one value of the same type (like all integers or all strings).

In Java, arrays are:

- **Homogeneous** → they store only one type of data.  
- **Indexed** → every element has a position number (starting at 0).  
- **Fixed size** → once created, their size can’t change.

### Real-life Example

Imagine you’re a teacher with 5 students, and you want to store their ages:

```

23, 20, 33, 31, 25

````

You could create 5 separate variables:

```java
int age1 = 23;
int age2 = 20;
int age3 = 33;
int age4 = 31;
int age5 = 25;
````

❌ That’s messy and hard to manage.
✅ Instead, use **one array**:

```java
int[] ageOfStudents = {23, 20, 33, 31, 25};
```

Accessing elements:

```java
ageOfStudents[0]; // 23
ageOfStudents[1]; // 20
```

---

## 2. Declaring Arrays

### Syntax

```java
int[] numbers;     // Recommended (modern way)
int numbers[];     // Also valid (older C-style)
```

> “Hey Java, I’ll create an array that stores integers — I’ll tell you the size later.”

---

## 3. Initializing Arrays

You can initialize an array in two main ways:

### A. Specify the size

```java
int[] marks = new int[5];
```

* Creates space for **5 integers**.
* Each element gets a **default value** of `0`.

### B. Give values directly

```java
int[] marks = {50, 60, 70, 80, 90};
```

Automatically creates an array of size 5.

---

## 4. Accessing Elements

```
Index:   0   1   2   3   4
Values: 23  20  33  31  25
```

Access an element:

```java
System.out.println(ageOfStudents[0]); // prints 23
```

Change a value:

```java
ageOfStudents[2] = 40; // changes 33 → 40
```

---

## 5. Looping Through Arrays

### A. Using a Normal For Loop

```java
int[] ages = {23, 20, 33, 31, 25};

for (int i = 0; i < ages.length; i++) {
    System.out.println("Age at index " + i + ": " + ages[i]);
}
```

👉 `ages.length` gives the total number of elements.

### B. Using Enhanced For Loop (For-Each)

```java
int[] studentMarks = {67, 78, 80, 95, 55, 77};

for (int mark : studentMarks) {
    System.out.println(mark);
}
```

It automatically goes through every element — no need for indexes!

---

## 6. Example: Average Marks of Students

```java
public class AverageMarks {
    public static void main(String[] args) {
        double[] studentMarks = {67, 78, 80, 95, 55, 77, 56};
        double sum = 0;

        for (double mark : studentMarks) {
            sum += mark;
        }

        double average = sum / studentMarks.length;
        System.out.println("Average marks: " + average);
    }
}
```

**How it works:**

1. Loop adds up all marks → total stored in `sum`.
2. Divide by number of students to get average.

---

## 7. Passing Arrays to Methods

```java
public class TestArray {
    public static void main(String[] args) {
        double[] studentMarks = {67.2, 78.4, 80.0, 95.0, 55.0, 77.0};
        calcTotal(studentMarks); // pass array to method
    }

    public static void calcTotal(double[] marks) {
        double total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        System.out.println("Total marks: " + total);
    }
}
```

✅ **Key idea:** Arrays are *reference types* → the method receives a **reference** to the same array.

---

## 8. Multi-Dimensional Arrays

Sometimes you need data in **rows and columns** (like tables or grids).

### 🧠 Example: Student Marks in 3 subjects

| Student | Physics | Chemistry | Maths |
| ------- | ------- | --------- | ----- |
| 1       | 50      | 65        | 70    |
| 2       | 55      | 68        | 75    |
| 3       | 57      | 61        | 78    |

Represent this using a 2D array:

```java
int[][] marks = {
    {50, 65, 70},
    {55, 68, 75},
    {57, 61, 78}
};
```

### Printing It

```java
for (int i = 0; i < marks.length; i++) {
    System.out.print("Student " + (i + 1) + ": ");
    for (int j = 0; j < marks[i].length; j++) {
        System.out.print(marks[i][j] + " ");
    }
    System.out.println();
}
```

---

## 9. Real-World Analogy

Think of a **multi-dimensional array** like an **Excel spreadsheet**:

* Rows → represent students.
* Columns → represent subjects.
* Cells → hold marks.

---

## 10. Summary Table

| Concept           | Description                 | Example                        |
| ----------------- | --------------------------- | ------------------------------ |
| Declaration       | Create a variable for array | `int[] arr;`                   |
| Initialization    | Allocate memory             | `arr = new int[5];`            |
| Access            | Get or set values           | `arr[0] = 10;`                 |
| Loop              | Traverse elements           | `for (int x : arr)`            |
| Multi-Dimensional | Rows & Columns              | `int[][] arr = new int[3][3];` |

---

## Exercises

### Exercise 1: Create and Print

Write a program to store the prices of 4 fruits and print each price.
*Hint:* Use `double[]`.

### Exercise 2: Find the Maximum Number

Given an array `{12, 5, 9, 21, 15}`, find and print the largest number.

### Exercise 3: Even Numbers Only

Create an integer array and print only even numbers using a `for-each` loop.






# Java 2D Array: Sum of Elements

---

## 1. The 2D Array Declaration

```java
int[][] marks = {
    {50, 65, 70},
    {55, 68, 75},
    {57, 61, 78}
};
````

* `int[][]` means a **2-dimensional array of integers**.
* You can think of it as a **table** with rows and columns:

| Row | Column 0 | Column 1 | Column 2 |
| --- | -------- | -------- | -------- |
| 0   | 50       | 65       | 70       |
| 1   | 55       | 68       | 75       |
| 2   | 57       | 61       | 78       |

* `marks.length` → gives **number of rows** (3 in this case).
* `marks[i].length` → gives **number of columns in row i** (3 for each row here).

---

## 2. Variable Initialization

```java
int total = 0;
```

* We initialize `total` to `0` because we will **accumulate the sum of all elements** of the 2D array.

---

## 3. Nested For Loops

```java
for (int i = 0; i < marks.length; i++) {          // iterate over rows
    for (int j = 0; j < marks[i].length; j++) {   // iterate over columns
        total += marks[i][j];
    }
}
```

### **Understanding Nested Loops**

**Outer Loop (`i`)**

* `i` goes from `0` to `marks.length - 1`.
* Represents the **row index**.
* Example: `i = 0, 1, 2` (3 rows).

**Inner Loop (`j`)**

* For each row `i`, `j` goes from `0` to `marks[i].length - 1`.
* Represents the **column index**.
* Example: `j = 0, 1, 2` (3 columns).

**Accessing Elements**

* `marks[i][j]` → accesses the element at **row `i` and column `j`**.
* Examples:

  * `marks[0][0]` → 50
  * `marks[0][1]` → 65
  * `marks[2][2]` → 78

**Adding to Total**

```java
total += marks[i][j];
```

* Equivalent to:

```java
total = total + marks[i][j];
```

* Each element of the 2D array is added **one by one** to `total`.

---

## 4. Printing the Result

```java
System.out.println("Total sum of all marks: " + total);
```

* After the loops finish, `total` contains the **sum of all elements** in the 2D array.

**Output:**

```
Total sum of all marks: 579
```

✅ **Calculation step by step:**

* Row 0: 50 + 65 + 70 = 185
* Row 1: 55 + 68 + 75 = 198
* Row 2: 57 + 61 + 78 = 196
* Total: 185 + 198 + 196 = 579

---

## 5. Summary of How It Works

1. A 2D array stores data in **rows and columns**.
2. We use **nested loops** to traverse every element:

   * Outer loop → rows
   * Inner loop → columns
3. Each element is added to a **running total**.
4. Finally, we **print the total sum**.

---

## 6. Extra Exercises You Can Try

* Print the **sum of each row** individually.
* Print the **sum of each column** individually.
* Find the **maximum value** in the 2D array.

```




