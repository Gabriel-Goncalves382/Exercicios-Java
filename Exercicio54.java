package exercicios;

import java.util.Scanner;

public class Exercicio54 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        int valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor:");
        int valor2 = sc.nextInt();
        if (valor1 > valor2) {
            System.out.println(valor1 + " é maior do que " + valor2);
        } else if (valor1 == valor2) {
            System.out.println("Os valores são iguais.");
        } else {
            System.out.println(valor2 + " é maior do que " + valor1);
        }
        sc.close();
    }
}
