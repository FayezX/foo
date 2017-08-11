package assingn;

import java.util.LinkedHashMap;
import java.util.Map;

public class Calculator {
	private Map<String, Order> orderMap = new LinkedHashMap<String, Order>();
	
	/**
	 * receives a collection of orders. For each order, iterates on the order lines and calculate the total price which
	 * is the item's price * quantity * taxes.
	 * 
	 * For each order, print the total Sales Tax paid and Total price without taxes for this order
	 */
	public double calculate() {
		
		double grandtotal = 0;

		// Iterate through the orders
		for (Map.Entry<String, Order> entry : orderMap.entrySet()) {
			System.out.println("*******" + entry.getKey() + "*******");
			//grandtotal = 0;       //remove grandtotal to add up totals

			Order r = entry.getValue();

			double total = r.calculateTotal();
			double totalTax = r.getTotalTax();
			
			// Print out the total taxes
			System.out.println("Sales Tax: " + Math.floor(totalTax*100.0)/100.0);

			//total = total + totalTax;

			// Print out the total amount
			System.out.println("Total: " + Math.floor(total * 100+0.5) / 100);
			grandtotal += total;
		}

		grandtotal = Math.floor(grandtotal * 100.0+0.5) / 100.0; 
		System.out.println("Sum of orders: " + grandtotal);
		return grandtotal;
	}
	
	public void addCart(Order order,String name){
		orderMap.put(name, order);
	}
}
