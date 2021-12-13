package exercicios;

import java.util.Scanner;

public class Exercicio85 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        double media;
        System.out.println("Soma total dos valores: " + soma);
        for(int cont =1; cont <= 10; ++cont) {
            System.out.println("Digite um número:");
            int num = sc.nextInt();
            soma += num;
        }
        media = (soma / 10);
        System.out.println("Média aritmética dos valores lidos: " + media);
        sc.close();
    }
}
