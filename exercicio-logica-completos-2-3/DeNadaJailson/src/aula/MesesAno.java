package aula;

import java.util.Scanner;

public class MesesAno {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();
		
		switch (valor) {
		case 1:
			System.out.println("1º mês: Janeiro");
			break;
		case 2:
			System.out.println("2º mês: Fevereiro");
			break;
		case 3:
			System.out.println("3º mês: Março");
			break;
		case 4:
			System.out.println("4º mês: Abril");
			break;
		case 5:
			System.out.println("5º mês: Maio");
			break;
		case 6:
			System.out.println("6º mês: Junho");
			break;
		case 7:
			System.out.println("7º mês: Julho");
			break;
		case 8:
			System.out.println("8º mês: Agosto");
			break;
		case 9:
			System.out.println("9º mês: Setembro"
					+ "");
			break;
		case 10:
			System.out.println("10º mês: Outubro");
			break;
		case 11:
			System.out.println("11º mês: Novembro");
			break;
		case 12:
			System.out.println("12º mês: Dezembro");
			break;
		default:
			System.out.println("O valor não corresponde a nenhum mês");
		}
		sc.close();
	}
		
}
