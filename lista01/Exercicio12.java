package lista01;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Oii, vamos calcular as dimensões de um círculo, informe os dados a seguir:");
        System.out.println("Qual é o raio do seu círculo?");
        double raio = sc.nextDouble();

        double area = 3.14*(raio*raio);

        System.out.println("A área do seu círculo é no total de "+area);

        sc.close();
    }
}
