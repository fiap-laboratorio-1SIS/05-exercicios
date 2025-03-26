import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tempo, velocidade, qtdLitros;

        // entrada de dados
        System.out.print("tempo de viagem: ");
        tempo = sc.nextDouble();
        System.out.print("velocidade média da viagem: ");
        velocidade = sc.nextDouble();

        // processamento de dados
        qtdLitros = (velocidade * tempo) / 10.5;

        // saída de dados
        System.out.println("total de litros consumidos: " + qtdLitros);
    }
}
