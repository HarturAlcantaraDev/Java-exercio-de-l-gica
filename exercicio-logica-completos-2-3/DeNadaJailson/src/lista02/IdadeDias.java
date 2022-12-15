package lista02;

import java.util.Scanner;

public class IdadeDias {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe quantos anos você tem: ");
		int anos = sc.nextInt() * 365;
		
		System.out.println("Informe quantos meses passaram após seu aniversário: ");
		int meses = sc.nextInt() * 30;
		
		System.out.println("Informe quantos dias passaram após seu aniversário: ");
		int dias = sc.nextInt();
		
		int idade = anos+meses+dias;
		System.out.println("A sua idade em dias é de: "+idade);
		sc.close();
	}

}
