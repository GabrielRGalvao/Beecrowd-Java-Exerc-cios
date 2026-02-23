import java.util.Scanner;

public class P1004_ProdutoSimples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		
		int PROD = valor1 * valor2;
		
		System.out.printf("PROD = %d%n", PROD);
		
		
		
		sc.close();

	}

}
