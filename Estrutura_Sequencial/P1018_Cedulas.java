import java.util.Scanner;

public class P1018_Cedulas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int valor = sc.nextInt();
        
        System.out.println(valor);
        
        int atual = valor;
        
        int notas100 = atual / 100;
        atual %= 100;
        
        int notas50 = atual / 50;
        atual %= 50;
        
        int notas20 = atual / 20;
        atual %= 20;
        
        int notas10 = atual / 10;
        atual %= 10;
        
        int notas5 = atual / 5;
        atual %= 5;
        
        int notas2 = atual / 2;
        atual %= 2;
        
        int notas1 = atual;
        
        System.out.printf("%d nota(s) de R$ 100,00%n", notas100);
        System.out.printf("%d nota(s) de R$ 50,00%n", notas50);
        System.out.printf("%d nota(s) de R$ 20,00%n", notas20);
        System.out.printf("%d nota(s) de R$ 10,00%n", notas10);
        System.out.printf("%d nota(s) de R$ 5,00%n", notas5);
        System.out.printf("%d nota(s) de R$ 2,00%n", notas2);
        System.out.printf("%d nota(s) de R$ 1,00%n", notas1);
        
        sc.close();
    }
}