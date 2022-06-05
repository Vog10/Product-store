package model.services;

import model.entities.Products;

public class UpdatedProduct {

	private ProfitMargin profitMargin;

	public UpdatedProduct(ProfitMargin profitMargin) {
		this.profitMargin = profitMargin;
	}
	
	public void processProduct(Products products) {
		
	 	double upProduct = products.getPrice();
	    upProduct += profitMargin.updatedPrice(upProduct);
	 	
	 	products.setPrice(upProduct);
	 	
	}
	
	
}
