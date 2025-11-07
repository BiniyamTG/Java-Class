package bankAccountManagementSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankAccountManagementSystem {

    private Map<String, Double> accounts;

    public BankAccountManagementSystem() {
        accounts = new HashMap<>();
    }

    public void createAccount(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            System.out.println("Account already exists.");
        } else {
            accounts.put(accountNumber, 0.0);
            System.out.println("Account created successfully.");
        }
    }

    public void deposit(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            double balance = accounts.get(accountNumber);
            balance += amount;
            accounts.put(accountNumber, balance);
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Account does not exist.");
        }
    }

    public void withdraw(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            double balance = accounts.get(accountNumber);
            if (balance >= amount) {
                balance -= amount;
                accounts.put(accountNumber, balance);
                System.out.println("Withdrawal successful.");
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Account does not exist.");
        }
    }

    public void checkBalance(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            double balance = accounts.get(accountNumber);
            System.out.println("Account Balance: " + balance);
        } else {
            System.out.println("Account does not exist.");
        }
    }

    // ===== FIXED: proper main method =====
    public static void main(String[] args) {
        BankAccountManagementSystem bank = new BankAccountManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBank Account Management System");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
            } else {
                System.out.println("Invalid input, enter a number.");
                scanner.nextLine(); // clear invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();
                    bank.createAccount(accountNumber);
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("Enter amount to deposit: ");
                    if (scanner.hasNextDouble()) {
                        double depositAmount = scanner.nextDouble();
                        scanner.nextLine(); // consume newline
                        bank.deposit(accountNumber, depositAmount);
                    } else {
                        System.out.println("Invalid amount.");
                        scanner.nextLine();
                    }
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("Enter amount to withdraw: ");
                    if (scanner.hasNextDouble()) {
                        double withdrawAmount = scanner.nextDouble();
                        scanner.nextLine(); // consume newline
                        bank.withdraw(accountNumber, withdrawAmount);
                    } else {
                        System.out.println("Invalid amount.");
                        scanner.nextLine();
                    }
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    bank.checkBalance(accountNumber);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
