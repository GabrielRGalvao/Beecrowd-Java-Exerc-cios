import java.util.Locale;
import java.util.Scanner;

public class P1038_ValorLanche {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		final double PRECO_CACHORRO_QUENTE = 4.00;
        final double PRECO_X_SALADA = 4.50;
        final double PRECO_X_BACON = 5.00;
        final double PRECO_TORRADA = 2.00;
        final double PRECO_REFRIGERANTE = 1.50;
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double valor = 0;
		
		switch (codigo) {
		case 1:
			valor = quantidade * PRECO_CACHORRO_QUENTE;
			break;
		case 2:
			valor = quantidade * PRECO_X_SALADA;
			break;
		case 3:
			valor = quantidade * PRECO_X_BACON;
			break;
		case 4:
			valor = quantidade * PRECO_TORRADA;
			break;
		case 5:
			valor = quantidade * PRECO_REFRIGERANTE;
			break;
		default:
			System.out.println("Código Inválido");
			break;
		}
		
		System.out.printf("Total: R$: %.2f%n", valor);
		sc.close();

	}

}
