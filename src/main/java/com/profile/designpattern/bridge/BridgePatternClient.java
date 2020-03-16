package com.profile.designpattern.bridge;

public class BridgePatternClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color white = new WhiteColor();
		Shape s = new Desk(white);
		s.draw();
		
		
		Color black = new BlackColor();
		Shape b = new Desk(black);
		b.draw();
		b = new Pen(black);
		b.draw();
	}

}
