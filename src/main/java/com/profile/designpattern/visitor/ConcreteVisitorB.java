package com.profile.designpattern.visitor;

public class ConcreteVisitorB implements Visitor {

	public void visitor(ConcreteElementA elmtA) {
		// TODO Auto-generated method stub
		System.out.println("vb is visited.");
		elmtA.operateA();
	}

	public void visitor(ConcreteElementB elmtB) {
		// TODO Auto-generated method stub
		System.out.println("vbb is visited.");
		elmtB.operateB();
	}

}
