package Test;

import static org.junit.Assert.assertEquals;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import assingn.Calculator;
import assingn.Item;
import assingn.Order;
import assingn.OrderLine;

public class CalculatorTest {	
	
	private Calculator test;
	private Order c;
	
	//init before testing Calculator class
	@Before
	public void beforeTests() throws Exception {
		c = new Order();
		c.add(new OrderLine(new Item("book", (float) 12.49), 1));
		c.add(new OrderLine(new Item("music CD", (float) 14.99), 1));
		c.add(new OrderLine(new Item("chocolate bar", (float) 0.85), 1));
		c.add(new OrderLine(new Item("imported box of chocolate", 10), 1));
		c.add(new OrderLine(new Item("imported bottle of perfume", 47.50), 1));
		test = new Calculator();
		test.addCart(c, "order 1");
	}
	
	//testing calculator test method
	@Test
	public void calculatorTest() {
		double total = test.calculate(); 
		assertEquals(85.83,total,0.001);	
	}
	
	//testing addCart method
	@Test
	public void addCartTest() {
		double total = test.calculate(); 
		assertEquals(85.83,total,0.001);	
	}
	
}
