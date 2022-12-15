package aula;

public class ParaCada01_Carros {

	public static void main(String[] args) {
		
		String[] carros = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : carros) {
			System.out.println(i);
		}
		
		System.out.println();
		
		for (byte contadora = 0; contadora < carros.length; contadora++) {
			System.out.println(carros[contadora]);
		}

	}

}
