package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import assingn.Item;
import assingn.OrderLine;

public class OrderLineTest {	
	
	private OrderLine test;
	
	//initialzing before test
	@Before
	public void beforeTests() throws Exception {
		test = new OrderLine(new Item("book",(float) 12.45),1);
	}
	
	//testing getQuantity method
	@Test
	public void getQuantityTest() {
		float output = test.getQuantity(); 
		assertEquals(1, output,0);
	}
	
	//testing getItem method
	@Test
	public void getItemTest() {
		String output = test.getItem().getDescription(); 
		assertEquals("book",output);
	}
	
	//testing get description 
	@Test
	public void getDescriptionTest() {
		String output = test.getDescription(); 
		assertEquals("1 book",output);
	}
	
	//testing get items method
	@Test
	public void getItemTotalTest() {
		double output = test.getItemTotal(); 
		assertEquals(12.45,output,.001);
	}
}
