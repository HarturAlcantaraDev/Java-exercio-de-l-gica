package br.com.proa.faccat;

import java.util.Scanner;

public class AreaRetangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite as dimensões do retangulo para calcular sua área.");
		System.out.println("Digite a base: ");
		float base = sc.nextFloat();
		System.out.print("Digete a altura: ");
		float altura = sc.nextFloat();

		float area = (base * altura);

		System.out.println("A área desse retangulo é de: " + area + "m²");

		sc.close();

	}

}
