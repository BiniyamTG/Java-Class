# **Conditionals and Branching**

---

## **Objectives**

By the end of this topic, you should be able to:

✅ Use `if`, `if-else`, and `switch` statements to make decisions.  
✅ Understand **branching** and **control flow** in Java.  
✅ Apply `break`, `continue`, and `return` in real-life logic.

---

## **Concept: Decision Making in Java**

Java programs often need to **choose** between different actions.  
We use *conditional statements* to make these decisions.

> 💬 Example: “If it’s raining, carry an umbrella. Otherwise, go without it.”

---

## **1️⃣ The If Statement**

Checks **one condition**.  
If it’s true, the code runs; if false, it’s skipped.

**Syntax:**

```java
if (condition) {
   // code if true
}
````

**Example:**

```java
int marks = 70;
if (marks > 65) {
   System.out.println("First division");
}
```

**Real-life analogy:**
“If my grade > 65, I pass with First Division.”

---

### Extra Example

```java
int temperature = 30;
if (temperature > 25) {
   System.out.println("It’s a hot day!");
}
```

**Output:**
`It’s a hot day!`

---

## **2️⃣ If-Else Statement**

👉 Used when there are **two possible paths**.

**Syntax:**

```java
if (condition) {
   // code if true
} else {
   // code if false
}
```

**Example:**

```java
int marks = 50;
if (marks > 65) {
   System.out.println("First division");
} else {
   System.out.println("Second division");
}
```

**Real-life analogy:**
“If it rains, I stay home; else, I go out.”

---

### Try this:

```java
int age = 18;
if (age >= 18) {
   System.out.println("You can vote!");
} else {
   System.out.println("You are not eligible yet.");
}
```

---

## **3️⃣ If-Else-If Ladder**

Used to test **multiple conditions**.

**Syntax:**

```java
if (condition1) {
   // code
} else if (condition2) {
   // code
} else {
   // default
}
```

**Example:**

```java
int marks = 75;
if (marks < 50)
   System.out.println("Fail");
else if (marks < 60)
   System.out.println("D grade");
else if (marks < 70)
   System.out.println("C grade");
else if (marks < 80)
   System.out.println("B grade");
else if (marks < 90)
   System.out.println("A grade");
else
   System.out.println("A+ grade");
```

**Output:**
`B grade`

---

### Teaching Tip

Draw a **decision ladder** diagram showing how Java climbs down conditions until one is true.

---

## **4️⃣ Nested If Statement**

`if` **inside** another `if`.
Used when one decision depends on another.

**Syntax:**

```java
if(condition1) {
   if(condition2) {
      // code
   }
}
```

**Example:**

```java
int age = 25;
int weight = 70;
if (age >= 18) {
   if (weight > 50) {
      System.out.println("You are eligible");
   }
}
```

**Real-life analogy:**
“If you’re an adult AND your weight is healthy, you can donate blood.”

---

## **5️⃣ Switch Statement**

When you have **many choices**, switch is cleaner than `if-else-if`.

**Syntax:**

```java
switch(expression) {
   case value1: // code; break;
   case value2: // code; break;
   ...
   default: // code if no match
}
```

**Example:**

```java
int day = 3;
switch (day) {
   case 1: System.out.println("Monday"); break;
   case 2: System.out.println("Tuesday"); break;
   case 3: System.out.println("Wednesday"); break;
   default: System.out.println("Invalid day");
}
```

**Output:**
`Wednesday`

---

### Real-life analogy:

“If today = 1 → Monday,
= 2 → Tuesday,
= 3 → Wednesday,
else → Invalid.”

---

### Switch with Enum Example

```java
public class SwitchDemo2 {
   public enum Vowel {a, e, i, o, u}

   public static void main(String[] args) {
      for (Vowel v : Vowel.values()) {
         switch (v) {
            case a, e, i, o, u -> System.out.println("'" + v + "' is a vowel");
         }
      }
   }
}
```

---

### Switch with String Example

```java
String name = "Mango";
switch(name) {
   case "Mango": System.out.println("It is a fruit"); break;
   case "Tomato": System.out.println("It is a vegetable"); break;
   case "Coke": System.out.println("It is a drink"); break;
}
```

**Output:**
`It is a fruit`

---

### Switch Without Break Example

```java
String name = "Mango";
switch(name) {
   case "Mango": System.out.println("It is a fruit");
   case "Tomato": System.out.println("It is a vegetable");
   case "Coke": System.out.println("It is a drink");
}
```

**Output:**

```
It is a fruit
It is a vegetable
It is a drink
```

**Lesson:** Without `break`, all cases below the match will execute.

---

## **Branching Control Statements**

Used to change the normal flow of a program.

---

### Break Statement

Stops the loop or switch immediately.

**Example:**

```java
for (int i = 1; i <= 10; i++) {
   if (i == 8)
      break;
   System.out.println(i);
}
```

🧾 **Output:**
Prints numbers 1 to 7.

---

### Continue Statement

Skips one iteration, moves to the next.

**Example:**

```java
for (int i = 1; i <= 10; i++) {
   if (i == 5)
      continue;
   System.out.println(i);
}
```

**Output:**
Skips 5.

**Analogy:**
“Skip number 5 while counting.”

---

### Return Statement

Exits a method and can return a value.

**Example:**

```java
public boolean checkEven(int num) {
   if (num % 2 == 0) {
      System.out.println(num + " is even");
      return true;
   }
   System.out.println(num + " is odd");
   return false;
}
```

**Output:**

```
26 is even
27 is odd
28 is even
```

---

## **Quick Real-Life Scenarios**

| Situation              | Java Concept | Example                     |
| ---------------------- | ------------ | --------------------------- |
| Check if it’s raining  | if           | `if(isRaining) stayHome();` |
| Grade based on marks   | if-else-if   | `if(marks>=90) A+;`         |
| Choose payment method  | switch       | `switch(method)`            |
| Stop on error          | break        | `if(error) break;`          |
| Skip unavailable items | continue     | `if(outOfStock) continue;`  |
| Return from a function | return       | `return result;`            |

---



