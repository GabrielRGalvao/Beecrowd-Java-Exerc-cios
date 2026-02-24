import java.util.Locale;
import java.util.Scanner;

public class P1013_OMaior {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int maiorAB = (A + B + Math.abs(A - B)) / 2;
		int maiorFinal = (maiorAB + C + Math.abs(maiorAB - C)) / 2;
		
		System.out.printf("%d eh o maior%n", maiorFinal);
		
		sc.close();

	}

}
