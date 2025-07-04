package com.autobots.BankApp;

public class Transaction {
    private final String type;
    private final double amount;
    private final LocalDateTime timeStamp = LocalDateTime.now();

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s: %.2f", timeStamp, type, amount);
    }
}