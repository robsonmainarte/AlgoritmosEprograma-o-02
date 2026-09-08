import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da renda mensal: R$ ");
        double renda = scanner.nextDouble();

        System.out.print("Digite o valor da prestação mensal desejada: R$ ");
        double prestacao = scanner.nextDouble();

        double limitePrestacao = renda * 0.30;

        // Regra 1: Prestação não pode ultrapassar 30% da renda
        if (prestacao > limitePrestacao) {
            System.out.println("Financiamento negado por baixa renda");
        }
        // Regra 2: Prestação acima de R$ 3.000 exige renda de pelo menos R$ 10.000
        else if (prestacao > 3000.00 && renda < 10000.00) {
            System.out.println("Financiamento negado por alta prestação");
        }
        // Se atendeu a todas as regras
        else {
            System.out.println("Financiamento aprovado");
        }

        scanner.close();
    }
}
