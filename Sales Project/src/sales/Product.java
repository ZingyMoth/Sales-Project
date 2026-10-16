package sales;

/**
 * The Product class implements the 'Saleable' interface.
 */
public class Product implements Saleable {

//Attributes in this class.
	private int price;
	private int weight;

	public Product(int price, int weight) {
		this.price = price;
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public int getWeight() {
		return weight;
	}
	/**
	 * The below code calculates the delivery cost of a product by the weight of the item.
	 * The weight is calculated across three weight bands.
	 * Items under 100g is free.
	 * Items that weigh 100g-999g is set to 20%.
	 * Items that are 1000g and more, is set to 20% of the first 1000g, plus an additional 10% of the remaining weight.
	 * @return the delivery cost in pennies.
	 */
	
	//Band 1: Under 100g weight = no delivery cost
	public int calculateDelivery() {
		if (weight < 100) {
			return 0;
		}

		//Band 2: 100-999g = 20% delivery cost
		if (weight < 1000) {
			return weight * 20 / 100;
		}

		//Band 3: More than 1000g = 20% of the first 1000g, plus an additional 10% of the remaining weight
		return (1000 * 20 / 100 + (weight - 1000) * 10 / 100);
	}
}
