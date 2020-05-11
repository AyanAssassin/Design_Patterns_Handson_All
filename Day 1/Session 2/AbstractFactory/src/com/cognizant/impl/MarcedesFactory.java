package com.cognizant.impl;

import com.cognizant.abstractClass.Factory;
import com.cognizant.abstractClass.Headlight;
import com.cognizant.abstractClass.Tire;

public class MarcedesFactory extends Factory {

	@Override
	public Headlight makeHeadlight() {
		// TODO Auto-generated method stub
		return new MarcedesHeadlight();
	}

	@Override
	public Tire makeTire() {
		// TODO Auto-generated method stub
		return new MarcedesTire();
	}

}
