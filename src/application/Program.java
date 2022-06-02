package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Products;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Products products = new Products();

		System.out.println("Digite o nome produto:");
		String name = sc.nextLine();
		System.out.println("Digite o codigo do produto:");
		long sku = sc.nextLong();
		System.out.println("Digite o preco:");
		Double price = sc.nextDouble();

		products.setName(name);
		products.setPrice(price);
		products.setSku(sku);

		products.updatedPrice(price);

		System.out.println();
		System.out.println("Produto Cadastrado:");
		System.out.println("Nome do Produto: " + products.getName());
		System.out.println("Preco Atualizado: " + products.getPrice());
		System.out.println("Sku: " + products.getSku());

	}

}
