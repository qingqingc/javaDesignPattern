package com.profile.designpattern.observer;

public class ObserverPatternClient {

	public static void main(String[] args) {
		Subject s = new Subject("good");
		
		ObserverListener listener = new ObserverListener();
		
		Oberver ob1 = new Oberver(s, "berry", listener);
		Oberver ob2 = new Oberver(s, "ann", listener);
		Oberver ob3 = new Oberver(s, "gege", listener);
		
		System.out.println("--------------------------");
		ob1.update("get up.");
		
		ob2.removeListener();
		System.out.println("--------------------------");
		ob1.update("go to bed.");
	}

}
