package com.profile.designpattern.command;

public class CommandPatterClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String deviceName = "Mac Book pro";
		PowerOperation pOpr = new PowerOperation(deviceName);
		DiskOperation dskOpr = new DiskOperation(deviceName);
		
		MacComputer mac = new MacComputerImp();
		mac.MacComputerComposition(pOpr);
		mac.MacComputerComposition(dskOpr);
		mac.startComputer();
	}

}
