package manzanoEnquanto;

import java.util.Scanner;

public class E01_TabuadaDesejada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número que deseja ver a tabuada: ");
		byte numero = sc.nextByte();
		
		int tabuada;
		byte contadora = 1;
		while (contadora<=10) {
			tabuada = numero*contadora;
			System.out.println(numero+" x "+contadora+" = "+tabuada);
			contadora++;
		}
		sc.close();

	}

}
