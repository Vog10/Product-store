package model.services;

import model.entities.Products;

public class UpdatedProduct {

	private ProfitMargin profitMargin;

	public UpdatedProduct(ProfitMargin profitMargin) {
		this.profitMargin = profitMargin;
	}
	
	public void processProduct(Products products ) {
		
		double totalValue = products.getPrice() + profitMargin.updatedPrice(products.setPrice());
		
	}
	
	
}
