package com.profile.designpattern.command;

public class DiskOperation implements OperationCenter {
	private Computer c;
	public DiskOperation(String deviceName) {
		c = new ComputerImp(deviceName);
	}

	public void operation() {
		// TODO Auto-generated method stub
		c.startDisk();
	}

}
