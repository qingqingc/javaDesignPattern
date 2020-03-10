package com.profile.designpattern.command;

public class ComputerImp implements Computer {

	private String commandName;
	
	public ComputerImp(String commandName) {
		this.commandName = commandName;
	}
	public void initPower() {
		System.out.println(commandName + " power will be initialization.");
	}

	public void startDisk() {
		System.out.println(commandName + " disk driver will be start.");
		
	}
}
