package assingn;


/* ****************************************************************************************
 
Please remove all bugs from the code below to get the following output:

<pre>

*******Order 1*******
1 book: 13.74
1 music CD: 16.49
1 chocolate bar: 0.94
Sales Tax: 2.84
Total: 28.33
*******Order 2*******
1 imported box of chocolate: 11.5
1 imported bottle of perfume: 54.62
Sales Tax: 8.62
Total: 57.5
*******Order 3*******
1 Imported bottle of perfume: 32.19
1 bottle of perfume: 20.89
1 packet of headache pills: 10.73
1 box of imported chocolates: 12.94
Sales Tax: 8.77
Total: 67.98
Sum of orders: 153.81
 
</pre>
 
******************************************************************************************** */

public class Foo {

	public static void main(String[] args) throws Exception {
		
		Calculator calc = new Calculator();
		Order order = new Order();

		order.add(new OrderLine(new Item("book", 12.49), 1));
		order.add(new OrderLine(new Item("music CD", 14.99), 1));
		order.add(new OrderLine(new Item("chocolate bar", 0.85), 1));

		calc.addCart(order,"Order 1");
		
		//creating new cart for order
		order = new Order();

		order.add(new OrderLine(new Item("imported box of chocolate", 10), 1));
		order.add(new OrderLine(new Item("imported bottle of perfume", 47.50), 1));

		calc.addCart(order,"Order 2");
		
		//creating new cart for order
		order = new Order();

		order.add(new OrderLine(new Item("Imported bottle of perfume", 27.99), 1));
		order.add(new OrderLine(new Item("bottle of perfume", 18.99), 1));
		order.add(new OrderLine(new Item("packet of headache pills", 9.75), 1));
		order.add(new OrderLine(new Item("box of imported chocolates", 11.25), 1));

		calc.addCart(order,"Order 3");
		
		calc.calculate();

	}
}

/* 
BUG FIXES:
------------
1. first issue, changed item object to this.item and qunitity to this.quantity inside the OrderLine constructor to avoid null pointer exception 
2. instantiated with new arraylist in Order class to avoid null pointer exception 
3. changed r.size() into r.size()-1 to match number of orders in arraylist in order class calculateTotal function. 

Refactoring changes:
---------------------
-All classes are now dependend on the first level
-encapsulation used for all classes
-changed variable named to appropriate names
-All classes are on seperate file instead on the original one.

Unit Test/ Code Coverage Results
---------------------------------
-Used Junit for unit testing individual classes
-ran a suite test to run at once<br>
-code coverage result 78% without main method being covered
-90% with main method covered
 */

