package prob4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class Commissioned extends Employee {
	private double baseSalary;
	private double commission;
	private List<Order> orderList;

//	public void addOrder(int orderNo, LocalDate orderDate, int orderAmount) {
//		Order order = new Order(orderNo, orderDate, orderAmount);
//		orderList.add(order);
//	}

	public Commissioned(double salary, double commission, List<Order> list) {
		this.baseSalary = salary;
		this.commission = commission;
		this.orderList = list;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	@Override
	public double calcGrossPay() {
		// TODO Auto-generated method stub
		double sum=0.0;
		LocalDate now = LocalDate.now();
		for (Order order : orderList) {
			if(order.getOrderDate().getYear() == now.getYear()) {
				if(now.getMonthValue()-order.getOrderDate().getMonthValue() == 1) {
					sum+=order.getOrderAmount();
				}
				
			}
			
		}
		return baseSalary + (sum * commission);
	}

}
