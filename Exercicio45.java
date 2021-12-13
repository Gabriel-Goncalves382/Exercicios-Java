package exercicios;

import java.util.Scanner;

public class Exercicio45 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        int a = sc.nextInt();
        System.out.println("Digite o valor de B:");
        int b = sc.nextInt();
        System.out.println("Digite o valor de C:");
        int c = sc.nextInt();
        System.out.println("Digite o valor de D:");
        int d = sc.nextInt();
        float prod1 = (a * b);
        float prod2 = (a * d);
        float soma = (b + d);
        System.out.println(a + "X" + c + "=" + prod1);
        System.out.println(a + "X" + d + "=" + prod2);
        System.out.println(b + "+" + d + "=" + soma);
        sc.close();
    }
}
