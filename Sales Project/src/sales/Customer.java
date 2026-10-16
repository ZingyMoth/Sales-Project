package sales;

//Imports the ArrayList function
import java.util.ArrayList;

/**
 * This class represents a customer.
 * It can provide a list of everything that has either been bought or refunded.
 * Can also add new transactions to the list, and provide a total cost for all items included.
 */

public class Customer {
	
	//Attribute that holds all of the customers transactions - Both purchases and refunds
	private ArrayList<Transaction> transactions;
	
	/**
	 * This constructor creates a new customer and holds it within the ArrayList.
	 * It begins by creating the customer with an empty transaction list.
	 */
	
	public Customer() {
		this.transactions = new ArrayList<>();
	}
	
	/**
	 * Creates a transaction and adds to the customer's list - purchase and refund.
	 * @param transaction is the transaction that is added to the list.
	 */
	public void transact(Transaction transaction) {
		transactions.add(transaction);
	}
	
	/**
	 * Loop function that looks through each transaction in a list.
	 * Is then adds up the values of the items to work out the total.
	 * Purchasing an item is a positive value whilst a refund is a negative.
	 * When adding these values together, it provides the overall cost in the list.
	 * @return the complete value of all transactions in pennies.
	 */
	public int getTotal() {
		int total = 0;
		for (Transaction transaction : transactions) {
			total = total + transaction.getValue();
		}
		return total;
	}
}
