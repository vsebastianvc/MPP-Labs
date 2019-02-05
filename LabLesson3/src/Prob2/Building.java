package Prob2;

import java.util.ArrayList;

public class Building {

	private String name;
	public Landlord idLandlord;
	private ArrayList<Apartment> listApartment;
	private double maintenance;
	
	public Building(String name, Landlord idLandlord, double maintenance) {
		if(idLandlord==null) 
			throw  new IllegalArgumentException(" landlord should not be null");
		this.name = name;
		this.idLandlord = idLandlord;
		this.maintenance = maintenance;
		idLandlord.getListBuilding().add(this);
		this.listApartment = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMaintenance() {
		return maintenance;
	}

	public void setMaintenance(double maintenance) {
		this.maintenance = maintenance;
	}

	public Landlord getIdLandlord() {
		return idLandlord;
	}

	public ArrayList<Apartment> getListApartment() {
		return listApartment;
	}

	public double calculateProfit() {
		double income = 0;
		for (Apartment ap : listApartment)
			income += ap.getRent();
		return income - maintenance;
	}
	
	
}
