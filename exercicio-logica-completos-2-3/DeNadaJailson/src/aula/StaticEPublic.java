package aula;

public class StaticEPublic {

	public static void metodoEstatico() {
		System.out.println("Método Global");
	}
	
	public void metodoDinamico() {
		System.out.println("Método Local");
	}
	
	public static void main(String[] args) {
		metodoEstatico();
//		metodoDinamico();
		
		StaticEPublic exibir = new StaticEPublic();
		exibir.metodoDinamico();
	}

}
