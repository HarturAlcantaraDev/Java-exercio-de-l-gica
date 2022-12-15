package aula;

import java.util.Scanner;

public class MetodoDesvioCondicional {

	public static void verificarIdade(int idade) {
		if (idade < 18) {
			System.out.println("Acesso negado, você é menor de idade");
		} else {
			System.out.println("Acesso permitido, você é maior de idade");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe sua idade: ");
		byte numero = sc.nextByte();
		
		verificarIdade(numero);
		sc.close();
	}

}
