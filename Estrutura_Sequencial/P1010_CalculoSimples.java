import java.util.Scanner;
import java.util.Locale;

public class P1010_CalculoSimples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int codPeca1 = sc.nextInt();
		int quantPeca1 = sc.nextInt();
		double valorPeca1 = sc.nextDouble();
		int codPeca2 = sc.nextInt();
		int quantPeca2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();
		
		double ValorTotalPecas1 = quantPeca1 * valorPeca1;
		double ValorTotalPecas2 = quantPeca2 * valorPeca2;
		
		double totalApagar = ValorTotalPecas1 + ValorTotalPecas2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalApagar);
		
		
		sc.close();

	}

}
