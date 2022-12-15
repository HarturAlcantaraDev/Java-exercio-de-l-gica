package lista01;

import java.util.Scanner;

public class AreaLosango {

	public static void main(String[]args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da diagonal maior: ");
		int dMaior = sc.nextInt();
		System.out.println("Digite o valor da diagonal menor: ");
		int dMenor = sc.nextInt();
		int areaD = (dMaior*dMenor)/2;
		System.out.println("A área do diagonal correspondente é: "+areaD);
		sc.close();
	}
}
