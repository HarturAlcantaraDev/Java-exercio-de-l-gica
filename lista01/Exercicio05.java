package lista01;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, vamos fazer a multiplicação de dois valores.");
        System.out.println("Digite um número");
        double valor = sc.nextDouble();
        System.out.println("Digite outro número");
        double valor02 = sc.nextDouble();
        
        double resultado = valor * valor02;
        System.out.println("Resultado da multiplicação dos dois valores "+resultado);
        sc.close();
    }
}
