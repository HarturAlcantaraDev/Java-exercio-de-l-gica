package aula;

public class DoisObjetosMudar {

	int x = 5;
	
	public static void main(String[] args) {
		
		DoisObjetosMudar objeto01 = new DoisObjetosMudar();
		DoisObjetosMudar objeto02 = new DoisObjetosMudar();
		objeto02.x = 451969;
		System.out.println(objeto01.x);
		System.out.println(objeto02.x);

	}

}
