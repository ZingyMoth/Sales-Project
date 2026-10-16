package sales;
/**
 * This class represents the service of this project.
 * Service is the item/items that can be sold. It has  price, and implements the 'Saleable' interface.
 */
public class Service implements Saleable {

	//Attribute - The overall price of the service in pennies
	private int price;
	
/**
 * This constructor provides the incoming value of an item. It creates a new 'Service' and sets the price.
 * Each time it runs, a new 'Service' object is created.
 * Stores the incoming price of an item into this object attribute so that it can be read by 'getPrice' later on
 * @param price is the price of the service in pennies. 
 */
	public Service(int price) {
		this.price = price;
	}
	
/**
 * This method gives you the price of the service.
 * @return the price back in pennies.
 */
	public int getPrice() {
		return price;
	}
}
