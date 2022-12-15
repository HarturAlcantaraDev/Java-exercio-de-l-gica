package aula;

public class MetodosOperacionais {

	public static void soma() {
		
//		Scanner mais = new Scanner(System.in);
//		
//		System.out.println("Informe o primeiro valor: ");
//		byte valor = mais.nextByte();
//		System.out.println("Informe o segundo valor: ");
//		byte valor2 = mais.nextByte();
//		int resultado = valor+valor2;
//		mais.close();
//		return resultado;
		
		byte numero1 = 1;
		byte numero2 = 3;
		
		int mais = numero1+numero2;
		System.out.println("A soma correspondente é: "+mais);
	}
	
	public static void subtracao() {
		
//		Scanner menos = new Scanner(System.in);
//		
//		System.out.println("Informe o terceiro valor: ");
//		byte valor3 = menos.nextByte();
//		System.out.println("Informe o quarto valor ");
//		byte valor4 = menos.nextByte();
//		
//		int resultado = valor3-valor4;
//		menos.close();
//		return resultado;
		
		byte numero2 = 4;
		byte numero3 = 7;
		
		int menos = numero2+numero3;
		System.out.println("A subtracao correspondente é: "+menos);
		
	}
	
	public static void multiplicacao() {
		
//		Scanner vezes = new Scanner(System.in);
//		
//		System.out.println("Informe o quinto valor: ");
//		byte valor5 = vezes.nextByte();
//		System.out.println("Informe o sexto valor: ");
//		byte valor6 = vezes.nextByte();
//		int resultado = valor5*valor6;
//		vezes.close();
//		return resultado;
				
		byte numero4 = 3;
		byte numero5 = 5;
		
		int vezes = numero4+numero5;
		System.out.println("A multiplicacao correspondente é: "+vezes);
	}
	
	public static void divisao() {
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Informe o valor que será dividido: ");
//		byte valor7 = sc.nextByte();
//		System.out.println("Informe o valor que será o dividendo: ");
//		byte valor8 = sc.nextByte();
//		
//		float resultado = valor7/valor8;
//		sc.close();
//		return resultado;
		
		byte numero6 = 4;
		byte numero7 = 2;
		
		float resultado = numero6/numero7;
		System.out.println("A soma correspondente é: "+resultado);
	}
	
	static void abraco() {
		System.out.println("Abracinho");
	}
	
	
	public static void main(String[] args) {
		soma();
		subtracao();
		multiplicacao();
		divisao();
//		abraco();
//		abraco();
//		abraco();
//		abraco();
	}

}
