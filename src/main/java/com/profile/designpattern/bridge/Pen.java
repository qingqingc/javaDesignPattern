package com.profile.designpattern.bridge;

public class Pen extends Shape {
	private Color c;
	public Pen(Color c) {
		this.c = c;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		c.render("Pen");
	}

}
