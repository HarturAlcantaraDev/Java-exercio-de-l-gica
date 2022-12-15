package lista01;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Oii, vamos calcular as dimensões de um triângulo, informe os dados a seguir:");
        System.out.println("Qual é a base do seu triângulo?");
        double base = sc.nextDouble();
        System.out.println("Agora, digite a altura do seu triângulo.");
        double altura = sc.nextDouble();

        double area = base*altura/2;

        System.out.println("A área do seu triângulo é no total de "+area);

        sc.close();
    }
}
