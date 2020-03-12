package com.profile.designpattern.strategy;

public class StrategyContainer {
	public Strategy stgy;
	public StrategyContainer (Strategy stgy) {
		this.stgy = stgy;
	}
	
	public void setStgy(Strategy stgy) {
		this.stgy = stgy;
	}
	
	public void doConcreteStrategy() {
		stgy.doConcreteStrategy();
	}
}
