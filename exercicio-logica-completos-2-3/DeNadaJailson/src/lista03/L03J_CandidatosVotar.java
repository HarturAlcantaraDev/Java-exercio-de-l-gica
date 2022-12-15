package lista03;

import java.util.Scanner;

public class L03J_CandidatosVotar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de votos válidos para o candidato A: ");
		float validosA = sc.nextFloat();
		System.out.println("Informe a quantidade de votos nulos para o candidato A: ");
		float nulosA = sc.nextFloat();
		System.out.println("Informe a quantidade de votos em branco para o candidato A: ");
		float brancosA = sc.nextFloat();
		
		System.out.println("Informe a quantidade de votos válidos para o candidato B: ");
		float validosB = sc.nextFloat();
		System.out.println("Informe a quantidade de votos nulos para o candidato B: ");
		float nulosB = sc.nextFloat();
		System.out.println("Informe a quantidade de votos em branco para o candidato B: ");
		float brancosB = sc.nextFloat();
		
		System.out.println("Informe a quantidade de votos válidos para o candidato C: ");
		float validosC = sc.nextFloat();
		System.out.println("Informe a quantidade de votos nulos para o candidato C: ");
		float nulosC = sc.nextFloat();
		System.out.println("Informe a quantidade de votos em branco para o candidato C: ");
		float brancosC = sc.nextFloat();
		
		float totalEleitores = validosA+nulosA+brancosA+validosB+nulosB+brancosB+validosC+nulosC+brancosC;

		float percValidos = (validosA+validosB+validosC)/totalEleitores*100;
		float percA = validosA/totalEleitores*100;
		float percB = validosB/totalEleitores*100;
		float percC = validosC/totalEleitores*100;
		float nulos = (nulosA+nulosB+nulosC)/totalEleitores*100;
		float brancos = (brancosA+brancosB+brancosC)/totalEleitores*100;
		
		System.out.println("A quantidade total de eleitores foi de: "+totalEleitores);
		System.out.println("O percentual de votos válidos foi de: "+percValidos);
		System.out.println("O percentual de votos válidos para o candidato A foi de: "+percA);
		System.out.println("O percentual de votos válidos para o candidato B foi de: "+percB);
		System.out.println("O percentual de votos válidos para o candidato C foi de: "+percC);
		System.out.println("O percentual de votos nulos foi de: "+nulos);
		System.out.println("O percentual de votos brancos foi de: "+brancos);
		
		sc.close();
	}
	

}
