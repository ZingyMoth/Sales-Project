package sales;

public class Main {

	public static void main(String[] args) {
		
		
		Product laptop = new Product(59999, 1500);
		Product tablet = new Product(15000, 800);
		Product mouse = new Product(1500, 50);
		Product keyboard = new Product(3000, 400);
		Product phone = new Product(50000, 250);
		Product cable = new Product(500, 30);
		Warranty warranty12 = new Warranty(5000, 12);
		Warranty warranty24 = new Warranty(9000, 24);
		Service repairItem = new Service(2000);
		
		Customer customer = new Customer();
		customer.transact(new Purchase(laptop, 1));
		customer.transact(new Purchase(keyboard, 1));
		customer.transact(new Purchase(cable, 3));
		customer.transact(new Purchase(warranty12, 1));
		customer.transact(new Purchase(repairItem, 1));
		
		Refund refund = new Refund(15000, "Damaged Item");
		customer.transact(refund);
		
		System.out.println("Laptop Price: " + laptop.getPrice());
		System.out.println("Laptop Delivery: " + laptop.calculateDelivery());
		System.out.println("Keyboard Price: " + keyboard.getPrice());
		System.out.println("Keyboard Delivery: " + keyboard.calculateDelivery());
		System.out.println("Cable Price: " + cable.getPrice());
		System.out.println("Cable Delivery: " + cable.calculateDelivery());
	
		System.out.println("Refund Reason: " + refund.getReason());
		System.out.println("Refund Value: " + refund.getValue());
		
		System.out.println("Warranty price: " + warranty12.getPrice());
		System.out.println("Warranty duration: " + warranty12.getDurationMonths() + " months");
		
		System.out.println("Repair Cost: " + repairItem.getPrice());
		
		System.out.println("Customer Total: " + customer.getTotal());
	}

}
