package exercicios;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        int valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor:");
        int valor2 = sc.nextInt();
        float divisao = (float)(valor1 / valor2);
        System.out.println("A divisão dos valores digitados é: " + divisao);
        sc.close();
    }

}
