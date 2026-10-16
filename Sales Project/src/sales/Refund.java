package sales;

/**
 * Refund is the process for calculating the price of a returned item.
 * This class is an extension of the abstract class - Transaction.
 * It contains a constructor that takes a value and reason, and flips a positive number to negative.
 * Once it has been calculated, it is passed to the parent Transaction via a method called 'super'.
 */

public class Refund extends Transaction {

	//The reason that is given for a refund
	private String reason;

	
	/**
	 * Takes the value and reason for the refund.
	 * If a positive value is processed, it is flipped to negative to show money going out.
	 * It is then passed to the parent Transaction abstract class via 'super'.
	 * @param value the refunded amount in pennies. This is flipped to negative if processed as positive.
	 * @param reason for the refund that is processed.
	 */
	
	public Refund(int value, String reason) {
		super(value > 0 ? -value : value);
		this.reason = reason;
	}
	
	/**
	 * This method returns the reason that is given for a refund.
	 * @return the reason for the refund.
	 */
	public String getReason() {
		return reason;
	}
	
}
