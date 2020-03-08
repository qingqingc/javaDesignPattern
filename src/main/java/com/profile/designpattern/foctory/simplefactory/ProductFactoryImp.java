package com.profile.designpattern.foctory.simplefactory;

public class ProductFactoryImp implements ProductFactory {

	public Product generateProduct(ProductType productType) {
		// TODO Auto-generated method stub
		if (productType.equals(ProductType.CUP)) {
			return new Cup();
		} else if (productType.equals(ProductType.PENCIL)) {
			return new Pencil();
		}
		return null;
	}

}
