package com.cognizant.impl;

import com.cognizant.interfaces.IOrder;

public class PhoneOrder implements IOrder {

	@Override
	public void ProcessOrder(String modelName) {
		System.out.println(String.format("%s order accepted!", modelName));

	}

}
