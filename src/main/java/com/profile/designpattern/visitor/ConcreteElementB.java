package com.profile.designpattern.visitor;

public class ConcreteElementB implements Element {

	public void operateB() {
		// TODO Auto-generated method stub
		System.out.println("Element B is visited.");
	}

	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visitor(this);
	}

}
