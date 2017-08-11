package Test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import assingn.Item;
import assingn.Order;
import assingn.OrderLine;

public class OrderTest {	
	
	private Order test;
	
	//initializing before test
	@Before
	public void beforeTests() throws Exception {
		test = new Order();
		test.add((new OrderLine(new Item("book", (float) 12.49), 1)));
	}
	
	//testing size test method
	@Test
	public void SizeTest() {
		int output = test.size(); 
		assertEquals(1, output,0);
	}
	
	//testing getOrder method
	@Test
	public void getOrderTest() {
		OrderLine output = test.get(0); 
		assertEquals(output.getItem().getDescription(),"book");
	}
	
	//testing calculateTotal method
	@Test
	public void calculateTotalTest() {
		double total = test.calculateTotal() + test.getTotalTax();
		assertEquals(13.74,total,0.001);
	}

	//testing getTotalTax method
	@Test
	public void getTotalTaxTest() {
		test.calculateTotal();
		double total = test.getTotalTax();
		assertEquals(1.25,total,0.001);
	}
	
}
