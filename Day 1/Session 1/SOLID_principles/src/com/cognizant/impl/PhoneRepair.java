package com.cognizant.impl;

import com.cognizant.interfaces.IRepair;

public class PhoneRepair implements IRepair{

	@Override
	public void ProcessPhoneRepair(String modelName) {
		
		System.out.println(String.format("%s repair accepted!", modelName));
		
	}

}
