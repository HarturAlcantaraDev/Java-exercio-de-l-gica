package br.com.proa.faccat;

import java.util.Scanner;

public class ConversorDeIdadeEmDias {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade em anso, meses e dias: ");
		System.out.println("Anos: ");
		int ano = sc.nextInt();
		System.out.println("Mês: ");
		int mes = sc.nextInt();
		System.out.println("Dias: ");
		int dia = sc.nextInt();
		
		ano = ano * 365;
		mes = mes * 30;
		dia = ano + mes;
		
		System.out.println("Sua idade convertida em dias é: " + dia);
		
		sc.close();
	}
	

}
