import java.util.Scanner;

public class P1047_TempoDeJogoComMinutos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt();
		int minInicial = sc.nextInt();
		int horaFim = sc.nextInt();
		int minFim = sc.nextInt();

		int totalInicio = (horaInicial * 60) + minInicial;
		int totalFim = (horaFim * 60) + minFim;

		int duracaoTotal = totalFim - totalInicio;

		if (duracaoTotal <= 0) {
			duracaoTotal += 1440;

		}

		int horaFinal = duracaoTotal / 60;
		int minutoFinal = duracaoTotal % 60;

		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", horaFinal, minutoFinal);

		sc.close();

	}

}
