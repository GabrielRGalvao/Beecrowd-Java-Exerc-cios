import java.util.Scanner;

public class P1046_TempoDeJogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horaInicio = sc.nextInt();
		int horaFim = sc.nextInt();
		int tempoJogo;

		if (horaInicio < horaFim) {
			tempoJogo = horaFim - horaInicio;

		} else if (horaInicio > horaFim) {
			tempoJogo = (24 - horaInicio) + horaFim;

		} else {
			tempoJogo = 24;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)%n", tempoJogo);
		
		sc.close();	

	}

}
