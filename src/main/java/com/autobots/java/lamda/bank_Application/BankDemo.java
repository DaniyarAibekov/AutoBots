package com.autobots.java.lamda.bank_Application;

public class BankDemo {
    public static void main(String[] args) throws Exception {
        MBank aliiaMBank = new MBank(123456789111L, 444444444);

        System.out.println(aliiaMBank);
        aliiaMBank.deposit(100000);
        System.out.println("_____________");
        System.out.println(aliiaMBank.getBalance());

        Optima ulugbekOptima = new Optima(121212121212L, 121212122);
        System.out.println(ulugbekOptima.getBalance());

        Bank.transferFunds(aliiaMBank, ulugbekOptima, 500);
        System.out.println(aliiaMBank.getBalance());
        System.out.println(ulugbekOptima.getBalance());

        Demir zinaidaDemir = new Demir(121234123456L,666666666);
        Bank.transferFunds(zinaidaDemir,ulugbekOptima,1000);
        System.out.println(zinaidaDemir.getBalance());

        ///zinaidaDemir.deposit(600000);
        ///zinaidaDemir.withDraw(500000);

        BankBase.allBankRecords.stream().filter(n -> n.getBalance() > 100).forEach(System.out::println);

        double allSumOfBanks = BankBase.allBankRecords.stream().mapToDouble(Bank::getBalance).sum();
        System.out.println(allSumOfBanks);
    }
}
