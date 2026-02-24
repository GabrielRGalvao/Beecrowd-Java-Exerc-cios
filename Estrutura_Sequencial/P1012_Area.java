import java.util.Locale;
import java.util.Scanner;

public class P1012_Area {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double A = sc.nextDouble();
		Double B = sc.nextDouble();
		Double C = sc.nextDouble();
		
		Double triangulo = (A * C) / 2.0;
		Double circulo = 3.14159 * Math.pow(C, 2);
		Double trapezio = (A + B) / 2 * C;
		Double quadrado = B * B;
		Double retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();

	}

}
