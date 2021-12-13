package exercicios;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor:");
        int valor = sc.nextInt();
        int sucessor = valor + 1;
        System.out.print("O sucessor de " + valor + " é: " + sucessor);
        sc.close();
    }
}
