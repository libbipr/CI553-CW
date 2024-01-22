package catalogue;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class BetterBasketTest {

	@Test
	void testMergeAddProduct() {
		BetterBasket b = BetterBasket();
		Product p1= new Product("0001", "Toaster", 10.00, 1);
		Product p2= new Product("0001", "Toaster", 10.00, 1);
		Product p3= new Product("0002", "Kettle", 15.00, 1);
		Product p4 = new Product("0002", "Kettle", 15.00, 2);
		
		b.add(p1);
		b.add(p2);
		assertEquals(1, b.size(), "Size incorrect after merge");
		assertEquals(2, b.get(0).getQuantity(), "Quantity incorrect after merge");
		
		b.add(p3);
		assertEquals(2, b.size(), "Size incorrect after non-merge");
		
		b.add(p4);
		assertEquals(3, b.size(), "Size incorrect after non-merge");
	}

	private BetterBasket BetterBasket() {
		// TODO Auto-generated method stub
		return null;
	}

}
