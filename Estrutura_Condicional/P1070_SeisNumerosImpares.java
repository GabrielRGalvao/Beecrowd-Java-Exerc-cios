import java.util.Scanner;

public class P1070_SeisNumerosImpares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			numero ++;
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println(numero);
			numero = numero + 2;
		}
		
		sc.close();
	}

}
