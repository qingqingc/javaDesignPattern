package com.profile.designpattern.interpreter;

import java.util.HashSet;
import java.util.Set;

public class PersonExpression implements Expression {
	private Set<String> personH = new HashSet<String>();
	public PersonExpression(String[] arrPerson) {
		if (arrPerson != null) {
			for(String person : arrPerson) {
				personH.add(person);
			}
		}
	}
	
	public boolean interpreter(String name) {
		boolean t = false;
		if (personH.contains(name)) {
			t = true;
		}
		return t;
	}
}
