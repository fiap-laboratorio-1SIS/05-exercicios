import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        // declaração de variáveis --> criar
        Scanner sc = new Scanner(System.in);
        double tempc, tempf;

        // entrada de dados
        System.out.print("Digite a temperatura em celsius --> ");
        tempc = sc.nextDouble();

        // processamento de dados
        tempf = tempc * 9 / 5 + 32;

        // saída de dados
        System.out.println(tempc + "ºC = " + tempf + "ºF");
    }
}
