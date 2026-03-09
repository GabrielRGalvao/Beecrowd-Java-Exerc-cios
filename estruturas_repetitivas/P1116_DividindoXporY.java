import java.util.Locale;
import java.util.Scanner;

public class P1116_DividindoXporY {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();

			if (y == 0) {
				System.out.println("divisao impossivel");

			} else {
				double resultado = x / y;
				System.out.printf("%.1f%n", resultado);
			}

		}

		sc.close();
	}

}
