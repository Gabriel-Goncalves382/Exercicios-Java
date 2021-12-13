package exercicios;

import java.util.Scanner;

public class Exercicio31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        int a = sc.nextInt();
        System.out.println("Digite o valor de B:");
        int b = sc.nextInt();
        System.out.println("Digite o valor de C:");
        int c = sc.nextInt();
        double soma = Math.pow((a + b + c), 2);
        System.out.print("O valor do quadrado da soma é de " + soma);
        sc.close();
    }
}
