package com.profile.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverListener {
	public List<Oberver> arrLtr = new ArrayList<Oberver>();
	
	public void addToListener(Oberver o) {
		arrLtr.add(o);	
	}
	
	public void removeFromListener(Oberver o) {
		arrLtr.remove(o);
	}
	
	public void notifyAllObserver() {
		for (Oberver o : arrLtr) {
			o.newMsg();
		}
	}
}
