package com.profile.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class StructureVisitor {
	private List<Element> arr = new ArrayList<Element>();
	
	public void add(Element e) {
		arr.add(e);
	}
	
	public void remove(Element e) {
		arr.remove(e);
	}
	
	public void go(Visitor vtr) {
		for (Element e : arr) {
			e.accept(vtr);
		}
	}
}
