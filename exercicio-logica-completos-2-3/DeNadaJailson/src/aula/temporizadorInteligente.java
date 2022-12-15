package aula;

import java.util.Scanner;

public class temporizadorInteligente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe as horas: ");
		byte horasRecebidas = sc.nextByte();
		System.out.println("Informe os minutos: ");
		byte minutosRecebidos = sc.nextByte();
		System.out.println("Informe os segundos: ");
		byte segundosRecebidos = sc.nextByte();

		for (byte horas = horasRecebidas; horas > -1; horas--) {
			for (byte minutos = minutosRecebidos; minutos > -1; minutos--) {
				if (minutos == 0) {
					minutosRecebidos = 59;
				}
				for (byte segundos = segundosRecebidos; segundos > -1; segundos--) {
					if (segundos == 0) {
						segundosRecebidos = 59;
					}
					System.out.println(horas + " : " + minutos + " . " + segundos);
				}
			}
			sc.close();
		}

	}

}
