package sales;

/**
 * The Purchase class represents a customer buying an item.
 * It is an extension of the abstract class - Transaction.
 * It holds both a Saleable item and quantity.
 */

public class Purchase extends Transaction {

	//Attributes
	private Saleable item;
	private int quantity;

	/**
	 * This takes a Saleable item and quantity and works out the value by multiplying item's price by the quantity - 'item.getPrice()'.
	 * This is then passed up to the parent abstract class Transaction by 'super'.
	 * @param item - The item that is being purchased.
	 * @param quantity of how many items are being bought.
	 */
	
	public Purchase(Saleable item, int quantity) {
		super(item.getPrice() * quantity);
		this.item = item;
		this.quantity = quantity;
	}

	/**
	 * This returns the item that was purchased.
	 * @return the purchased item.
	 */
	public Saleable getItem() {
		return item;
	}
	
	/**
	 * This returns the quantity of an item purchased.
	 * @return the quantity.
	 */
	public int getQuantity() {
		return quantity;
	}
}
