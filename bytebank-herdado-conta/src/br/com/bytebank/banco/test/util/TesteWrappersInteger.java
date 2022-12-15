package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappersInteger {

	public static void main(String[] args) {
		int[] idades = new int[5]; //array primitivo
		String[] nomes = new String[5]; // array de referencia
		
		int idade = 29; //Integer 
		Integer idadeRef = Integer.valueOf(29); // autoboxing
		
		System.out.println(idadeRef.doubleValue());
		System.out.println(Integer.MAX_VALUE); //Maximo que ele pode guardar
		System.out.println(Integer.MIN_VALUE); //Minimo que ele pode guardar
		System.out.println(Integer.SIZE); // Vai devolver a quantidade de bytes
		System.out.println(Integer.BYTES); // bytes na linguagem 0 e 1 
		
		int valor = idadeRef.intValue(); // unboxing, quando o Objeto e transforma o Objeto em Primitivo
		
		String s = args[0];
		
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		List<Integer> numeros = new ArrayList<Integer>(); // Lista só sabe guardar referencia
		numeros.add(idade); //Autoboxing, quando o Java transforma primitivo para objetos
		
		
		// resolvendo o exercicio
		Integer ref = Integer.valueOf("3");
        ref++;
        System.out.println(ref);

	}

}
