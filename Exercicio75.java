package exercicios;

import java.util.Scanner;

public class Exercicio75 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int a = sc.nextInt();
        if (a < 3) {
            System.out.println(a);
        } else {
            System.out.println("Número maior que três!");
        }
        sc.close();
    }
}
