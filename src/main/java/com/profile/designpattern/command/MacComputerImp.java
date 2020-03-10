package com.profile.designpattern.command;

import java.util.ArrayList;
import java.util.List;

public class MacComputerImp implements MacComputer {

	private List<OperationCenter> commandList = new ArrayList<OperationCenter>();
	public void MacComputerComposition(OperationCenter op) {
		commandList.add(op);
	}

	public void startComputer() {
		for (OperationCenter o : commandList) {
			o.operation();
		}
	}

}
