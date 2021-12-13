package exercicios;

import java.util.Scanner;

public class Exercicio74 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int a = sc.nextInt();
        if (a <= 9 && a >= 0) {
            System.out.println("O valor está na faixa permitida");
        } else {
            System.out.println("O valor está fora da faixa permitida");
        }
        sc.close();
    }
}
