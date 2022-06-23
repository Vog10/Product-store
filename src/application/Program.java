package application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Products;
import model.services.PriceUpdate;
import model.services.UpdatedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Generics
		Products<Products> products = new Products<>();
		char resp = 's';
		int cont = 0;
		List<Products> listProducts = new ArrayList<>();

		do {

			
				System.out.print("Digite o nome produto: ");
				String name = sc.nextLine();
				System.out.print("Digite o codigo do produto: ");
				String sku = sc.nextLine();
				System.out.print("Digite o preco R$ 00.00: ");
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
				System.out.printf("Preco Atualizado: %.2f",products.getPrice());
				System.out.println();
				System.out.println("Sku: " + products.getSku());
				System.out.println();
				cont++;
				
				if(cont == 1) {
				System.out.println("Ja Foram Cadastrados " + cont + " Produto");
				}else {
					System.out.println("Ja Foram Cadastrados " + cont + " Produtos");
				}
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
