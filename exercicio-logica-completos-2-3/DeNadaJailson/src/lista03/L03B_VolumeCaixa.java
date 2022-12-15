package lista03;

import java.util.Scanner;

public class L03B_VolumeCaixa {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o comprimento da caixa: ");
		int comprimento = sc.nextInt();
		System.out.println("Informe o altura da caixa: ");
		int altura = sc.nextInt();
		System.out.println("Informe o largura da caixa: ");
		int largura = sc.nextInt();
		int volume = comprimento*altura*largura;
		System.out.println("O volume da caixa correspondente é de: "+volume);
		sc.close();
	}
}
