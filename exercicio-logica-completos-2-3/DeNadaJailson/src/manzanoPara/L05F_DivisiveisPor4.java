package manzanoPara;

public class L05F_DivisiveisPor4 {

	public static void main(String[] args) {
		
		for (short contadora = 1; contadora <= 200; contadora++) {
			if (contadora%4==0) {
				System.out.println("Um dos números divisiveis por 4 entre 1 a 200 é: "+contadora);
			}
		}

	}

}
