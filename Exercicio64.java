package exercicios;

import java.util.Scanner;

public class Exercicio64 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        int a = sc.nextInt();
        System.out.println("Digite o valor de B:");
        int b = sc.nextInt();
        System.out.println("Digite o valor de C:");
        int c = sc.nextInt();
        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero");
            } else if (a != b && b != c && a != c) {
                System.out.println("Triângulo Escaleno");
            } else {
                System.out.println("Triângulo Isósceles");
            }
        } else {
            System.out.println("Não é possivel formar um triângulo");
        }
        sc.close();
    }
}
