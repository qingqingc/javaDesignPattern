package com.profile.designpattern.decorator;

public class DecoratorMyHouse1 extends DecoratorFactory {
	public DecoratorMyHouse1(Apartment apt) {
		super(apt);
	}
	
	@Override
	public void doFloorDecorator() {
		super.doFloorDecorator();
		doSomeCustomize();
	}
	
	public void doSomeCustomize() {
		System.out.println("I need a very good mood floor.");
	}
}
