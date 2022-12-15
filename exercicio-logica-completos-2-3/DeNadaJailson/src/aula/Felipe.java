package aula;

public class Felipe {

	public static void main(String[] args) {

		int contadora=0;
		int qtdDeVezes=0;
		
		while (contadora<=100){
			int numeroAleatorio=(int)(Math.random()*101);
			
			if( (numeroAleatorio>=50) && (numeroAleatorio<=100)) {
				System.out.println(numeroAleatorio);
				qtdDeVezes++;
			} else {

			}		
			contadora++;			
		};
		System.out.println("A quantidade de vezes que o programa foi maior que 50: "+qtdDeVezes);

	}
}
