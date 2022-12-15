package manzanoEnquanto;

public class E02_Soma1ao100 {

	public static void main(String[] args) {
		
		byte contadora = 1;
		int acumuladora = 0;
		
		while (contadora<=100) {
			acumuladora+=contadora;
			contadora++;
		}
		System.out.println("O total da soma obtida é: "+acumuladora);
	}

}
