package com.autobots.BankApp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Client {
    private final String fullName;
    private final String clientID;
    private final String pin;
    private final List<BankAccount> accounts = new ArrayList<>();

    public Client(String fullName, String pin) {
        this.fullName = fullName;
        this.pin = pin;
        this.clientID = UUID.randomUUID().toString();
    }

    public boolean authenticate(String inputPin) {
        if (this.pin.equals(inputPin)) {
            return true;
        }
        return false;
    }

    public void addAccount(BankAccount bankAccount) {
        accounts.add(bankAccount);
    }

    public String getFullName() {
        return fullName;
    }

    public String getClientID() {
        return clientID;
    }

    public String getPin() {
        return pin;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        return "Client{" +
                "fullName='" + fullName + '\'' +
                ", clientID='" + clientID + '\'' +
                ", pin='" + pin + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
