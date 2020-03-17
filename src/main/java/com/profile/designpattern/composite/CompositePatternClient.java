package com.profile.designpattern.composite;

public class CompositePatternClient {

	public static void main(String[] args) {
		Trunk c0 = new Trunk("c0");
		Trunk c1 = new Trunk("c1");
		c0.add(c1);
		
		Leaf leaf1 = new Leaf("leaf1");
        Leaf leaf2 = new Leaf("leaf2");
        Leaf leaf3 = new Leaf("leaf3");
        
        c0.add(leaf1);
        
        c1.add(leaf2);
        c1.add(leaf3);
        
        c1.operation();
	}

}
