package aula;

public class EntendendoMetodos {

	public static void metodoEstatico() {
		System.out.println("Teste01");
	}
	
	public void metodoDinamico() {
		System.out.println("Teste02");
	}
	
	public static void main(String[] args) {
		metodoEstatico();
//		 metodoDinamico();
		
		EntendendoMetodos exibir = new EntendendoMetodos();
		exibir.metodoDinamico();
	}

}
