package exercicios;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da base do retângulo:");
        int base = sc.nextInt();
        System.out.println("Digite o valor da altura do retângulo:");
        int altura = sc.nextInt();
        int area = base * altura;
        System.out.print("A área do retângulo é: " + area + "cm");
        sc.close();
    }
}
