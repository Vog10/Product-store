package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Products;
import model.services.PriceUpdate;
import model.services.UpdatedProduct;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Products products = new Products();
		char resp = 's';
		int cont = 0;
		List<Products> listProducts = new ArrayList<>();

		do {
			System.out.println("Digite o nome produto:");
			String name = sc.nextLine();
			System.out.println("Digite o codigo do produto:");
			long sku = sc.nextLong();
			System.out.println("Digite o preco:");
			Double price = sc.nextDouble();

			products.setName(name);
			products.setPrice(price);
			products.setSku(sku);

			UpdatedProduct upProduct = new UpdatedProduct(new PriceUpdate());

			upProduct.processProduct(products);

			listProducts.add(products);

			System.out.println();
			System.out.println("Produto Cadastrado:");
			System.out.println();
			System.out.println("Nome do Produto: " + products.getName());
			System.out.println("Preco Atualizado: " + products.getPrice());
			System.out.println("Sku: " + products.getSku());
			System.out.println();
			cont++;
			System.out.println("Ja Foram Cadastrado " + cont + " Produtos");
			System.out.println("Deseja Continua S/N?");
			resp = sc.next().charAt(0);
			sc.nextLine();

			products.clearScreen();
		} while (resp != 'n');

		for (int i = 0; i < listProducts.size(); i++) {
			Products products2 = listProducts.get(i);
			System.out.print("Numero do Produto: " + i);
			System.out.println(products2);

		}
		sc.close();
	}

}
