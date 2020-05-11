package com.cognizant.impl;

import com.cognizant.interfaces.IAccessoryRepair;


public class AccessoryRepair implements IAccessoryRepair {

	@Override
	public void ProcessAccessoryRepair(String accessoryType) {
		
		System.out.println(String.format("%s repair accepted!", accessoryType));

	}

}
