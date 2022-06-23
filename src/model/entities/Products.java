package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Products<P> {

	private String name;
	private Double price;
	private String sku;

	public Products() {

	}

	public Products(String name, Double price, String sku) {
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

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	
	
	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public String toString() {
		return "\nProduto: " + name + "\n" + "Price: " + String.format("%.2f", price) + "\n" + "Sku: " + sku + "\n";

	}

}
