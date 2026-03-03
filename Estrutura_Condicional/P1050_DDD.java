import java.util.Scanner;

public class P1050_DDD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ddd = sc.nextInt();
		String estado;
		
		switch (ddd) {
		case 61:
			estado = "Brasilia";
			break;
		case 71:
			estado = "Salvador";
			break;
		case 11:
			estado = "Sao Paulo";
			break;
		case 21:
			estado = "Rio de Janeiro";
			break;
		case 32:
			estado = "Juiz de Fora";
			break;
		case 19:
			estado = "Campinas";
			break;
		case 27:
			estado = "Vitoria";
			break;
		case 31:
			estado = "Belo Horizonte";
			break;
		default:
			estado = "DDD nao cadastrado";
			break;
		
		}
		System.out.println(estado);
		
		
		sc.close();
	}

}
