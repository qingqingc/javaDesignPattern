package com.profile.designpattern.decorator;

public class DecoratorFactory {
	private Apartment apt;
	public DecoratorFactory(Apartment apt) {
		this.apt = apt;
	}
	
	public void doFloorDecorator() {
		apt.doFloorDecorator();
	}
}
