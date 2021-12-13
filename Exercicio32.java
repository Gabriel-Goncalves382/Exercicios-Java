package exercicios;

import java.util.Scanner;

public class Exercicio32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n = sc.nextInt();
        if (n > 10) {
            System.out.println("É maior que 10");
        } else {
            System.out.println("É menor que 10");
        }
        sc.close();
    }
}
