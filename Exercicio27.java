package exercicios;

import java.util.Scanner;

public class Exercicio27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        int a = sc.nextInt();
        System.out.println("Digite o valor de B:");
        int b = sc.nextInt();
        int diferenca = a - b;
        double quadrado = Math.pow(diferenca, 2);
        System.out.print("O quadrado da diferença de " + a + " e " + b + " é de " + quadrado);
        sc.close();
    }
}
