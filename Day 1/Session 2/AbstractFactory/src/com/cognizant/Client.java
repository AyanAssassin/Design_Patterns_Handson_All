package com.cognizant;

import java.util.Scanner;

import com.cognizant.abstractClass.Factory;
import com.cognizant.abstractClass.Headlight;
import com.cognizant.abstractClass.Tire;
import com.cognizant.impl.AudiFactory;
import com.cognizant.impl.MarcedesFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice = 0;
		Scanner sc = new Scanner(System.in);
		Factory factory;
		do {
			System.out.print("Do you want Audi or Mercedes? : ");
			String str = sc.nextLine().toLowerCase(); 
			switch (str) {
			case "audi":{
				factory = new AudiFactory();
				break;
			}
			case "mercedes":{
				factory = new MarcedesFactory();
				break;
			}
			default:
				factory=null;
			}
			if(factory!=null) {
			Headlight headlight = factory.makeHeadlight();
			Tire tire = factory.makeTire();
			headlight.flash();
			tire.start();
			}
			System.out.print("Enter 1 for more cars else enter 0 : ");
			choice = Integer.parseInt(sc.nextLine());
		}
		while(choice==1);
		sc.close();

	}

}
