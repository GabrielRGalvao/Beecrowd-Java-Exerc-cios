import java.util.Scanner;
import java.util.Locale;

public class P1014_Consumo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int distanciaPercorrida = sc.nextInt();
		double combustivelGasto = sc.nextDouble();
		
		double combustivelMedio = distanciaPercorrida / combustivelGasto;
		
		System.out.printf("%.3f km/l%n", combustivelMedio);
		
		sc.close();
		
	}

}
