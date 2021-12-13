package exercicios;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da base do triângulo:");
        int base = sc.nextInt();
        System.out.println("Digite o valor da altura do triângulo:");
        int altura = sc.nextInt();
        int area = base * altura / 2;
        System.out.print("A área do triângulo é: " + area + "cm");
        sc.close();
    }
}
