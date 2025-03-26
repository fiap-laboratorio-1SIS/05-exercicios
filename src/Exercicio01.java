import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        // declaração de variáveis
        Scanner sc = new Scanner(System.in);
        double base, altura;
        double area, perimetro;

        // entrada de dados
        System.out.print("Informe o valor da base --> ");
        base = sc.nextDouble();
        System.out.print("Informe o valor da altura --> ");
        altura = sc.nextDouble();

        // processamento de dados
        area = base * altura;
        perimetro = 2 * base + 2 * altura;

        // saída de dados
        System.out.println("área = " + area);
        System.out.println("perímetro = " + perimetro);

    }
}
