## 🧱 PART 1: Java `if` Statement

### 💡 Concept
The `if` statement checks a **condition** (true/false).  
If the condition is **true**, the code inside the `if` block runs.  
If it’s **false**, Java skips that block.

### 🧩 Example
```java
public class Example1 {
  public static void main(String[] args) {
    int age = 20;
    if (age >= 18) {
      System.out.println("You are an adult.");
    }
    System.out.println("End of program.");
  }
}
```
🔍 Output
sql
Copy code
You are an adult.
End of program.
🧩 Exercise 1
Write a program that checks whether a number is even.
If it is even, print "The number is even."

💡 Hint: Use number % 2 == 0.

🧱 PART 2: Java if...else Statement
💡 Concept
Use this when you want the program to choose between two options.

🧩 Example
java
Copy code
public class Example2 {
  public static void main(String[] args) {
    int temp = 25;
    if (temp > 30) {
      System.out.println("It's hot outside.");
    } else {
      System.out.println("It's not hot outside.");
    }
  }
}
🔍 Output
rust
Copy code
It's not hot outside.
🧩 Exercise 2
Write a program that checks if a person is eligible to vote.

Conditions:

If age ≥ 18 → print "You can vote."

Else → print "You are too young to vote."

💡 Hint: Use Scanner to input the age.

🧱 PART 3: Java if...else if...else Ladder
💡 Concept
Use this for multiple conditions.
Only the first true condition will execute.

🧩 Example
java
Copy code
public class Example3 {
  public static void main(String[] args) {
    int score = 82;
    if (score >= 90) {
      System.out.println("Grade A");
    } else if (score >= 75) {
      System.out.println("Grade B");
    } else if (score >= 65) {
      System.out.println("Grade C");
    } else {
      System.out.println("Fail");
    }
  }
}
🔍 Output
css
Copy code
Grade B
🧩 Exercise 3
Write a program that assigns grades:

90–100 → A

75–89 → B

65–74 → C

Below 65 → F

💡 Hint: Test with several values like 95, 77, and 63.

🧱 PART 4: Nested if...else
💡 Concept
You can place an if statement inside another to check deeper conditions.

🧩 Example
java
Copy code
public class Example4 {
  public static void main(String[] args) {
    int num = 10;
    if (num >= 0) {
      if (num == 0) {
        System.out.println("Zero");
      } else {
        System.out.println("Positive");
      }
    } else {
      System.out.println("Negative");
    }
  }
}
🔍 Output
mathematica
Copy code
Positive
🧩 Exercise 4
Write a program that finds the largest of three numbers using nested if...else.

💡 Hint: Compare num1 with num2, then with num3.

🧱 PART 5: break Statement
💡 Concept
The break statement stops a loop immediately, even if the condition is still true.

🧩 Example
java
Copy code
public class Example5 {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      if (i == 5) {
        break;
      }
      System.out.println(i);
    }
  }
}
🔍 Output
Copy code
1
2
3
4
🧩 Exercise 5
Write a program that asks for numbers repeatedly.
If the user enters a negative number, stop the loop and print the sum of all positive numbers.

💡 Hint: Use while (true) and break when number < 0.

🧱 PART 6: continue Statement
💡 Concept
The continue statement skips the current loop iteration and goes to the next one.

🧩 Example
java
Copy code
public class Example6 {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        continue; // skip even numbers
      }
      System.out.println(i);
    }
  }
}
🔍 Output
Copy code
1
3
5
7
9
🧩 Exercise 6
Ask the user to input 5 numbers.
If the number is negative, skip it.
After the loop, print the sum of positive numbers.

💡 Hint: Use continue to skip negatives.

🧱 PART 7: Bonus Challenge 🌟
💡 Challenge Task
Combine everything you’ve learned!

Create a program that:

Takes the user’s score as input.

Uses if...else if...else to print the grade (A, B, C, F).

If the score is invalid (less than 0 or greater than 100), print "Invalid score" and stop using break.

If the score is 0, skip printing the grade using continue.

Allow the user to enter multiple scores using a for loop.

🧰 Practice Notes
Use these tips while coding:

Write comments explaining why each line exists.

Predict output before running your program.

Run your code with different inputs.

Observe how break and continue change flow.
