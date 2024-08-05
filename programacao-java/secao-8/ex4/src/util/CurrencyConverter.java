package util;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double calc(double dolarPrice, double many) {
        return (dolarPrice * many * IOF) + (dolarPrice * many);
    }
}
