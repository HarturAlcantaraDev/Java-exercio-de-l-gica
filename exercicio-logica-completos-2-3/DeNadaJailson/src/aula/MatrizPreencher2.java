package aula;

import java.util.Scanner;

public class MatrizPreencher2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] numeros = new int[3][3];

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.println("Informe um valor: ");
				numeros[i][j] = sc.nextInt();
			}
		}
		int contadora2 = 0;
		for (int contadora = 0; contadora < numeros.length; contadora++) {
			for (contadora2 = 0; contadora2 < numeros[contadora].length; contadora2++) {
				System.out.print(numeros[contadora][contadora2] + " ");
			}
			System.out.print("\n");

		}
		sc.close();
	}

}
