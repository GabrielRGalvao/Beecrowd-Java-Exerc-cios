package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramProduct {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.print("Enter name: ");
		product.name = sc.nextLine();
		
		System.out.print("Enter grossPrice: ");
		product.grossPrice = sc.nextDouble();
		
		System.out.print("Enter tax: ");
		product.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the tax amount: ");
		double percentage = sc.nextDouble();
		product.increasePrice(percentage);
		
		System.out.println();
		System.out.print("Updated data: " + product);
		
		sc.close();
		
	}

}
