package com.autobots.BankApp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankProApp {
    static Map<String, Client> clients = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Client asan = new Client("Asan Uson", "1234");

        DepositAccount asansDepAccaunt = new DepositAccount(asan, Currency.USD);
        CreditAccount asansCredAccaunt = new CreditAccount(asan, Currency.EUR);

        asan.addAccount(asansDepAccaunt);
        asan.addAccount(asansCredAccaunt);
        System.out.println(asan.getClientID());

        clients.put(asan.getClientID(), asan);

        System.out.println("=========== Welcome to Mbank =============");
        System.out.print("Please enter your client ID here --> ");
        String clientID = scanner.nextLine();
        Client client = clients.get(clientID);

        if (client == null) {
            System.out.println("Client was not found");
            return;
        }

        System.out.print("Please enter your pin code here --> ");
        String pinCode = scanner.nextLine();
        if (!client.authenticate(pinCode)) {
            System.out.println("Incorrect pin code!");
            return;
        }

        System.out.println(client.getFullName() + ", welcome to Mbank!");
        while (true) {
            System.out.println("1. Посмотреть счета");
            System.out.println("2. Перевести между счетами");
            System.out.println("3. Показать чек");
            System.out.println("0. Выход из системы");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1" :
                    System.out.println("Ваши счета: ");
                    for (BankAccount bankAccount : client.getAccounts()) {
                        System.out.printf("%s | %s | Баланс: %.2f %s\n",
                                bankAccount.getClass().getSimpleName(),
                                bankAccount.getAccountNumber(),
                                bankAccount.getBalance(), bankAccount.getCurrency());
                    }
                    System.out.println();
                    break;

                case "2" :
                    System.out.print(client.getFullName() + ", введите номер счета отправителя здесь --> ");
                    String fromID = scanner.nextLine();
                    System.out.print(client.getFullName() + ", введите номер счета получателя здесь --> ");
                    String toID = scanner.nextLine();
                    System.out.print(client.getFullName() + ", введите сумму здесь --> ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    BankAccount from = findAccount(fromID);
                    BankAccount to = findAccount(toID);
                    if (from != null && to != null) {
                        boolean result = BankService.transfer(from, to, amount);
                        System.out.println(result ? "Перевод успешен, сумма перевода:  " + amount + " " + from.getCurrency() : "Ошибка перевода");

                    } else {
                        System.out.println("счета не найдены");

                    }
                    break;

                case "3" :
                    for (BankAccount bankAccount : client.getAccounts()) {
                        System.out.println("\n == чек по счету " + bankAccount.getAccountNumber());
                        for (Transaction transaction : bankAccount.getTransactions()) {
                            System.out.println(transaction);
                        }
                    }
                    break;

                case "0" :
                    System.out.println("Выход из системы...");
                    return;

                default:
                    System.out.println("не верный выбор");

            }
        }
    }

    public static BankAccount findAccount(String accountNumber) {
        for (Client client : clients.values()) {
            for (BankAccount bankAccount : client.getAccounts()) {
                if (bankAccount.getAccountNumber().equals(accountNumber)) {
                    return bankAccount;
                }
            }
        }
        return null;
    }
}