package aula;

import java.util.Scanner;

public class Matriz04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		byte [] numeros = new byte[5];
		
		for (byte i = 0; i < 5; i++) {
			System.out.println("Informe o "+(i+1)+"º valor:");
			numeros[i] = sc.nextByte();
		}
		
		for (byte contadora = 0; contadora < 5; contadora++) {
			System.out.println("O "+(contadora+1)+" valor informado é: "+numeros[contadora]);
		}
		sc.close();
		
	}

}
