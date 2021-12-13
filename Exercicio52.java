package exercicios;

import java.util.Scanner;

public class Exercicio52 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor valor:");
        int valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor valor:");
        int valor2 = sc.nextInt();
        System.out.println("Digite o terceiro valor valor:");
        int valor3 = sc.nextInt();
        if (valor1 < valor2 + valor3 && valor2 < valor1 + valor3 && valor3 < valor1 + valor2) {
            System.out.println("Esses valores podem representar os lados de um triângulo");
        } else {
            System.out.println("Esses valores não podem representar os lados de um triângulo");
        }
        sc.close();
    }
}
