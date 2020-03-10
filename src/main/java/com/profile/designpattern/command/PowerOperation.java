package com.profile.designpattern.command;

public class PowerOperation implements OperationCenter {

	private Computer cpt;
	
	public PowerOperation(String deviceName) {
		cpt = new ComputerImp(deviceName);
	}
	public void operation() {
		cpt.initPower();
	}

}
