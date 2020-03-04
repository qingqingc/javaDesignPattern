package com.profile.designpattern.templateMethod;

public class TemplateMethodPatternClient {

	public static void main(String[] args) {
		AbstractDrink hot = new HotHealthDrink();
		AbstractDrink cold = new ColdDrinkForStrongMan();
		hot.drink();
		System.out.println("--------------------");
		cold.drink();
	}

}
