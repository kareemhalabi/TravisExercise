package strategydemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;




public class Test1 {
	
	public static void main(String[] args) {
		System.out.println("Test class works");
	}
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPercent() {
		Order order = new Order("Jennifer", 444.07f);	
		DiscountStrategy strategy = new PercentDiscountStrategy(25);
		order.setStrategy(strategy);
		
		assertEquals("Jennifer", order.getName());
		assertEquals(444.07f , order.getPrice(), 0);
		assertEquals(333.05,order.getDiscountedPrice(),0.01f);
	}

}
