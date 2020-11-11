package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double areaX, areaY;
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures for triangle x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures for triangle y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		areaX = x.area();
		areaY = y.area();
		
		System.out.printf("Area x: %.4f%n", areaX);
		System.out.printf("Area y: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.printf("Larger Area: x with %.4f%n", areaX);
		}else {
			System.out.printf("Larger Area: y with %.4f%n", areaY);
		}
		
		sc.close();

	}

}
