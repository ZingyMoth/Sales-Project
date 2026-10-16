package sales;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CustomerTest {

	@Test //Test1
	public void testNoTransactions() {
		
		//Arrange = making a customer with no transactions
		Customer customer = new Customer();
		
		//Act = get the customers overall total
		int total = customer.getTotal();
		
		//Assert = this result should return 0 as there has not been anything processed
		assertEquals(0, total);
	}
	
	@Test //Test2
	public void testOnlyPurchases() {
		
		//Arrange = making a customer with two transactions
		Customer customer = new Customer();
		Product product = new Product(100, 500); //Value of the product is 100 pennies | 500 = Weight of the product
		customer.transact(new Purchase(product, 2)); //This works out the quantity of the product being purchased. Product = 100 pennies | Quantity = 2 | 100 * 2 = 200 - The cost of this would be 200 pennies
		customer.transact(new Purchase(product, 3)); //This works out the quantity of the product being purchased. Product = 100 pennies | Quantity = 3 | 100 * 3 = 300 - The cost of this would be 300 pennies	
		
		//Act = get the customers overall total
		int total = customer.getTotal();
		
		//Assert = the value has been set at 100 pennies for the product. By adding a new purchase of 2, and then again 3, you would times 100 by 5 as there is a purchase of 5 items being made
		assertEquals(500, total);
	}
	
	@Test //Test3
	public void testOnlyRefunds() {
		
		//Arrange = making a customer with two refunded transactions
		Customer customer = new Customer();
		customer.transact(new Refund(60, "Damaged Item")); //Refund amount is 60 pennies | The 'reason' for the refund is due to the item being damaged
		customer.transact(new Refund(40, "Incorrect Item Sent")); //Refund amount is 40 pennies | The 'reason' for the refund is due to the incorrect item being sent
		
		//Act = get the customers overall total
		int total = customer.getTotal();
		
		//Assert = each of the refunded items value is negated. This is a loss of money to the business and any positive number will be flipped
		assertEquals(-100, total);
		
	}
	
	@Test //Test4
	public void testPurchaseandRefund() {
		
		//Arrange - making a customer with both purchases and refunds together
		Customer customer = new Customer();
		Product product = new Product(200, 500); //Value of the product is 200 pennies | 500 = Weight of the product
		customer.transact(new Purchase(product, 5)); //This works out the quantity of the product being purchased. Product = 200 pennies | Quantity = 5 | 200 * 5 = 1000 - The cost of this would be 1000 pennies
		customer.transact(new Purchase(product, 10)); //This works out the quantity of the product being purchased. Product = 200 pennies | Quantity = 10 | 200 * 10 = 2000 - The cost of this would be 2000 pennies
		customer.transact(new Refund(500, "Damaged Item")); //Value of the product is 500 pennies | The 'reason' for the refund is due to the item being damaged
		
		//Act = get the customers overall total
		int total = customer.getTotal();
		
		//Assert = this purchase would add up to 3000 pennies. As there is an item refunded for 500 pennies, the below checks that the total would equate to 2500 pennies.
		assertEquals(2500, total);	
		
	}
}
