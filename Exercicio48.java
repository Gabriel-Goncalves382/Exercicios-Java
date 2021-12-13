package exercicios;

import java.util.Scanner;

public class Exercicio48 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor:");
        int valor = sc.nextInt();
        if (valor > 0) {
            System.out.println(valor + " é positivo");
        } else if (valor == 0) {
            System.out.println(valor + " é zero");
        } else {
            System.out.println(valor + " é negativo");
        }
        sc.close();
    }
}
