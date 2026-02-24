import java.util.Scanner;

public class P1008_Salario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorHora = sc.nextDouble();
		
		double salario = horasTrabalhadas * valorHora;
		
		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", numeroFuncionario, salario);
		
		
		sc.close();

	}

}
