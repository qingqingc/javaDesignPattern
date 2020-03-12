package com.profile.designpattern.strategy;

public class StrategyPatternClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteStategyOne one = new ConcreteStategyOne();
		StrategyContainer c = new StrategyContainer(one);
		c.doConcreteStrategy();
		
		ConcreteStategyTwo two = new ConcreteStategyTwo();
		c.setStgy(two);
		two.doConcreteStrategy();
	}

}
