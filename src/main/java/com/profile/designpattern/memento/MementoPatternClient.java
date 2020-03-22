package com.profile.designpattern.memento;

public class MementoPatternClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Originator o = new Originator();
		Caretaker ct = new Caretaker();
		o.setState("open");
		System.out.println("the first state is:" + o.getState());
		Memento m = o.createMemento();
		ct.setM(m);
		o.setState("close");
		System.out.println("the second state is:" + o.getState());
		o.restoreState(m);
		System.out.println("the final restore state is:" + o.getState());
	}

}
