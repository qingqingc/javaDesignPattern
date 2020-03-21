package com.profile.designpattern.visitor;

/*
 * 访问者（Visitor）模式
 */
public class VisitorPatternClient {
	public static void main(String[] args) {
		Element el1 = new ConcreteElementA();
		Element el2 = new ConcreteElementB();
		StructureVisitor v = new StructureVisitor();
	    Visitor vtr = new ConcreteVisitorA();
	    
	    v.add(el1);
	    v.add(el2);
	    v.go(vtr);
	    
	    System.out.println("------------------------------------------");
	    Visitor vtrB = new ConcreteVisitorB();
	    v.go(vtrB);
	    
	}
}
