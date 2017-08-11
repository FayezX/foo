package assingn;

/*
 * represents an item, contains a price and a description.
 *
 */

public class Item {

	private String description;
	private double price;

	public Item(String description, double price) {
		//super();
		this.description = description;
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}
}
