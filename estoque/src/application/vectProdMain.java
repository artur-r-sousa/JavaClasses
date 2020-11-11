package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProdEnt;

public class vectProdMain {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ProdEnt[] vect = new ProdEnt[n];
		
		for (int i = 0; i < vect.length; i++ ) {
			
			sc.nextLine();
			String prodName = sc.nextLine();
			double prodPrice = sc.nextDouble();
			
			vect[i] = new ProdEnt(prodName, prodPrice);
			
		}
		
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			
			sum += vect[i].getProdPrice();
			
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("Average Price: %.2f%n", avg);
		
		sc.close();


	}

}
