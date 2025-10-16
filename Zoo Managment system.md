# Zoo Management System (Java OOP Project)

---

## 🧠 Concepts You’ll Learn

### 1. Class and Object
- **Class** → A blueprint for creating objects (e.g., `Animal`).
- **Object** → A real instance of a class created with `new`.

```java
  Animal a = new Animal("Simba", 5);
````

### 2. Fields (Instance Variables)

* Variables declared inside a class but outside methods.
* Store data for each object.

  ```java
  protected String name;
  protected int age;
  ```

### 3. Constructor

* A special method used to initialize new objects.
* Has the same name as the class and **no return type**.

  ```java
  public Animal(String name, int age) {
      this.name = name;
      this.age = age;
  }
  ```

### 4. Inheritance (`extends`)

* Lets one class reuse fields and methods of another.

  ```java
  public class Lion extends Animal { ... }
  ```
* Prevents code duplication — shared logic lives in the parent class.

### 5. Method Overriding

* Subclass replaces a parent’s method to change behavior.

  ```java
  @Override
  public void makeSound() {
      System.out.println("Roar!");
  }
  ```

### 6. Polymorphism

* A single reference type (`Animal`) can point to different subclass objects (`Lion`, `Monkey`, `Elephant`).
* When you call a method like `makeSound()`, the correct version runs based on the **actual object type**, not the variable type.

  ```java
  Animal a = new Lion("Simba", 5, true);
  a.makeSound(); // prints "Roar!"
  ```

### 7. Access Modifiers

* `public`: accessible everywhere.
* `private`: accessible only inside the same class.
* `protected`: accessible in the same package or by subclasses.

### 8. `super` Keyword

* Used by subclasses to call the parent class constructor or methods.

  ```java
  super(name, age);
  ```

### 9. `instanceof` and Downcasting

* `instanceof` checks the actual type of an object.
* **Downcasting** converts a parent reference back to a subclass to access its specific methods.

  ```java
  if (a instanceof Lion) {
      Lion l = (Lion) a;
      l.hunt();
  }
  ```

### 10. Four Pillars of OOP

1. **Encapsulation** → Hide data using private fields and getters/setters.
2. **Abstraction** → Show only essential features.
3. **Inheritance** → Reuse code across related classes.
4. **Polymorphism** → Same method behaves differently for different objects.

---

## 🏗️ Project Structure

```
ZooManagementSystem/
├── Animal.java
├── Lion.java
├── Elephant.java
├── Monkey.java
└── ZooMain.java
```

---

## 🐾 Code Implementation

### 🧩 Animal.java

```java
public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Some animal sound");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + " | Age: " + age);
    }
}
```

---

### 🦁 Lion.java

```java
public class Lion extends Animal {
    private boolean isAlpha;

    public Lion(String name, int age, boolean isAlpha) {
        super(name, age);
        this.isAlpha = isAlpha;
    }

    @Override
    public void makeSound() {
        System.out.println("Roar!");
    }

    public void hunt() {
        if (isAlpha) {
            System.out.println(name + " the alpha lion leads the hunt!");
        } else {
            System.out.println(name + " the lion joins the hunt.");
        }
    }
}
```

---

### 🐘 Elephant.java

```java
public class Elephant extends Animal {
    private double trunkLength;

    public Elephant(String name, int age, double trunkLength) {
        super(name, age);
        this.trunkLength = trunkLength;
    }

    @Override
    public void makeSound() {
        System.out.println("Trumpet!");
    }

    public void sprayWater() {
        System.out.println(name + " sprays water with a trunk length of " + trunkLength + " meters!");
    }
}
```

---

### 🐒 Monkey.java

```java
public class Monkey extends Animal {
    private boolean canClimb;

    public Monkey(String name, int age, boolean canClimb) {
        super(name, age);
        this.canClimb = canClimb;
    }

    @Override
    public void makeSound() {
        System.out.println("Oo-oo-aa-aa!");
    }

    public void swing() {
        if (canClimb) {
            System.out.println(name + " swings happily from tree to tree!");
        } else {
            System.out.println(name + " prefers to stay on the ground.");
        }
    }
}
```

---

### 🏛️ ZooMain.java

```java
public class ZooMain {
    public static void main(String[] args) {
        Animal[] animals = new Animal[] {
            new Lion("Simba", 5, true),
            new Elephant("Dumbo", 10, 1.5),
            new Monkey("George", 3, true),
            new Lion("Nala", 4, false),
            new Monkey("Chico", 2, false)
        };

        for (Animal a : animals) {
            a.displayInfo();
            a.makeSound();

            if (a instanceof Lion) {
                ((Lion) a).hunt();
            } else if (a instanceof Elephant) {
                ((Elephant) a).sprayWater();
            } else if (a instanceof Monkey) {
                ((Monkey) a).swing();
            }

            System.out.println("----------------------");
        }
    }
}
```

---

## ⚙️ How to Run

1. **Compile all Java files**

   ```bash
   javac *.java
   ```

2. **Run the program**

   ```bash
   java ZooMain
   ```

---

## 📤 Sample Output

```
Name: Simba | Age: 5
Roar!
Simba the alpha lion leads the hunt!
----------------------
Name: Dumbo | Age: 10
Trumpet!
Dumbo sprays water with a trunk length of 1.5 meters!
----------------------
Name: George | Age: 3
Oo-oo-aa-aa!
George swings happily from tree to tree!
----------------------
Name: Nala | Age: 4
Roar!
Nala the lion joins the hunt.
----------------------
Name: Chico | Age: 2
Oo-oo-aa-aa!
Chico prefers to stay on the ground.
----------------------
```

---

## 🧩 Key OOP Takeaways

| Concept           | Meaning                          | Example in Code                           |
| ----------------- | -------------------------------- | ----------------------------------------- |
| **Class**         | Blueprint for objects            | `class Animal`                            |
| **Object**        | Instance of a class              | `new Lion("Simba", 5, true)`              |
| **Inheritance**   | Reuse code across classes        | `class Lion extends Animal`               |
| **Overriding**    | Subclass redefines parent method | `@Override makeSound()`                   |
| **Polymorphism**  | Same method behaves differently  | `Animal[] animals = ...`                  |
| **Encapsulation** | Hiding data with private fields  | `private boolean isAlpha;`                |
| **Constructor**   | Initialize new object            | `public Lion(String n, int a, boolean i)` |
| **super**         | Call parent constructor          | `super(name, age);`                       |
| **instanceof**    | Check actual object type         | `if (a instanceof Monkey)`                |

---

## 💬 What to Say in Class

> “This program uses inheritance to create different animal types from a common `Animal` class.
> Each subclass overrides the `makeSound()` method to show polymorphism.
> I used `instanceof` to call subclass-specific methods like `hunt()`, `sprayWater()`, and `swing()`.
> This demonstrates how different objects can share a common structure but behave uniquely.”

---



Would you like me to add **inline comments** for each line of code (inside the `README.md`) so it looks like a fully annotated learning document for your submission or presentation?
```
