import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int n2 = scanner.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int n3 = scanner.nextInt();

        int soma = n1 + n2 + n3;

        double media = (double) soma / 3;


        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Soma: " + soma);
        System.out.println("Média aritmética: " + media);

        scanner.close();
    }
}
