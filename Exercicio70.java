package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio70 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lista = new int[4];
        int j;
        for(j = 1; j < lista.length; ++j) {
            System.out.print("Digite " + j + "° número:");
            int numero = sc.nextInt();
            lista[j] = numero;
        }
        Arrays.sort(lista);
        System.out.print("Ordem crescente:");
        for(j = 1; j < lista.length; ++j) {
            System.out.print(lista[j] + "  ");
        }
        sc.close();
    }
}
