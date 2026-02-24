import java.util.Scanner;

public class P1016_Distancia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int velocidadeDeSaida = sc.nextInt();
		int tempoEmMinutos = velocidadeDeSaida * 2;
		
		System.out.printf("%d minutos%n", tempoEmMinutos);
		
		sc.close();

	}

}
