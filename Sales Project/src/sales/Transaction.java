package sales;

/**
 * Below is an abstract class called Transaction It is the parent class of both
 * 'Purchase' and 'Refund' and holds the value of each transaction processed.
 */
public abstract class Transaction {

	protected int value;

	/**
	 * This constructor sets the value of the transaction when the transaction class
	 * is called. This works by the classes 'Purchase' and 'Refund' calling the parent class 'Transaction' and stores the incoming value.
	 * @param value is the value of the transaction in pennies.
	 */
	public Transaction(int value) {
		this.value = value;
	}

	/**
	 * This method returns the value of a transaction.
	 * @return the value of the transaction in pennies.
	 */
	public int getValue() {
		return value;
	}
}
