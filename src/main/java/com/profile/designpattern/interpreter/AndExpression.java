package com.profile.designpattern.interpreter;

public class AndExpression implements Expression {
	private CityExpression ce;
	private PersonExpression pe;
	public AndExpression(CityExpression ce, PersonExpression pe) {
		this.ce = ce;
		this.pe = pe;
	}
	
	public boolean interpreter(String name) {
		boolean t = false;
		if (name != null ) {
			String[] arr = name.split("的");
		    t = ce.interpreter(arr[0]) && pe.interpreter(arr[1]);
		}

		return t;
	}
}
