package aula;

import java.util.Scanner;

public class MatrizPreencher {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [][] numeros = new int[3][3];
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.println("Informe um valor: ");
				numeros[i][j] = sc.nextInt();
			}
		}
		int contadora2 = 0;
		for (int contadora = 0; contadora < numeros.length; contadora++) {
			for (contadora2 = 0; contadora2 < numeros[contadora].length; contadora2++) {
				System.out.print(numeros[contadora][contadora2]+" ");
				if ((numeros[contadora][contadora2] == numeros[0][2]) || (numeros[contadora][contadora2] == numeros[1][2])) {
					System.out.print("\n");
				}
			}
			
	
		}
		sc.close();
	}

}
// i = 0; j = 0 => 1
// i = 0; j = 1 => 2
// i = 0; j = 2 => 3
// i = 1; j = 0 => 4
// i = 1; j = 1 => 5
// i = 1; j = 2 => 6
// i = 2; j = 0 => 7
// i = 2; j = 1 => 8
// i = 2; j = 2 => 9
