package lista03;

import java.util.Scanner;

public class L03A_Distributiva {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		int valorA = sc.nextInt();
		System.out.println("Informe o segundo valor: ");
		int valorB = sc.nextInt();
		System.out.println("Informe o terceio valor: ");
		int valorC = sc.nextInt();
		System.out.println("Informe o quarto valor: ");
		int valorD = sc.nextInt();
		
		int somaA = valorA+valorB+valorC+valorD;
		int somaB = valorB+valorC+valorD;
		int somaC = valorC+valorD;
		
		int multiA = valorA*valorB*valorC*valorD;
		int multiB = valorB*valorC*valorD;
		int multiC = valorC*valorD;
		
		System.out.println("As somas de A são: "+somaA);
		System.out.println("As somas de B são: "+somaB);
		System.out.println("As somas de C são: "+somaC);

		System.out.println("Os produtos de A são: "+multiA);
		System.out.println("Os produtos de B são: "+multiB);
		System.out.println("Os produtos de C são: "+multiC);
		
		sc.close();
	}

}
