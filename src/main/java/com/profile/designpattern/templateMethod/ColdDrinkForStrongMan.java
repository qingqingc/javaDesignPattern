package com.profile.designpattern.templateMethod;

public class ColdDrinkForStrongMan extends AbstractDrink {

	@Override
	public void addColdWater() {
		System.out.println("I need a cold drink.90%");

	}

	@Override
	public void addHotWater() {
		System.out.println("I need a hot drink.10%");

	}

}
