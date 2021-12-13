package exercicios;

import java.util.Scanner;

public class Exercicio42 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do salário fixo do vendedor:");
        float salarioFixo = sc.nextFloat();
        System.out.println("Digite o valor das vendas efetuadas pelo vendedor:");
        float valorVendas = sc.nextFloat();
        double salarioFinal;
        if (valorVendas <= 1500.0F) {
            salarioFinal = (salarioFixo + valorVendas * 3.0F / 100.0F);
            System.out.println("O salário final do vendedor corresponde a: R$" + salarioFinal);
        } else {
            salarioFinal = (salarioFixo + 45.0F + (valorVendas - 1500.0F) * 5.0F / 100.0F);
            System.out.println("O salário final do vendedor corresponde a: R$" + salarioFinal);
        }
        sc.close();
    }
}
