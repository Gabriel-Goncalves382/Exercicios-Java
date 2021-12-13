package exercicios;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do seu salário atual:");
        float salarioatual = sc.nextFloat();
        System.out.println("Digite o percentual de reajuste:");
        double ajuste = sc.nextDouble();
        double porcentagem = ajuste / 100.0D;
        double aumento = porcentagem * (double)salarioatual;
        double novosalario = (double)salarioatual + aumento;
        System.out.print("O seu salário será de: R$" + novosalario);
        sc.close();
    }

}
