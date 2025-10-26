# Java Collections 

---

## **Objectives**

By the end of this note, you’ll understand:

✅ What collections are  
✅ The different types of collections in Java  
✅ How to use List, Set, Queue, and Map  
✅ How to loop (iterate) through data  
✅ The difference between ArrayList, LinkedList, HashSet, TreeSet, etc.

---

## **What Are Collections in Java?**

Imagine you’re a teacher keeping track of your students.  
You can store one student’s name in a variable, like this:

```java
String student = "Abdul";
````

But what if you have **100 students**?
You can’t make 100 variables! That’s why **Collections** exist.

### Definition:

A **Collection** is like a **container** that can **store, organize, and manage a group of objects**.

You can:

* Add new data
* Remove data
* Sort data
* Search data
* Loop through data

---

## **Java Collection Framework**

The **Collection Framework** is like a toolbox.
It has:

* **Interfaces** (the blueprints)
* **Classes** (ready-made tools that implement those blueprints)

---

### Common Interfaces in Java Collections

| Interface | Description                                     | Examples                        |
| --------- | ----------------------------------------------- | ------------------------------- |
| **List**  | Ordered collection (you can store duplicates)   | ArrayList, LinkedList, Vector   |
| **Set**   | Unordered collection (no duplicates allowed)    | HashSet, TreeSet, LinkedHashSet |
| **Queue** | Follows First-In-First-Out (FIFO)               | PriorityQueue, ArrayDeque       |
| **Deque** | Double-ended queue (add/remove from both sides) | ArrayDeque                      |
| **Map**   | Stores data in **key–value pairs**              | HashMap, TreeMap, LinkedHashMap |

---

## **Iterator Interface**

When you want to look at each element one by one (like flipping through cards), you use an **Iterator**.

### Methods of Iterator:

| Method      | What it Does                                                  |
| ----------- | ------------------------------------------------------------- |
| `hasNext()` | Checks if there’s another element. Returns `true` or `false`. |
| `next()`    | Moves to the next element and returns it.                     |
| `remove()`  | Removes the last element returned (rarely used).              |

**Example:**

```java
Iterator it = list.iterator();
while(it.hasNext()) {
  System.out.println(it.next());
}
```

---

## **List Interface**

A **List** is an ordered collection — like a shopping list.
You can add duplicate items and access them by position (index).

### 🔧 Common Classes:

* **ArrayList** – Fast access, slower insertion/deletion
* **LinkedList** – Fast insertion/deletion, slower access
* **Vector** – Like ArrayList but synchronized (thread-safe)
* **Stack** – Works on *Last-In, First-Out (LIFO)* principle

---

### **ArrayList Example**

```java
import java.util.*;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("Abdul");
    names.add("Gani");
    names.add("Abdul");  // duplicates allowed

    System.out.println(names); // [Abdul, Gani, Abdul]
  }
}
```

---

### **LinkedList Example**

```java
import java.util.*;

public class Main {
  public static void main(String[] args) {
    LinkedList<String> cities = new LinkedList<>();
    cities.add("Addis Ababa");
    cities.add("Nairobi");
    cities.add("Cairo");

    System.out.println(cities); // [Addis Ababa, Nairobi, Cairo]
  }
}
```

---

### **Stack Example**

```java
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Stack<Integer> numbers = new Stack<>();
    numbers.push(10);
    numbers.push(20);
    numbers.push(30);

    System.out.println(numbers.peek()); // 30 (top element)
    numbers.pop(); // removes 30
    System.out.println(numbers); // [10, 20]
  }
}
```

---

## **Queue Interface**

A **Queue** works like a line at a store — first come, first served (FIFO).

### 💡 Example using PriorityQueue:

```java
import java.util.*;

public class Main {
  public static void main(String[] args) {
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    queue.add(50);
    queue.add(10);
    queue.add(30);

    System.out.println(queue); // Sorted automatically
  }
}
```

---

##  **Deque Interface**

**Deque** = *Double Ended Queue*.
You can add or remove items from both ends.

### Example using ArrayDeque:

```java
import java.util.*;

