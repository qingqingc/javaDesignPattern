package com.profile.designpattern.bridge;

public class Desk extends Shape {

	private Color c;
	public Desk(Color c) {
		this.c = c;
	}
	
	@Override
	public void draw() {
		// TODO Aut
		c.render("Desk");
	}

}
