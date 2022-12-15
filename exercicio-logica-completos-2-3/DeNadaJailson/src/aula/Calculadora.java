package aula;

import java.util.Scanner;

public class Calculadora {

	static int soma(int x, int y) {
		return x + y;
	}
	
	static int subtracao(int a, int b) {
		return a - b;
	}
	
	static int multiplicacao(int c, int d) {
		return c * d;
	}
	
	static float divisao(int i, int j) {
		return i/j;
	}
	
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor:  ");
		int valor1 = sc.nextInt();
		System.out.println("Informe o segundo valor: ");
		int valor2 = sc.nextInt();
		System.out.println("Informe a operação: ");
		String operacao = sc.next();
		
		switch (operacao) {
		case "+":
			System.out.println("O resultado da soma efetuada é: "+soma(valor1, valor2));
			break;
		case "-": 
			System.out.println("O resultado da subtração efetuada é: "+subtracao(valor1,valor2));
			break;
		case "*":
			System.out.println("O resultado da multiplicação efetuada é: "+multiplicacao(valor1, valor2));
			break;
		case "/":
			System.out.println("O resultado da divisão efetuada é: "+divisao(valor1, valor2));
			break;
		default: 
			System.out.println("Não entendi a operação desejada, informe novamente: ");
			operacao = sc.next();
		}
		sc.close();
	}

}
