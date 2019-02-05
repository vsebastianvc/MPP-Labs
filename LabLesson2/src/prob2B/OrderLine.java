package prob2B;

public class OrderLine {

	private int id;
	private int quantity;
	private double price;
	public Order order;

	OrderLine(int id, int q, double p, Order o) {
		this.id = id;
		this.quantity = q;
		this.price = p;
		this.order = o;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "OrderLine [id=" + id + ", quantity=" + quantity + ", price=" + price + "]";
	}

}
