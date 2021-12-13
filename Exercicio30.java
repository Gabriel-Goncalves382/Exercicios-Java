package exercicios;

import java.util.Scanner;

public class Exercicio30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        int a = sc.nextInt();
        System.out.println("Digite o valor de B:");
        int b = sc.nextInt();
        System.out.println("Digite o valor de C:");
        int c = sc.nextInt();
        double soma = Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2);
        System.out.print("O valor da soma dos quadrados é de: " + soma);
        sc.close();
    }
}
