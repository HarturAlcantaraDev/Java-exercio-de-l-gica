package aula;

public class Parametros3 {

	public static void meuMetodo(String fname, int age) {
		System.out.println(fname + " is " + age);
	}
	
	public static void main(String[] args) {
		meuMetodo("Liam",5);
		meuMetodo("Jenny",8);
		meuMetodo("Anja",31);
	}

}
