package lista01;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Oii, vamos calcular as dimensões de um trapézio, informe os dados a seguir:");
        System.out.println("Qual é a base maior do seu trapézio?");
        double BM = sc.nextDouble();
        System.out.println("Agora, digite a base menor do seu trapézio.");
        double bm = sc.nextDouble();
        System.out.println("Por último, digite a altura do seu trapézio.");
        double altura = sc.nextDouble();

        double area = (BM+bm)*altura/2;

        System.out.println("A área do seu trapézio é no total de "+area);

        sc.close();
    }
}
