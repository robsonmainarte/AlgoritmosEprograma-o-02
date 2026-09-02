import javax.xml.transform.Source;

void main() {
    Scanner entrada = new Scanner(System.in);
    double precoDoProduto;
    double precoComDesconto;

    System.out.print(" Digite o preço do produto:");
    precoDoProduto = entrada.nextDouble();

    precoComDesconto = precoDoProduto * 0.9;
    System.out.print( " Preço com desconto de 10% = " + precoComDesconto);
}