package exercicios;

import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        int a = sc.nextInt();
        System.out.println("Digite o valor de B:");
        int b = sc.nextInt();
        b= a + b;
        a= b-a;
        b= b-a;
        System.out.print("O valor de A é " + a + " e o de B é " + b);
        sc.close();
    }
}
