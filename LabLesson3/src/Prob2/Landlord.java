package Prob2;

import java.util.ArrayList;

public class Landlord {
	public ArrayList<Building> lBuilding = new ArrayList<Building>();

	public ArrayList<Building> getListBuilding(){
		return this.lBuilding;
	}
	
	public double getProfit() {
		int p=0;
		for(Building bd:lBuilding) {
			p+=bd.calculateProfit();
		}
		return p;
	}
	
}
