package br.com.mariojp.solid.srp;

public class ReceiptService {
	public String generate(Order order) {
        TaxCalculator taxCalculator = new TaxCalculator();
        ReceiptFormatter formatter = new ReceiptFormatter();

		double subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
        double tax = taxCalculator.calcular(subtotal);
        double total = subtotal + tax;

        return formatter.recibo(order,subtotal,total,tax);
	}
}
