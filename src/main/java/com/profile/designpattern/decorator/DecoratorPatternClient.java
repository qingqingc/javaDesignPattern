package com.profile.designpattern.decorator;

public class DecoratorPatternClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Apartment a = new Apartment();
		DecoratorMyHouse1 house1 = new DecoratorMyHouse1(a);
		house1.doFloorDecorator();
	}
}
