package lista01;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Oii, vamos calcular as dimensões de um retângulo, informe os dados a seguir:");
        System.out.println("Qual é a base do seu retângulo?");
        double base = sc.nextDouble();
        System.out.println("Agora, digite a altura do seu retângulo.");
        double altura = sc.nextDouble();

        double area = base*altura;

        System.out.println("A área do seu retângulo é no total de "+area);

        sc.close();
    }
}
