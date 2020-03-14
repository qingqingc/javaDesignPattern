package com.profile.designpattern.state;

public class StatePatternClient {
	public static void main(String[] args) {
		Environment en = new Environment();
		en.handle();
		en.handle();
		en.handle();
		en.handle();
	}
}
