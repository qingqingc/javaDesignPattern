package com.profile.designpattern.foctory.simplefactory;

public class SimpleFactoryPatternClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductType pt = ProductType.CUP;
		ProductFactoryImp p = new ProductFactoryImp();
		Product cupp = p.generateProduct(ProductType.CUP);
		Product pencilp = p.generateProduct(ProductType.PENCIL);
		cupp.doing();
		pencilp.doing();
	}

}
