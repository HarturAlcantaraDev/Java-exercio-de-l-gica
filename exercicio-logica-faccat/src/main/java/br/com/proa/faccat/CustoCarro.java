package br.com.proa.faccat;

import java.util.Scanner;

public class CustoCarro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digete o custo de fabrica de um carro cara calcular o custo final");
		System.out.println("Custo fabrica: ");
		double custo = sc.nextDouble();

		custo = custo * (custo * 0.28) + (custo * 0.45);

		System.out.println("O custo final do carro é: " + custo);

		sc.close();
	}

}
