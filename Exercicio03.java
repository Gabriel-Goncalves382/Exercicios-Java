package exercicios;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int valor = sc.nextInt();
        System.out.println("Digite o segundo valor:");
        int valor2 = sc.nextInt();
        int multiplicacao = valor * valor2;
        System.out.println("A multiplicação dos valores digitados é: " + multiplicacao);
        sc.close();
    }
}
