import java.util.Scanner;

public class P1073_QuadradoDePares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int quadrado = 0;
		
		for(int i = 1; i <= n; i++) {
			
			if(i % 2 == 0) {
				quadrado = i * i;
				System.out.println(i + "^2 = " + quadrado);
			}
		}
		
		sc.close();

	}

}
