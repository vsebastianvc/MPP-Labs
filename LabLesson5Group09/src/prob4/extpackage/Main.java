package prob4.extpackage;

import java.time.LocalDate;

import prob4.CustOrderFactory;
import prob4.Customer;
import prob4.Order;

public class Main {
	public static void main(String[] args) {
		Customer cust = CustOrderFactory.createCustomer("Bob");
		Order order = CustOrderFactory.createOrder(cust, LocalDate.now());
		CustOrderFactory.createItem(order, "Shirt");
		CustOrderFactory.createItem(order, "Laptop");

		order = CustOrderFactory.createOrder(cust, LocalDate.now());
		CustOrderFactory.createItem(order, "Pants");
		CustOrderFactory.createItem(order, "Knife set");

		System.out.println(cust.getOrders());
	}
}
