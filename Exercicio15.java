package exercicios;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do custo de fábrica:");
        float custofabrica = sc.nextFloat();
        float custototal = custofabrica + custofabrica * 28.0F / 100.0F + custofabrica * 45.0F / 100.0F;
        System.out.print("O custo total será de R$" + custototal + " para o consumidor.");
        sc.close();
    }
}
