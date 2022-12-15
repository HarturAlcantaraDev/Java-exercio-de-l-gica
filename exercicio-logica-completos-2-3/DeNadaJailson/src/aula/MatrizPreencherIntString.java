package aula;

import java.util.Scanner;

public class MatrizPreencherIntString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String [][] nomes = new String [2][2];
		int [][] idades = new int[2][2];
		String [][] telefones = new String[2][2];
		String [][] CPFs = new String[2][2];
		
		for (byte i = 0; i < nomes.length; i++) {
			for (byte j = 0; j< nomes[i].length; j++) {
				System.out.println("Informe o nome da "+(j+1)+"º pessoa: ");
				nomes[i][j] = sc.nextLine();
			}
		}
		
		for (byte x = 0; x < idades.length; x++) {
			for (byte y = 0; y < idades[x].length; y++) {
				System.out.println("Informe a idade do(a) "+nomes[x][y]);
				idades[x][y] = sc.nextInt();
			}
		}
		for (byte contadora = 0; contadora < telefones.length; contadora++) {
			for (byte contadora2 = 0; contadora2 < telefones[contadora].length; contadora2++) {
				System.out.println("Informe o telefone do(a) "+nomes[contadora][contadora2]);
				telefones[contadora][contadora2] = sc.next();
			}
		}
		
		for (byte a = 0; a < CPFs.length; a++) {
			for (byte b = 0; b < CPFs[a].length; b++) {
				System.out.println("Informe o CPF da pessoa chamada: "+nomes[a][b]);
				CPFs[a][b] = sc.next();
			}
		}
		
		System.out.println();
		
		for (byte ii = 0; ii < nomes.length; ii++) {
			for (byte jj = 0; jj < nomes[ii].length; jj++) {
				System.out.println("Nome: "+nomes[ii][jj]);
				System.out.println("Idade: "+idades[ii][jj]);
				System.out.println("Telefone: "+telefones[ii][jj]);
				System.out.println("CPF: "+CPFs[ii][jj]);
				System.out.println("\n");
			}
			
		}
		sc.close();

	}

}
