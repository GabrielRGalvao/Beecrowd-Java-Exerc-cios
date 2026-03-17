import java.util.Locale;
import java.util.Scanner;

public class MaiorNumeroEposicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] vet = new double[n];

		for (int i = 0; i < n; i++) {
			vet[i] = sc.nextDouble();
		}

		double maior = vet[0];
		int posicao = 0;

		for (int i = 1; i < n; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
				posicao = i;
			}
		}
		System.out.println(maior);
		System.out.println(posicao);

		sc.close();

	}

}
