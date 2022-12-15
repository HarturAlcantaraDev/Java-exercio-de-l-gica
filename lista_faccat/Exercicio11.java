package lista_faccat;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos calcular o seu salário por carro vendido ok?!");
        System.out.println("Primeiro digite o saldo do seu salário fixo: ");
        int sal_fixo = sc.nextInt();

        System.out.println("Agora digite a quantidade de carros vendidos: ");
        int qntd_carro = sc.nextInt();

        System.out.println("Qual o valor fixo que você recebe por carro?");
        int valor_carro = sc.nextInt();

        System.out.println("Por último, digite a quantidade total das suas vendas: ");
        int qntd_venda = sc.nextInt();

        double resultado = sal_fixo+(qntd_carro*valor_carro)+(0.05*qntd_venda);

        System.out.println("O seu salário final é: R$"+resultado);

        sc.close();
    }
}
