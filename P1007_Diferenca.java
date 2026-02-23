import java.util.Scanner;

public class P1007_Diferenca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		int valor3 = sc.nextInt();
		int valor4 = sc.nextInt();
		
		int diferenca = (valor1 * valor2 - valor3 * valor4);
		
		System.out.printf("DIFERENCA = %d%n", diferenca);
		
		sc.close();

	}

}
