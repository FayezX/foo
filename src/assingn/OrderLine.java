package assingn;

/*
 * represents an order line which contains the @link Item and the quantity.
 *
 */

public class OrderLine {

	private int quantity;
	private Item item;

	/*
	 * @param item Item of the order
	 * 
	 * @param quantity Quantity of the item
	 */
	public OrderLine(Item item, int quantity) throws Exception {
		if (item == null) {
			System.err.println("ERROR - Item is NULL");
			throw new Exception("Item is NULL");
		}
		assert quantity > 0;
		this.item = item;                    //1. first issue, changed to this.item and this.quantity to avoid null pointer exception
		this.quantity = quantity;
	}

	public Item getItem() {
		return item;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public double getItemTotal(){
		return item.getPrice() * quantity; 
	}
	
	public String getDescription() {
		return "" + quantity + " " + item.getDescription();
	}
	
}
