package com.profile.designpattern.visitor;

public class ConcreteElementA implements Element {

	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visitor(this);;
	}

	public void operateA() {
		// TODO Auto-generated method stub
		System.out.println("Element A is visited.");
	}
}
