import java.util.Scanner;
import java.util.Locale;

public class P1005_Media1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double peso1 = 3.5;
		double peso2 = 7.5;
		
		double media = ((nota1 * peso1) + (nota2 * peso2)) / (peso1 + peso2);
		
		System.out.printf("MEDIA = %.5f%n", media);
		
		
		
		sc.close();

	}

}
