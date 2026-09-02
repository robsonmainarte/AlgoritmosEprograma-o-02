import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o salário atual (R$): ");
        double salarioAtual = scanner.nextDouble();

        System.out.print("Digite a porcentagem de aumento (%): ");

        double porcentagemAumento = scanner.nextDouble();

        double valorAumento = salarioAtual * (porcentagemAumento / 100);

        double novoSalario = salarioAtual + valorAumento;

        System.out.println("\n--- REAJUSTE SALARIAL ---");
        System.out.printf("Valor do aumento: R$ %.2f\n", valorAumento);
        System.out.printf("Novo salário: R$ %.2f\n", novoSalario);

        scanner.close();
    }
}