public class Main {
  public static void main(String[] args) {
    ArrayDeque<String> deque = new ArrayDeque<>();
    deque.add("Left");
    deque.addLast("Right");
    deque.addFirst("Start");

    System.out.println(deque); // [Start, Left, Right]
  }
}
```

---

## **Set Interface**

A **Set** is like a bag that doesn’t allow duplicate items.
If you try to add the same element twice, it ignores the duplicate.

### 🔧 Types of Set:

| Class             | Description                             |
| ----------------- | --------------------------------------- |
| **HashSet**       | Doesn’t keep order, but fast            |
| **LinkedHashSet** | Keeps order of insertion                |
| **TreeSet**       | Keeps elements sorted (ascending order) |

---

### **HashSet Example**

```java
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Set<Integer> numbers = new HashSet<>();
    numbers.add(10);
    numbers.add(20);
    numbers.add(10); // duplicate ignored

    System.out.println(numbers); // [20, 10] (no duplicates)
  }
}
```

---

### **TreeSet Example**

```java
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Set<Integer> nums = new TreeSet<>();
    nums.add(3);
    nums.add(1);
    nums.add(2);

    System.out.println(nums); // [1, 2, 3] (sorted automatically)
  }
}
```

---

## **Map Interface**

A **Map** stores data in **key–value pairs** — like a dictionary.
Each key must be unique, but values can repeat.

Example: Student ID → Name
`100 → Abdul`
`200 → Gani`

---

### **HashMap Example**

```java
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Map<String, String> hm = new HashMap<>();

    hm.put("100", "Abdul Hanif");
    hm.put("200", "Mohammed Gani");
    hm.put("300", "Smitha Ganesh");
    hm.put("300", "Jamie");  // overwrites previous value

    System.out.println(hm.get("300")); // Jamie
    System.out.println(hm.get("100")); // Abdul Hanif
  }
}
```

---

### **Iterating Through a HashMap**

```java
import java.util.*;

public class Main {
  public static void main(String[] args) {
    HashMap<String, String> hm = new HashMap<>();

    hm.put("100", "Abdul Hanif");
    hm.put("200", "Mohammed Gani");
    hm.put("300", "Smitha Ganesh");

    Set<Map.Entry<String, String>> set = hm.entrySet();
    Iterator<Map.Entry<String, String>> it = set.iterator();

    while(it.hasNext()) {
      Map.Entry<String, String> entry = it.next();
      System.out.println(entry.getKey() + " → " + entry.getValue());
    }
  }
}
```

**Output:**

```
100 → Abdul Hanif
200 → Mohammed Gani
300 → Smitha Ganesh
```

---

## **References**

*The Complete Reference Java 2* — by Herbert Schildt

---

## **Summary Table**

| Type      | Duplicates      | Ordered                              | Example Classes           |
| --------- | --------------- | ------------------------------------ | ------------------------- |
| **List**  | ✅ Yes           | ✅ Yes                                | ArrayList, LinkedList     |
| **Set**   | ❌ No            | ❌ No (except LinkedHashSet, TreeSet) | HashSet, TreeSet          |
| **Queue** | ✅ Yes           | ✅ Yes                                | PriorityQueue, ArrayDeque |
| **Map**   | ❌ No (for keys) | ✅ Yes (LinkedHashMap)                | HashMap, TreeMap          |

---

## **Exercises You Can Try**

1. Create an **ArrayList** of your favorite foods and print them.
2. Create a **HashSet** of 5 numbers, add one duplicate, and print to see what happens.
3. Use a **TreeSet** to store names and see how it automatically sorts them.
4. Create a **Queue** using `PriorityQueue` and print the smallest element first.
5. Create a **HashMap** that stores student IDs and names, then print them using an iterator.

---


```
