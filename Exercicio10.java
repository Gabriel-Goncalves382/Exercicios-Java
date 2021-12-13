package exercicios;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do lado do quadrado:");
        int lado = sc.nextInt();
        double area = Math.pow(lado, 2);
        System.out.print("A área do quadrado é: " + area + "cm");
        sc.close();
    }
}