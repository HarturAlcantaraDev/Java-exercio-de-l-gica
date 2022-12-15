package aula;

import java.util.Scanner;

public class CadastroDesafio {

	public static void cadastro(String nome, int idade, String telefone, String apelido, String email) {		
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Telefone: "+telefone);
		System.out.println("Apelido: "+ apelido);
		System.out.println("Email: "+email);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome");
		String dado1 = sc.next();
		System.out.println("Informe a idade");
		int dado2 = sc.nextInt();
		System.out.println("Informe o telefone");
		String dado3 = sc.next();
		System.out.println("Informe o apelido");
		String dado4 = sc.next();
		System.out.println("Informe o email");
		String dado5 = sc.next();
		
		System.out.println();
		
		cadastro(dado1, dado2, dado3, dado4, dado5);
		sc.close();
	}

}
