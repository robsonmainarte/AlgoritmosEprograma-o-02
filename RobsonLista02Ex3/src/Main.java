import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            int quadrado = numero * numero;
            System.out.println("O número é PAR.");
            System.out.println("O quadrado de " + numero + " é: " + quadrado);
        } else {
            int cubo = numero * numero * numero;
            System.out.println("O número é ÍMPAR.");
            System.out.println("O cubo de " + numero + " é: " + cubo);
        }

        scanner.close();
    }
}