import java.util.Scanner;

public class testeReforco2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [][] mat = new int [n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i == 0 || i == n - 1 || j == 0 || j == n - 1) {
					System.out.print(mat[i][j] + " ");
				
				}else {
					System.out.printf("  ");
				} 
			}
			System.out.println();
		}
		
		sc.close();
	}

}
