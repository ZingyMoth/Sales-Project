package sales;

/**
 * Warranty is an optional purchase and implements the 'Saleable' interface.
 */
public class Warranty implements Saleable {

	//Attributes
	private int price; //This is what the warranty costs in pennies
	private int durationMonths; //Duration is set at either 12 or 24 months
	
	/**
	 * Creates a new warranty with a set price and duration of the warranty in months.
	 * @param price the cost of the warranty in pennies.
	 * @param durationMonths the amount of time the warranty lasts in months.
	 */
	public Warranty(int price, int durationMonths) {
		this.price = price;
		this.durationMonths = durationMonths;
	}
	
	/**
	 * This returns the price of the warranty in pennies.
	 * @return the price of the warranty in pennies.
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * This returns the duration that the warranty lasts for.
	 * @return the duration of the warranty in months.
	 */
	public int getDurationMonths() {
		return durationMonths;
	}
}
