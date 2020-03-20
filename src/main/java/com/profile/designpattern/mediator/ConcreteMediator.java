package com.profile.designpattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator extends Mediator {

	public List<Colleague> arr = new ArrayList<Colleague>();
	@Override
	public void register(Colleague c) {
		// TODO Auto-generated method stub
		arr.add(c);
		c.setM(this);
	}

	@Override
	public void relay(Colleague c) {
		// TODO Auto-generated method stub
		for (Colleague cge : arr) {
			if (!cge.equals(c)) {
				cge.receive();
			}
 		}
	}

}
