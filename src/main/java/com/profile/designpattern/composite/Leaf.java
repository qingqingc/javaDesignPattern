package com.profile.designpattern.composite;

import java.util.List;

public class Leaf implements Component {
	private String leafName;
	
	public Leaf(String leafName) {
		this.leafName = leafName;
	}

	public void add(Component c) {
		// TODO Auto-generated method stub
		
	}

	public void remove(Component c) {
		// TODO Auto-generated method stub
		
	}

	public List<Component> getChirld() {
		// TODO Auto-generated method stub
		return null;
	}

	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("I a leaf: " + leafName);
	}

}
