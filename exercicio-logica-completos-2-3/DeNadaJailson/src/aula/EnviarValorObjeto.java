package aula;

import java.util.Scanner;

public class EnviarValorObjeto {

	int x;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		EnviarValorObjeto objeto = new EnviarValorObjeto();
		System.out.println("Informe um valor: ");
		objeto.x = sc.nextInt();
		System.out.println(objeto.x);
		sc.close();
	}

}
