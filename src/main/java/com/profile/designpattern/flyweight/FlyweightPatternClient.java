package com.profile.designpattern.flyweight;

/*
 * 享元模式
 */
public class FlyweightPatternClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FlyweightFactory factory = new FlyweightFactory();
		
		
		Flyweight a = factory.getConcreteThing("a");
		Flyweight b = factory.getConcreteThing("b");
		a.operation();
		b.operation();
		
		a = factory.getConcreteThing("a");
		b = factory.getConcreteThing("b");
		
		a.operation();
		b.operation();
		
		//Flyweight c = new ConcreteFlyweight("c");
		//Flyweight d = new ConcreteFlyweight("d");
		
		
	}

}
