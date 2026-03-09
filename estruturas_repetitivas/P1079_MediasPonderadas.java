import java.util.Locale;
import java.util.Scanner;

public class P1079_MediasPonderadas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double soma = (a * 2.00 + b * 3.00 + c * 5.00) / 10.00;
			
			System.out.printf("%.1f%n", soma);
		}
		
		sc.close();

	}

}
