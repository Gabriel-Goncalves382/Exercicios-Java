package exercicios;

import java.util.Scanner;

public class Exercicio33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n1 = sc.nextInt();
        if (n1 >= 0) {
            System.out.println("É positivo!");
        } else {
            System.out.println("É negativo!");
        }

        sc.close();
    }
}
