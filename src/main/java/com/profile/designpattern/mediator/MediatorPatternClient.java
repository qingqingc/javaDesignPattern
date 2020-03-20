package com.profile.designpattern.mediator;

/**
 * 
 * 中介者设计模式。
 *
 */
public class MediatorPatternClient {

	public static void main(String[] args) {
		Mediator m = new ConcreteMediator();
		Colleague c1 = new ConcreteColleague1();
		Colleague c2 = new ConcreteColleague2();
		m.register(c1);
		m.register(c2);
		
		c1.send();
		c2.send();
	}

}
