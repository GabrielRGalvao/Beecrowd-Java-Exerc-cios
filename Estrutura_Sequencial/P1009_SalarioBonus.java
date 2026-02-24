import java.util.Scanner;
import java.util.Locale;

public class P1009_SalarioBonus {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		String nome = sc.next();
		Double salario = sc.nextDouble();
		Double totalVendas = sc.nextDouble();
		
		Double ganhoComVendas = totalVendas / 100 * 15;
		Double totalAreceber = salario + ganhoComVendas;
		
		System.out.printf("TOTAL = R$ %.2f%n", totalAreceber);
		
		sc.close();

	}

}
