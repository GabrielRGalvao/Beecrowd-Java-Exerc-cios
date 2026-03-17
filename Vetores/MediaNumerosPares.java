import java.util.Scanner;

public class MediaNumerosPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] vetor = new int [n];
		
		for(int i = 0; i < n; i++) {
			vetor[i] = sc.nextInt();
		}
		
		int soma = 0;
		int quantidadePares = 0;
		
		for(int i = 0; i < n; i++) {
			if(vetor[i] % 2 == 0) {
				soma += vetor[i];
				quantidadePares++;
			}
		}
		
		if(quantidadePares > 0) {
			double media = (double) soma / quantidadePares;
			System.out.printf("%.1f%n", media);
		
		}else {
			System.out.println("Não foram digitados números pares.");
		}
		
		sc.close();

	}

}
