package exercicios;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a 1° nota:");
        float n1 = sc.nextFloat();
        System.out.println("Digite a 2° nota:");
        float n2 = sc.nextFloat();
        System.out.println("Digite a 3° nota:");
        float n3 = sc.nextFloat();
        float media = (n1 * 2.0F + n2 * 3.0F + n3 * 5.0F) / 10.0F;
        System.out.print("A sua média é: " + media);
        sc.close();
    }
}
