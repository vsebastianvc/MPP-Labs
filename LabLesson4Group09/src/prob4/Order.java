package prob4;

import java.time.LocalDate;

public class Order {
	private int orderNo;
	private LocalDate orderDate;
	private int orderAmount;

	public Order(int orderNo, LocalDate orderDate, int orderAmount) {
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}

	public LocalDate getOrderDate() {
		return this.orderDate;
	}

	public int getOrderAmount() {
		return this.orderAmount;
	}

	public int getOrderNo() {
		return orderNo;
	}
}
