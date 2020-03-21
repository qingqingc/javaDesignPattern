package com.profile.designpattern.visitor;

public class ConcreteVisitorA implements Visitor {

	public void visitor(ConcreteElementA elmtA) {
		// TODO Auto-generated method stub
		System.out.println("vaa is visited.");
		elmtA.operateA();
	}

	public void visitor(ConcreteElementB elmtB) {
		// TODO Auto-generated method stub
		System.out.println("vab is visited.");
		elmtB.operateB();
	}
	
}
