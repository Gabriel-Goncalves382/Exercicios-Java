package exercicios;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu salário fixo por mês: ");
        float salariofixo = sc.nextFloat();
        System.out.println("Digite o valor da comissão fixa: ");
        float comissao = sc.nextFloat();
        System.out.println("Digite o valor total das suas vendas mensais: ");
        float valorvendas = sc.nextFloat();
        System.out.println("Digite o número de carros vendidos por mês: ");
        float carrovendido = sc.nextFloat();
        float salariofinal = salariofixo + carrovendido * comissao + valorvendas * 0.0F;
        System.out.print("Seu salário final será de R$" + salariofinal);
        sc.close();
    }
}
