package com.profile.designpattern.interpreter;

import java.util.HashSet;
import java.util.Set;

public class CityExpression implements Expression {
	private Set<String> cityH = new HashSet<String>();
	public CityExpression(String[] arrCity) {
		if (arrCity != null) {
			for(String city : arrCity) {
				cityH.add(city);
			}
		}
	}
	
	public boolean interpreter(String cityName) {
		boolean t = false;
		if (cityH.contains(cityName)) {
			t = true;
		}
		return t;
	}
}
