package TodoApp;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class TodoItem implements Serializable {
    private String task;
    private boolean done;
    private int priority; // 1 = High, 2 = Medium, 3 = Low

    public TodoItem(String task, int priority) {
        this.task = task;
        this.priority = priority;
        this.done = false;
    }

    public String getTask() {
        return task;
    }

    public boolean isDone() {
        return done;
    }

    public int getPriority() {
        return priority;
    }

    public void markDone() {
        this.done = true;
    }

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
}

public class TodoApp {

    private static final String FILE_NAME = "todolist.dat";

    public static void main(String[] args) {
        ArrayList<TodoItem> todoList = loadTodoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== Todo List ====");
            if (todoList.isEmpty()) {
                System.out.println("(no items)");
            } else {
                for (int i = 0; i < todoList.size(); i++) {
                    System.out.println((i + 1) + ". " + todoList.get(i));
                }
            }
            System.out.println("===================");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Mark item as done");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            String line = scanner.nextLine().trim();
            if (line.isEmpty()) {
                System.out.println("Please enter a choice.");
                continue;
            }

            int choice;
            try {
                choice = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input — please enter a number.");
                continue;
            }

            switch (choice) {
                case 1 -> { // Add item
                    System.out.print("Enter item to add: ");
                    String task = scanner.nextLine().trim();
                    if (!task.isEmpty()) {
                        System.out.print("Enter priority (1=High, 2=Medium, 3=Low): ");
                        int priority;
                        try {
                            priority = Integer.parseInt(scanner.nextLine().trim());
                            if (priority < 1 || priority > 3) priority = 3; // default Low
                        } catch (NumberFormatException e) {
                            priority = 3;
                        }
                        todoList.add(new TodoItem(task, priority));
                        System.out.println("Item added!");
                        saveTodoList(todoList);
                    } else {
                        System.out.println("Empty item not added.");
                    }
                }
                case 2 -> { // Remove item
                    if (todoList.isEmpty()) {
                        System.out.println("No items to remove.");
                        continue;
                    }
                    System.out.print("Enter item number to remove: ");
                    try {
                        int num = Integer.parseInt(scanner.nextLine().trim());
                        if (num > 0 && num <= todoList.size()) {
                            todoList.remove(num - 1);
                            System.out.println("Item removed!");
                            saveTodoList(todoList);
                        } else {
                            System.out.println("Invalid item number.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number.");
                    }
                }
                case 3 -> { // Mark item as done
                    if (todoList.isEmpty()) {
                        System.out.println("No items to mark.");
                        continue;
                    }
                    System.out.print("Enter item number to mark as done: ");
                    try {
                        int num = Integer.parseInt(scanner.nextLine().trim());
                        if (num > 0 && num <= todoList.size()) {
                            todoList.get(num - 1).markDone();
                            System.out.println("Item marked as done!");
                            saveTodoList(todoList);
                        } else {
                            System.out.println("Invalid item number.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number.");
                    }
                }
                case 4 -> { // Exit
                    System.out.println("Exiting Todo List App.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Save the todo list to a file
    private static void saveTodoList(ArrayList<TodoItem> todoList) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeObject(todoList);
        } catch (IOException e) {
            System.out.println("Error saving todo list: " + e.getMessage());
        }
    }

    // Load the todo list from a file
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
}
