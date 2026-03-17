import java.util.Scanner;

public class PessoaMaisVelha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String [] nomes = new String [n];
		int [] idades = new int [n];
		
		for(int i = 0; i < n; i++) {
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
		}
		
		int maiorIdade = idades[0];
		int posicaoMaiorIdade = 0;
		
		for(int i = 1; i < n; i++) {
			if(idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				posicaoMaiorIdade = i;
			}
		}
		System.out.println("Pessoa mais velha: " + nomes[posicaoMaiorIdade]);
		
		sc.close();
		
	}

}
