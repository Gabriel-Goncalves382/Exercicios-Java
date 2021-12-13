package exercicios;

import java.util.Scanner;

public class Exercicio25 {

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
        int s1 = a + b;
        System.out.println(a + "+" + b + "=" + s1);
        int s2 = a + c;
        System.out.println(a + "+" + c + "=" + s2);
        int s3 = a + d;
        System.out.println(a + "+" + d + "=" + s3);
        int s4 = b + c;
        System.out.println(b + "+" + c + "=" + s4);
        int s5 = b + d;
        System.out.println(b + "+" + d + "=" + s5);
        int s6 = c + d;
        System.out.println(c + "+" + d + "=" + s6);
        int m1 = a * b;
        System.out.println(a + "X" + b + "=" + m1);
        int m2 = a * c;
        System.out.println(a + "X" + c + "=" + m2);
        int m3 = a * d;
        System.out.println(a + "X" + d + "=" + m3);
        int m4 = b * c;
        System.out.println(b + "X" + c + "=" + m4);
        int m5 = b * d;
        System.out.println(b + "X" + d + "=" + m5);
        int m6 = c * d;
        System.out.println(c + "X" + d + "=" + m6);
        sc.close();
    }
}

