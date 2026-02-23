import java.util.Scanner;
import java.util.Locale;

public class P1002_AreaCirculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double N = 3.14159;
		double raio = sc.nextDouble();
		
		double area = N * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f%n", area);
		
		
		sc.close();
	}

}
