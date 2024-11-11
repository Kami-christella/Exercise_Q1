package Q1;

import java.util.Scanner;
public  class Q1 {
    private String name;
    private String address;
    private int age;
    private double balance;
    private boolean isActive;

    // Constructor
    public Q1(String name, String address, int age, double initialDeposit) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.balance = initialDeposit;

        if (age >= 18 && initialDeposit >= 500) {
            isActive = true;
        } else {
            isActive = false;
            System.out.println("Account not activated. Age must be 18 or above and initial deposit must be at least 500.");
        }
    }

    // Deposit functionality
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            if (!isActive && balance >= 500) {
                isActive = true;
                System.out.println("Account activated!");
            }
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Transfer functionality
    public boolean transfer(Q1 recipient, double amount) {
        if (isActive && balance >= 5000 && amount >= 1 && amount <= 1000) {
            balance -= amount;
            recipient.deposit(amount);
            return true;
        } else {
            System.out.println("Transfer failed. Insufficient balance or invalid transfer amount.");
            return false;
        }
    }

    // Getters and setters (implement as needed)
}
