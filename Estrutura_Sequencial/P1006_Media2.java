import java.util.Scanner;
import java.util.Locale;

public class P1006_Media2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 Locale.setDefault(Locale.US);
		 
		 double nota1 = sc.nextDouble();
		 double nota2 = sc.nextDouble();
		 double nota3 = sc.nextDouble();
		 double peso1 = 2;
		 double peso2 = 3;
		 double peso3 = 5;
		 
		 double media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
		 
		 System.out.printf("MEDIA = %.1f%n", media);
		
		sc.close();
	}

}
