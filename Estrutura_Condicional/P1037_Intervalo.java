import java.util.Locale;
import java.util.Scanner;

public class P1037_Intervalo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valor = sc.nextDouble();
		
		if (valor < 0 || valor > 100) {
			System.out.println("Fora de intervalo");
			
		}else if (valor <= 25.00) {
			System.out.println("Intervalo [0,25]");
		
		}else if (valor <= 50.00) {
			System.out.println("Intervalo (25,50]");
		
		}else {
			System.out.println("Intervalo (75,100]");
		}
		
		sc.close();

	}

}
