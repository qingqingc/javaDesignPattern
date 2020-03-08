package com.profile.designpattern.foctory.abstractfactory;

public class NorthSmallHouseFactory implements AbstractFactory {

	public House getHouse() {
		// TODO Auto-generated method stub
		return new NorthSmallHouse();
	}

}
