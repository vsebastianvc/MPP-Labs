package prob2B;

import java.util.ArrayList;

public class Order {

	private int orderNum;
	public ArrayList<OrderLine> orl = new ArrayList<OrderLine>();

	Order(int o) {
		this.orderNum = o;
	}

	public OrderLine addOrderLine(int id, int q, double p) {
		OrderLine o = new OrderLine(id, q, p, this);
		orl.add(o);
		return o;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public ArrayList<OrderLine> getOrl() {
		return orl;
	}

	public void setOrl(ArrayList<OrderLine> orl) {
		this.orl = orl;
	}

	@Override
	public String toString() {
		return "Order [orderNum=" + orderNum + "]";
	}

}
