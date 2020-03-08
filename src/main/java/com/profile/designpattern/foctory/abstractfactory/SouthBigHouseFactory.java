package com.profile.designpattern.foctory.abstractfactory;

public class SouthBigHouseFactory implements AbstractFactory {

	public House getHouse() {
		// TODO Auto-generated method stub
		return new SouthBigHouse();
	}

}
