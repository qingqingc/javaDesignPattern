package com.profile.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private Map<String, Flyweight> fyLst = new HashMap<String, Flyweight>();
	
	public Flyweight getConcreteThing(String nameStr) {
		Flyweight w = null; 
		w = fyLst.get(nameStr);
		if (w != null) {
			System.out.println("no need to construct again.");
			return w;
		} else {
			w = new ConcreteFlyweight(nameStr);
			fyLst.put(nameStr, w);
		}
		return w;
	}
}
