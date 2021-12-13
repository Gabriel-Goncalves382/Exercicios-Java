package exercicios;

import java.util.Scanner;

public class Exercicio51 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor valor:");
        int valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor valor:");
        int valor2 = sc.nextInt();
        System.out.println("Digite o terceiro valor valor:");
        int valor3 = sc.nextInt();
        if (valor1 > valor2 & valor1 > valor3) {
            if (valor2 > valor3) {
                System.out.println(valor3 + ", " + valor2 + ", " + valor1);
            } else {
                System.out.println(valor2 + ", " + valor3 + ", " + valor1);
            }
        } else if (valor2 > valor3) {
            if (valor3 > valor1) {
                System.out.println(valor1 + ", " + valor3 + ", " + valor2);
            } else {
                System.out.println(valor3 + ", " + valor1 + ", " + valor2);
            }
        } else if (valor1 > valor2) {
            System.out.println(valor2 + ", " + valor1 + ", " + valor3);
        } else {
            System.out.println(valor1 + ", " + valor2 + ", " + valor3);
        }
        sc.close();
    }
}
