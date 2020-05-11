package com.cognizant;

import java.util.Scanner;

import com.cognizant.impl.AccessoryRepair;
import com.cognizant.impl.PhoneOrder;
import com.cognizant.impl.PhoneRepair;
import com.cognizant.interfaces.IAccessoryRepair;
import com.cognizant.interfaces.IOrder;
import com.cognizant.interfaces.IRepair;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to our site. Would you like to order or repair?");
		String processOrder = sc.nextLine();
		
		String productDetail = null;
		
		switch (processOrder) {
		case "order":
			IOrder iOrder = new PhoneOrder();
			System.out.println("Please provide Phone Model Name");
			productDetail = sc.nextLine();
			iOrder.ProcessOrder(productDetail);
			break;
		case "repair":
			System.out.println("Is it the phone or the accessory that you want to be repaired?");
			String productType = sc.nextLine();
			if (productType.equals("phone")) {
				IRepair iProcessPhoneRepair = new PhoneRepair();
				System.out.println("Please provide the Phone Model Name");
				productDetail = sc.nextLine();
				iProcessPhoneRepair.ProcessPhoneRepair(productDetail);
			} else {
				IAccessoryRepair iProcessAccessoryRepair = new AccessoryRepair();
				System.out.println("Please provide the accessory detail, like headphone, tempered glass");
				productDetail = sc.nextLine();
				iProcessAccessoryRepair.ProcessAccessoryRepair(productDetail);
			}
			break;
		default:
			break;
		}
		sc.close();
	}

}
