package prob4;

import java.time.LocalDate;

public class CustOrderFactory {

	public static Customer createCustomer(String name) {
		if (name.isEmpty() || name == null) {
			throw new IllegalArgumentException("Null or Empty name");
		}
		Customer cus = new Customer(name);
		return cus;
	}

	public static Order createOrder(Customer cust, LocalDate date) {
		if (cust == null) {
			throw new NullPointerException("Null customer");
		}
		Order ord = new Order(date);
		cust.addOrder(ord);
		return ord;
	}

	public static Item createItem(Order order, String name) {
		if (order == null) {
			throw new IllegalArgumentException("Null order");
		}
		if (name.isEmpty() || name == null) {
			throw new IllegalArgumentException("Null or Empty name");
		}
		Item item = new Item(name);
		order.addItem(item);
		return item;
	}

}
