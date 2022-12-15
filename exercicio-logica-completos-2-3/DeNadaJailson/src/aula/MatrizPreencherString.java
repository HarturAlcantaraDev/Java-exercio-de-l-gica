package aula;

import java.util.Scanner;

public class MatrizPreencherString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[][] nomes = new String[2][2];

		for (int i = 0; i < nomes.length; i++) {
			for (int j = 0; j < nomes[i].length; j++) {
				System.out.println("Informe o nome do " + (j + 1) + "º aluno que ira receber madeirada");
				nomes[i][j] = sc.nextLine();
			}
		}
		System.out.println();
		
		for (int contadora = 0; contadora < nomes.length; contadora++) {
			for (int contadora2 = 0; contadora2 < nomes[contadora].length; contadora2++) {
				System.out.print(nomes[contadora][contadora2]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
