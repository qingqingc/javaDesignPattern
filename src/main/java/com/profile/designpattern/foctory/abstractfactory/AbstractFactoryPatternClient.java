package com.profile.designpattern.foctory.abstractfactory;

public class AbstractFactoryPatternClient {
	public static void main(String[] args) {
		InstanceFactoryImp factory = new InstanceFactoryImp();
		AbstractFactory ab = factory.getInstanceFactory(HouseType.SOUTH_BIG);
		AbstractFactory northSmall = factory.getInstanceFactory(HouseType.NORTHSMALL);
		ab.getHouse().live();
		northSmall.getHouse().live();
	}
}
