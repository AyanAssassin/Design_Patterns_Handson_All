package com.cognizant;

public class MovableAdapterImpl implements MovableAdapter {

	private Movable luxuryCars;
	@Override
	public double getSpeed() {
		// TODO Auto-generated method stub
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}
	private double convertMPHtoKMPH(double mph){ 
		return mph * 1.60934; 
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return convertUSDtoEURO(luxuryCars.getPrice());
	}
	
	private double convertUSDtoEURO(double mph){ 
		return mph * 0.91; 
	}
	public MovableAdapterImpl(Movable luxuryCars) {
	
		this.luxuryCars = luxuryCars;
	}

}
