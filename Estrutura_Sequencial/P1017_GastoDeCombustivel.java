import java.util.Scanner;
import java.util.Locale;

public class P1017_GastoDeCombustivel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double tempoViagem = sc.nextDouble();
		double velocidadeMedia = sc.nextDouble();
		int kmPorLitro = 12;
		
		double quantLitrosGastos = (tempoViagem * velocidadeMedia) / kmPorLitro;
		
		
		System.out.printf("%.3f%n", quantLitrosGastos);
		
		sc.close();

	}

}
