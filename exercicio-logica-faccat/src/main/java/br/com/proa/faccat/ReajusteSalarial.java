package br.com.proa.faccat;

import java.util.Scanner;

public class ReajusteSalarial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salario atual: ");
		float salarioAtual = sc.nextFloat();
		System.out.println("Digite o percentual de ajuste: ");
		float ajuste = sc.nextFloat();
		 
		salarioAtual = salarioAtual + salarioAtual * (ajuste / 100);
		
		System.out.println("O Ajuste Salarial é de: " + salarioAtual);
		
		
		sc.close();

	}

}
