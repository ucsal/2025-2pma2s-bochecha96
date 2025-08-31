package br.com.mariojp.solid.srp;

public class TaxCalculator {
    public double calcular(double subtotal) {
        double tax = subtotal * Double.parseDouble(System.getProperty("tax.rate"));
        return tax;
    }

}
