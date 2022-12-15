package lista01;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Oii, vamos calcular as dimensões de um quadrado, informe os dados a seguir:");
        System.out.println("Qual é o lado do seu quadrado?");
        double lado = sc.nextDouble();
        
        double area = lado*lado ;

        System.out.println("A área do seu quadrado é no total de "+area);

        sc.close();
    }
}
