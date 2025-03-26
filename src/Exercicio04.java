import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        // declaração de variáveis --> criação de variáveis
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        double salarioMinimo, qtdKw;
        double valorDoKw, total, totalComDesconto;

        // entrada de dados
        System.out.print("Salário mínimo --> R$ ");
        salarioMinimo = sc.nextDouble();
        System.out.print("total de quilowatt consumido --> ");
        qtdKw = sc.nextDouble();

        // processamento de dados
        valorDoKw = salarioMinimo / 7 / 100;
        total = valorDoKw * qtdKw;
        totalComDesconto = total * 0.90;

        // saída de dados
        System.out.println("Valor do quilowatt R$ " + df.format(valorDoKw));
        System.out.println("Total a pagar R$ " + df.format(total));
        System.out.println("Total a pagar com 10% de desconto R$ " + df.format(totalComDesconto));

    }
}
