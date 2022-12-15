package aula;

import java.util.Scanner;

public class Vetor03_Boolean {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean [] escolhas = new boolean[5];
		
		for (byte i = 0; i < escolhas.length; i++) {
			System.out.println("Informe sua escolha: ");
			escolhas[i] = sc.nextBoolean();
		}
		for (byte contadora = 0; contadora < escolhas.length; contadora++) {
			System.out.println("Sua "+(contadora+1)+"º escolha foi: "+escolhas[contadora]);
		}
		sc.close();

	}

}
