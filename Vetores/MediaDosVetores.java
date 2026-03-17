import java.util.Locale;
import java.util.Scanner;


public class MediaDosVetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] vetor = new double[n];

		for (int i = 0; i < n; i++) {
			vetor[i] = sc.nextDouble();
		}

		double soma = 0;

		for (int i = 0; i < n; i++) {

			soma += vetor[i];
		}
		double media = soma / n;
		
		System.out.println(media);

		for (int i = 0; i < n; i++) {
			if (vetor[i] < media) {
				System.out.println(vetor[i]);
			}
		}

		sc.close();

	}

}
