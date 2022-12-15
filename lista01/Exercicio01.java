package lista01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, vamos ver o número sucessor?");
        System.out.println("Digite um número");
        int valor = sc.nextInt();
        valor += 1;
        System.out.println("O número sucessor é "+valor);
        sc.close();
    }
}
