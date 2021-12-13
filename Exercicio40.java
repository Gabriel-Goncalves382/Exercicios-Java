package exercicios;

import java.util.Scanner;

public class Exercicio40 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de horas trabalhadas no mês:");
        float hrsTrabalhadas = sc.nextFloat();
        System.out.println("Digite o seu salário por hora:");
        double salarioHora = sc.nextDouble();
        double aumento;
        if (hrsTrabalhadas > 160.0F) {
            aumento = salarioHora * 0.0D;
            double salarioFinal = salarioHora * hrsTrabalhadas + aumento;
            System.out.println("Seu salário é R$" + salarioFinal);
        } else {
            double salarioFinal = salarioHora * hrsTrabalhadas;
            System.out.println("Seu salário é R$" + salarioFinal);
        }
        sc.close();
    }
}
