package sales;

/**
 * An interface acts as a contract for the project. Classes implement elements from within the interface/contract if called.
 * This interface represents items that can be sold.
 * If any class implements this interface, it must provide a way to return the price.
 */
public interface Saleable {

	/**
	 * Returns the price of a selected item.
	 * @return the price in pennies.
	 */
	int getPrice();
	
}
