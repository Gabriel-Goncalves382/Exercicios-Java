package exercicios;

import java.util.Scanner;

public class Exercicio44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade atual de um produto em estoque:");
        int qtdAtual = sc.nextInt();
        System.out.println("Digite a quantidade máxima de um produto em estoque:");
        int qtdMaxima = sc.nextInt();
        System.out.println("Digite a quantidade mínima de um produto em estoque:");
        int qtdMinima = sc.nextInt();
        float qtdMedia = ((qtdMaxima + qtdMinima) / 2);
        if (qtdAtual >= qtdMedia) {
            System.out.println("Não efetuar compra!");
        } else {
            System.out.println("Efetuar comprar!");
        }
        sc.close();
    }
}
