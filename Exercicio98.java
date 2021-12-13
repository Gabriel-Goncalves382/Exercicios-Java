package exercicios;

import java.util.Scanner;

public class Exercicio98 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor a ser dividido: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o valor que dividirá o primeiro:");
        int num2 = sc.nextInt();
        int total = 0;
        do {
            num1 -= num2;
            ++total;
        } while(num1 > 0);
        if (num1 < 0) {
            --total;
        }
        System.out.println("O resultado inteiro da divisão do primeiro número pelo segundo é " + total);
        sc.close();
    }
}
