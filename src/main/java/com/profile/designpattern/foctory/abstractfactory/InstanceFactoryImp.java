package com.profile.designpattern.foctory.abstractfactory;

public class InstanceFactoryImp implements InstanceFactory {

	public AbstractFactory getInstanceFactory(HouseType ht) {
		// TODO Auto-generated method stub
		if (HouseType.SOUTH_BIG.equals(ht)) {
			return new SouthBigHouseFactory();
		} else if (HouseType.NORTHSMALL.equals(ht)) {
			return new NorthSmallHouseFactory();
		}
		
		return null;
	}

	public AbstractFactory getInstanceFactory() {
		// TODO Auto-generated method stub
		return null;
	}

}
