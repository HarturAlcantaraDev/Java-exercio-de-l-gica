package aula;

import java.util.Scanner;

public class Vetor01_Nomes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[]nomes = new String[5];
		
		for (byte i = 0; i <= 4; i++) {
			System.out.println("Informe um nome: ");
			nomes[i] = sc.nextLine();
		}
		for (byte c = 0; c <= 4; c++) {
			System.out.println("O nome da "+(c+1)+"º pessoa é: "+nomes[c]);
		}
		sc.close();
	}

}
