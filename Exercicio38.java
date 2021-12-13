package exercicios;

import java.util.Scanner;

public class Exercicio38 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o 1° número:");
        int n1 = sc.nextInt();
        System.out.println("Digite o 2 número:");
        int n2 = sc.nextInt();
        if (n1 == n2) {
            System.out.println("Os valores não podem ser iguais!");
        } else if (n1 > n2) {
            System.out.println(n1 + " , " + n2);
        } else {
            System.out.println(n2 + " , " + n1);
        }
        sc.close();
    }
}
