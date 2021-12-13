package exercicios;

import java.util.Scanner;

public class Exercicio73 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " é par!");
        } else {
            System.out.println(n + " é ímpar!");
        }
        sc.close();
    }
}
