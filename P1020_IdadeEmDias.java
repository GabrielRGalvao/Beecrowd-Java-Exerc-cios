import java.util.Scanner;

public class P1020_IdadeEmDias {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idadeEmDias = sc.nextInt();
		int ano, mes, dias, resto;
		
		ano = idadeEmDias / 365;
		resto = idadeEmDias % 365;
		mes = resto / 30;
		resto = resto % 30;
		dias = resto;
		
		System.out.printf("%d ano(s)%n", ano);
		System.out.printf("%d mes(es)%n", mes);
		System.out.printf("%d dia(s)%n", dias); 
		
		sc.close();
	}

}
