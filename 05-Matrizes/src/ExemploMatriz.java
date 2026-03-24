import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a ordem da matriz (N): ");
		int n = sc.nextInt();

		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.println("MATRIZ COMPLETA:");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println();
		System.out.print("DIAGONAL PRINCIPAL: ");
		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}

		sc.close();
	}
}