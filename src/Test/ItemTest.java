package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import assingn.Item;

public class ItemTest {	
	
	private Item test;
	
	//initializing before test
	@Before
	public void beforeTests() {
		test = new Item("book", 12.45);
	}
	
	//testing get price method
	@Test
	public void getPriceTest() {
		double output = test.getPrice(); 
		assertEquals(12.45, output,0);
	}
	
	//testing get description method
	@Test
	public void getDescriptionTest() {
		String output = test.getDescription(); 
		assertEquals("book",output);
	}
}
