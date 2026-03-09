import java.util.Scanner;

public class P1078_Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int soma = 0;

		for (int i = 1; i <= 10; i++) {

			soma = i * n;
			System.out.println(i + " x " + n + " = " + soma);
		}

		sc.close();
	}

}
