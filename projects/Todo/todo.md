## **1. Introduction (0:30 min)**

**Narration:**

> "Hey everyone! Today we’re going to build a simple, yet powerful Todo List app in Java. This app will allow you to add tasks, remove tasks, mark them as done, and even save them to a file so your tasks are saved even when you close the program. By the end of this video, you’ll understand every line of code and how it works."

**Show Demo:**

* Show a running example of the app.
* Add a task, remove a task, mark as done, and exit.

---

## **2. Project Setup (0:30 min)**

**Narration:**

> "First, create a new Java project in your IDE — I’m using Eclipse. Name it `TodoApp`. Then create a new class called `TodoApp`. This is where our main code will go. We will also create a separate class `TodoItem` to represent each task."

**Explain `package TodoApp;`**

* Packages are like folders for organizing your code.

---

## **3. Import Statements (1 min)**

```java
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
```

**Narration:**

* `ArrayList` allows us to store a dynamic list of tasks.
* `Scanner` lets us take input from the user.
* `java.io.*` allows us to save our tasks to a file and load them back.

**Tip:** Compare `ArrayList` to a growing notebook where you can write, remove, and check tasks.

---

## **4. TodoItem Class (3 min)**

```java
class TodoItem implements Serializable {
    private String task;
    private boolean done;
    private int priority; // 1 = High, 2 = Medium, 3 = Low
```

**Explain:**

* Each task is an object of `TodoItem`.
* `Serializable` allows us to save objects to a file.
* `task` is the name of the task, `done` shows if it’s completed, and `priority` shows importance.

**Constructor:**

```java
public TodoItem(String task, int priority) {
    this.task = task;
    this.priority = priority;
    this.done = false;
}
```

* Initializes a task with priority.
* New tasks are **not done by default**.

**Getters:**

* `getTask()`, `isDone()`, `getPriority()` — to access task info.

**Mark Done Method:**

```java
public void markDone() {
    this.done = true;
}
```

* Simple way to mark a task as completed.

**toString() Method:**

```java
@Override
public String toString() {
    String status = done ? "[✔]" : "[ ]";
    String prio = switch (priority) {
        case 1 -> "(High)";
        case 2 -> "(Medium)";
        default -> "(Low)";
    };
    return status + " " + task + " " + prio;
}
```

* Shows the task in a nice format: `[✔] Buy milk (High)`
* Use conditional (`? :`) and `switch` for priority labels.

**Analogy:** “Think of each task as a sticky note with a checkmark and a color tag for priority.”

---

## **5. Main Class and Variables (1 min)**

```java
ArrayList<TodoItem> todoList = loadTodoList();
Scanner scanner = new Scanner(System.in);
```

**Narration:**

* `todoList` stores all tasks.
* `loadTodoList()` loads saved tasks from file.
* `scanner` reads input from the user.

---

## **6. Infinite Loop & Menu (2 min)**

```java
while (true) {
    System.out.println("\n==== Todo List ====");
    ...
```

**Explain Menu:**

* Loop continuously until the user chooses Exit.
* Shows current tasks:

```java
if (todoList.isEmpty()) {
    System.out.println("(no items)");
} else {
    for (int i = 0; i < todoList.size(); i++) {
        System.out.println((i + 1) + ". " + todoList.get(i));
    }
}
```

* `(i + 1)` makes it **user-friendly** (start numbering from 1).

---

## **7. Reading and Validating Input (2 min)**

```java
String line = scanner.nextLine().trim();
if (line.isEmpty()) {
    System.out.println("Please enter a choice.");
    continue;
}
```

* Trim spaces, check empty input.
* Convert input to integer safely:

```java
try {
    choice = Integer.parseInt(line);
} catch (NumberFormatException e) {
    System.out.println("Invalid input — please enter a number.");
    continue;
}
```

**Tip:** Always validate user input to avoid crashes.

---

## **8. Adding a Task (2 min)**

```java
case 1 -> {
    System.out.print("Enter item to add: ");
    String task = scanner.nextLine().trim();
    ...
```

* Ask user for task name.
* Ask for priority (1=High, 2=Medium, 3=Low).
* If input is invalid, set default Low.
* Add task to `todoList` and save.

**Demonstration:** Add 2-3 tasks with different priorities.

---

## **9. Removing a Task (1 min)**

```java
case 2 -> {
    if (todoList.isEmpty()) {
        System.out.println("No items to remove.");
        continue;
    }
    System.out.print("Enter item number to remove: ");
```

* Validate number.
* Remove item from ArrayList.
* Save updated list to file.

**Tip:** Show what happens if the number is invalid.

---

## **10. Mark Task as Done (1 min)**

```java
case 3 -> {
    System.out.print("Enter item number to mark as done: ");
```

* Get item number, mark it as done using `markDone()` method.
* Save updated list.
* Demonstrate with a task marked done.

---

## **11. Exit and Closing (0:30 min)**

```java
case 4 -> {
    System.out.println("Exiting Todo List App.");
    scanner.close();
    return;
}
```

* Close scanner to **prevent memory leaks**.
* Exit app gracefully.

---

## **12. File Save and Load (2 min)**

**Save Method:**

```java
private static void saveTodoList(ArrayList<TodoItem> todoList) {
    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
        out.writeObject(todoList);
    } catch (IOException e) {
        System.out.println("Error saving todo list: " + e.getMessage());
    }
}
```

**Load Method:**

```java
private static ArrayList<TodoItem> loadTodoList() {
    File file = new File(FILE_NAME);
    if (!file.exists()) return new ArrayList<>();
    try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
        return (ArrayList<TodoItem>) in.readObject();
    } catch (IOException | ClassNotFoundException e) {
        System.out.println("Error loading todo list: " + e.getMessage());
        return new ArrayList<>();
    }
}
```

* Saves tasks to a file (`todolist.dat`) for persistence.
* Loads tasks when app starts.

**Analogy:** “Think of it like saving your sticky notes in a drawer — they stay safe even after you leave.”

---

## **13. Recap (1 min)**

* We learned **ArrayList, loops, conditionals, Scanner, file handling, exception handling, and OOP**.
* Created `TodoItem` to organize tasks.
* Added **priority and done status**.
* Persisted tasks using files.

**Tip for Students:** Encourage them to extend this project:

* Add due dates.
* Categorize tasks.
* Build a simple GUI using Swing or JavaFX.

---

## **14. Closing Remarks (0:30 min)**

> "Congrats! You’ve just built a full-featured Todo List app in Java. This is a solid foundation for your Java projects. Try modifying it, adding features, and see how much you can improve it. If you liked this video, don’t forget to like and subscribe!"

---

