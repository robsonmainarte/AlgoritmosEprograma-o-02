import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define o padrão para aceitar ponto (.) como separador decimal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite um número real (use ponto, ex: 5.5): ");
        double numero = scanner.nextDouble();

        double dobro = numero * 2;

        System.out.println("O dobro é: " + dobro);

        scanner.close();
    }
}
