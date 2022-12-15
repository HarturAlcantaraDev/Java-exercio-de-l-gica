package lista01;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Oii, vamos calcular as dimensões de um losango, informe os dados a seguir:");
        System.out.println("Qual é a diagonal maior do seu losango?");
        double DM = sc.nextDouble();
        System.out.println("Agora, digite a diagonal menor do seu losango.");
        double dm = sc.nextDouble();

        double area = DM*dm/2;

        System.out.println("A área do seu losango é no total de "+area);

        sc.close();
    }
}
