import java.util.Scanner;

public class testeReforço {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		int [][] mat = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int soma = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i == 0 || i == n - 1 || j == 0 || j == n - 1) {
					soma += mat[i][j];
				}
			}
		}
		System.out.println(soma);
		
		
		sc.close();

	}

}
