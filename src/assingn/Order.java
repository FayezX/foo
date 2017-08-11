package assingn;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private List<OrderLine> orderLines = new ArrayList<>();            //2.    instantiated with new to avoid null pointer exception
	private double totalTax;
	private double total;
	
	public void add(OrderLine o) throws Exception {
		if (o == null) {
			System.err.println("ERROR - Order is NULL");
			throw new IllegalArgumentException("Order is NULL");
		}
		orderLines.add(o);
	}
	
	public double calculateTotal(){
		total = 0;
		totalTax = 0;
		
		for (int i = 0; i <= this.size()-1; i++) {       //3. changed r.size() into r.size()-1 to match number of orders in arraylist.

			// Calculate the taxes
			double tax = 0;

			if (this.get(i).getDescription().toLowerCase().contains("imported")) {
				tax = this.get(i).getItemTotal()  * 0.15; // Extra 5% tax on
				// imported items
			} else {
				tax = this.get(i).getItemTotal()  * 0.10;
			}

			// Calculate the total price
			double totalprice = this.get(i).getItemTotal() + Math.round(tax*100.0)/100.0;

			// Print out the item's total price
			System.out.println(this.get(i).getDescription() + ": " + Math.round(totalprice*100.0)/100.0);

			// Keep a running total
			totalTax += Math.round(tax*100.0)/100.0;
			total += this.get(i).getItemTotal();
		}
		return total;
		
	}
	
	public double getTotalTax(){
		return totalTax;
	}
	
	public int size() {
		return orderLines.size();
	}

	public OrderLine get(int i) {		                                 
		return orderLines.get(i);
	}
}
