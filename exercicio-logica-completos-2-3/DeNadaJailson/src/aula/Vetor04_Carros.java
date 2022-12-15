package aula;

import java.util.Scanner;

public class Vetor04_Carros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String [] carros = new String[10];
		
		for (byte contadora = 0; contadora < carros.length; contadora++) {
			System.out.println("Informe o nome de um carro: ");
			carros[contadora] = sc.next();
		}
		
		for (byte i = 0; i < carros.length; i++) {
			System.out.println("O nome do "+(i+1)+" carro informado é: "+carros[i]);
		}
		sc.close();

	}

}
