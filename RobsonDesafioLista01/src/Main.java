import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor para A: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor para B: ");
        int b = scanner.nextInt();

        System.out.println("--- VALORES ORIGINAIS ---");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        int aux = a;
        a = b;
        b = aux;

        System.out.println("--- VALORES TROCADOS ---");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        scanner.close();
    }
}
