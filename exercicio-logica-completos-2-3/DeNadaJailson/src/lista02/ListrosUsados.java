package lista02;

import java.util.Scanner;

public class ListrosUsados {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe quantas horas foram gastas na viagem: ");
		int horas = sc.nextInt();
		System.out.println("Informe a velocidade média do veículo: ");
		int velocidade = sc.nextInt();
		int distancia = horas*velocidade;
		float litrosUsados = distancia/12f;
		System.out.println("O tempo gasto na viagem é de: "+horas);
		System.out.println("A velocidade média durante o trajeto percorrido é de: "+velocidade);
		System.out.println("A distância percorrida nesta viagem foi de: "+distancia);
		System.out.println("A quantidade de litros usados na viagem é de: "+litrosUsados);
		sc.close();
	}
	
}
