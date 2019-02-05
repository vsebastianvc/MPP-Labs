package prob2B;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order or = new Order(1);
		or.addOrderLine(1,10, 10.60);
		or.addOrderLine(1,15, 100.60);
		or.addOrderLine(1,22, 180.40);
		
		System.out.println(or);
		System.out.println(or.getOrl().toString());
	}

}
