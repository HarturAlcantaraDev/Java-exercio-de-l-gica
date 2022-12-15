package br.com.proa.faccat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Eleitorado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de votos nulos, brancos e validos");
		System.out.println("total de votos: ");
		float totalDeVotos = sc.nextFloat();
		System.out.println("Nulos: ");
		float nulos = sc.nextFloat();
		System.out.println("Brancos: ");
		float branco = sc.nextFloat();
		System.out.println("Validos");
		float validos = sc.nextFloat();
		
		validos = validos * 100 /totalDeVotos;
		branco = branco * 100 /totalDeVotos;
		nulos = nulos  * 100 /totalDeVotos;
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		System.out.println("A porcentagem de votos validos foi de: " + validos);
		System.out.println("A porcentagem de votos brancos foi de: " + formatador.format(validos) + "%" );
		System.out.println("A porcentagem de votos nulos foi de: " + nulos);
		
		
		
		
		sc.close();

	}

}
