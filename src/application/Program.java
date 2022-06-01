package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Products;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		
		Products products = new Products();
		
		System.out.println("digite o nome produto:");
		String name = sc.nextLine();
		System.out.println("digite o preco:");
		Double price = sc.nextDouble();
		
		products.setName(name);
		products.setPrice(price);
		
		products.updatedPrice(price);
		
		System.out.println(products.getPrice() + " " +products.getName());
		
	}

}
