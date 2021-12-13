package exercicios;

import java.util.Scanner;

public class Exercicio46 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do salário mensal do funcionário em reais: ");
        float salarioMensal = sc.nextFloat();
        System.out.println("Digite o valor do reajuste em porcentagem: ");
        float reajuste = sc.nextFloat();
        System.out.println("Um salário de R$:" + salarioMensal + " que recebe um reajuste de " + reajuste + "% se tornará R$:" + (salarioMensal + reajuste * salarioMensal / 100.0F));
        sc.close();
    }
}
