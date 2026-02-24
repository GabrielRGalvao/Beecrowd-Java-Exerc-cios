import java.util.Scanner;

public class P1061_TempoEvento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		sc.next();
		int diaInicio = sc.nextInt();
		
		int horaInicio = sc.nextInt();
		sc.next();
		
		int minutoInicio = sc.nextInt();
		sc.next();
		
		int segundoInicio = sc.nextInt();
		
		sc.next();
		int diaFim = sc.nextInt();
		
		int horaFim = sc.nextInt();
		sc.next();
		
		int minutoFim = sc.nextInt();
		sc.next();
		
		int segundoFim = sc.nextInt();
		
		
		int segundosDiaInicio = diaInicio * 86400;
		int segundosHoraInicio = horaInicio * 3600;
		int segundosMinutoInicio = minutoInicio * 60;
		int segundosInicio = segundoInicio;
		
		int segundosDiaFim = diaFim * 86400;
		int segundosHoraFim = horaFim * 3600;
		int segundosMinutoFim = minutoFim * 60;
		int segundosFim = segundoFim;
		
		int totalSegundosInicio = segundosDiaInicio + segundosHoraInicio + segundosMinutoInicio + segundosInicio;
		int totalSegundosFim = segundosDiaFim + segundosHoraFim + segundosMinutoFim + segundosFim;
		
		int duracao = totalSegundosFim - totalSegundosInicio;
		
		int dias = duracao / 86400;
		duracao %= 86400;
		
		int horas = duracao / 3600;
		duracao %= 3600;
		
		int minutos = duracao / 60;
		duracao %= 60;
		
		int segundos = duracao;
		
		System.out.printf("%d dia(s)%n", dias);
		System.out.printf("%d hora(s)%n", horas);
		System.out.printf("%d minuto(s)%n", minutos);
		System.out.printf("%d segundo(s)%n", segundos);
		
		
		
		sc.close();

	}

}
