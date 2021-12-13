package exercicios;

import java.util.Scanner;

public class Exercicio100 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = sc.nextInt();
        for(int contador = 1; contador <= 10; ++contador) {
            System.out.println(numero + " x " + contador + " = " + numero * contador);
        }
        sc.close();
    }
}
