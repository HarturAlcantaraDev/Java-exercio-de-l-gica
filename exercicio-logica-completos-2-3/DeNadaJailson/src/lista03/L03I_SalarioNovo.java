package lista03;

import java.util.Scanner;

public class L03I_SalarioNovo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu salário atual: ");
		float salario = sc.nextFloat();
		System.out.println("Informe o percentual de reajuste: ");
		float reajuste = sc.nextFloat();
		float salarioNovo = salario+(salario/reajuste);
		System.out.println("O valor de seu novo salário será de: "+salarioNovo);
		sc.close();
	}

}
