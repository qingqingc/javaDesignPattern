package com.profile.designpattern.facade;

public class Facade implements ComputerDevice {
	private Cpu cpu;
	private StorageDisk storageDisk;
	
	public Facade() {
		cpu = new Cpu();
		storageDisk = new StorageDisk();
	}

	public void start() {
		System.out.println("Start this computer.");
		cpu.start();
		storageDisk.start();
		System.out.println("completed!");
	}
}
