import java.util.Locale;
import java.util.Scanner;

public class ConjuntoDeDados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] sexo = new char[n];
		
		for(int i = 0; i < n; i++) {
			altura[i] = sc.nextDouble();
			sexo[i] = sc.next().charAt(0);
		}
		
		double maiorAltura = altura[0];
		double menorAltura = altura[0];
		double somaAlturaMulheres = 0.0;
		int contMulheres = 0;
		int contHomens = 0;
		
		for(int i = 0; i < n; i++) {
			
			if(altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
			
			if(altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
			
			if(sexo[i] == 'F') {
				somaAlturaMulheres += altura[i];
				contMulheres++;
			
			}else {
				contHomens++;
			}
		}
		
		System.out.printf("Menor altura: = %.2f%n", menorAltura);
		System.out.printf("Menor altura: = %.2f%n", maiorAltura);
		
		if(contMulheres > 0) {
			double media = somaAlturaMulheres / contMulheres;
			System.out.printf("Media altura mulheres: = %.2f%n", media);
		}
		
		System.out.println("Numero de homens = " + contHomens);
		
		sc.close();
	}

}
