import java.util.Scanner;

public class DoisVetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		int[] vetorC = new int[n];

		for (int i = 0; i < n; i++) {
			vetorA[i] = sc.nextInt();

		}

		for (int i = 0; i < n; i++) {
			vetorB[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {

			vetorC[i] = vetorA[i] + vetorB[i];
			
			System.out.print(" " + vetorC[i]);
		}

		sc.close();
	}

}
