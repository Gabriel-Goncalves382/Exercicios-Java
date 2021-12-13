package exercicios;

import java.util.Scanner;

public class Exercicio50 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor valor: ");
        int valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor valor: ");
        int valor2 = sc.nextInt();
        System.out.println("Digite o terceiro valor valor: ");
        int valor3 = sc.nextInt();
        if (valor3 < valor1 & valor3 < valor2) {
                System.out.println("O resultado da soma dos dois maiores valores digitados é " + (valor1 + valor2));
        } else if (valor1 < valor3 & valor1 < valor2) {
                System.out.println("O resultado da soma dos dois maiores valores digitados é " + (valor2 + valor3));
        }else {
            System.out.println("O resultado da soma dos dois maiores valores digitados é " + (valor1 + valor3));
        }

        sc.close();
    }
}
