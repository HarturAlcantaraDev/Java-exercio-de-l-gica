package aula;

public class OverloadingMetodo {

	static int metodoInt(int x, int y) {
		return x + y;
	}
	
	static double metodoDouble(double x, double y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		int variavel1 = metodoInt(8, 5);
		double variavel2 = metodoDouble(4.3, 6.26);
		System.out.println("int: "+ variavel1);
		System.out.println("double: "+variavel2);
	}

}
