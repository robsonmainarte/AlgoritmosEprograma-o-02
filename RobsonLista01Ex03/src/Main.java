import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite sua idade em anos: ");
        int idadeAnos = scanner.nextInt();

        int idadeMeses = idadeAnos * 12;

        System.out.println("Você viveu aproximadamente " + idadeMeses + " meses.");

        scanner.close();
    }
}
