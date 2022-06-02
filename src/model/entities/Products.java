package model.entities;

public class Products {

	private String name;
	private Double price;
	private Long sku;
	
	public Products() {
		
	}

	public Products(String name, Double price, Long sku) {
		this.name = name;
		this.price = price;
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	public Long getSku() {
		return sku;
	}

	public void setSku(Long sku) {
		this.sku = sku;
	}

	
	
	
	
}
