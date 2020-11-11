
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String x, a, b, c;
		
		int y;
		
		double z;
				
		x = sc.next();

		y = sc.nextInt();
		
		z = sc.nextDouble();
		
		a = sc.nextLine();
		
		b = sc.nextLine();
		
		c = sc.nextLine();
		
		System.out.println("Entrada 1 valor: " + x);
		System.out.println("Entrada 2 valor: " + y);
		System.out.println("Entrada 3 valor: " + z);
		
		System.out.println("Valores digitados: " + a);
		System.out.println("Valores digitados: " + b);
		System.out.println("Valores digitados: " + c);
		
		sc.close();
		
	}

}
