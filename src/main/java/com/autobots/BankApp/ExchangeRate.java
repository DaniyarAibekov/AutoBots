package com.autobots.BankApp;

import java.util.Map;

public class ExchangeRate {
    public static double convert(double amount, Currency from, Currency to) {

        Map<Currency, Double> toUSD = Map.of(
                Currency.USD, 1.0,
                Currency.EUR, 1.1,
                Currency.KGS, 0.011);

        double usd = amount * toUSD.get(from);
        return usd / toUSD.get(to);
    }
}
