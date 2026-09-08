import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto (1 a 40): ");
        int codigo = scanner.nextInt();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double precoUnitario = 0;

        // Tabela I: Definição do preço unitário com base no código
        if (codigo >= 1 && codigo <= 10) {
            precoUnitario = 10.00;
        } else if (codigo >= 11 && codigo <= 20) {
            precoUnitario = 15.00;
        } else if (codigo >= 21 && codigo <= 30) {
            precoUnitario = 20.00;
        } else if (codigo >= 31 && codigo <= 40) {
            precoUnitario = 30.00;
        } else {
            System.out.println("Opção inválida! Código do produto incorreto.");
            scanner.close();
            return;
        }

        double precoTotal = precoUnitario * quantidade;
        double percentualDesconto = 0;

        // Tabela II: Definição da porcentagem de desconto
        if (precoTotal <= 250.00) {
            percentualDesconto = 0.05;
        } else if (precoTotal <= 500.00) {
            percentualDesconto = 0.10;
        } else {
            percentualDesconto = 0.15;
        }

        double valorDesconto = precoTotal * percentualDesconto;
        double precoFinal = precoTotal - valorDesconto;

        // Exibição dos resultados
        System.out.printf("Preço unitário: R$ %.2f", precoUnitario);
        System.out.printf("Preço total da nota: R$ %.2f", precoTotal);
        System.out.printf("Valor do desconto: R$ %.2f", valorDesconto);
        System.out.printf("Preço final da nota: R$ %.2f", precoFinal);

        scanner.close();
    }
}