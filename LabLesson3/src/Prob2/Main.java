package Prob2;

public class Main {

	public static void main(String[] args) {
		Landlord  ld= new Landlord();
		
		Building bd1= new Building("bd1",ld,50);
		
		new Apartment(100,bd1);
		new Apartment(200,bd1);
		new Apartment(300,bd1);
		
		Building bd2= new Building("bd2",ld,100);
		new Apartment(400,bd2);
		new Apartment(500,bd2);
		new Apartment(600,bd2);
		
		System.out.println(ld.getProfit());
		
		

	}
}
