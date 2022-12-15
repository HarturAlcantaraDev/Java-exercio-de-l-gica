package aula;

public class Parametros4 {

	public static void meuMetodo(String nome, int quantidade) {
		System.out.println(nome+" possui mais "+quantidade+" projetos para fazer pq ta fácil");
	}
	
	public static void main(String[] args) {
		meuMetodo("Alvaro", 7);
		meuMetodo("Lucas", 65);
		meuMetodo("Karen", 10);
	}

}
