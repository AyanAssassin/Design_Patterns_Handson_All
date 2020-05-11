package com.cognizant;

public class AdapterMain {
public static void main(String[] args) {
	//Business case 1
	Movable BugattiVeyron=new BugattiVeyron();
	MovableAdapter mAdapter=new MovableAdapterImpl(BugattiVeyron);
	System.out.println("Car details according to USA standard");
	USAPattern(BugattiVeyron);
	System.out.println("Car details according to Europian standard");
	EUROPEPattern(mAdapter);
}
public static void EUROPEPattern(MovableAdapter movableAdapter){
	System.out.println("Average Speed: "+movableAdapter.getSpeed());
	System.out.println("Price: "+movableAdapter.getPrice());
}
public static void USAPattern(Movable movable){
	System.out.println("Average Speed: "+movable.getSpeed());
	System.out.println("Price: "+movable.getPrice());
}
}
