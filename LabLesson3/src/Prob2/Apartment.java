package Prob2;

public class Apartment {

	private double rent;

	public Apartment(double rent,Building bd) {
		if(bd == null)
			throw new IllegalArgumentException("building should not be null");
		this.rent=rent;
		bd.getListApartment().add(this);
	}

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}

}
