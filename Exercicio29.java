package exercicios;

import java.util.Scanner;

public class Exercicio29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos reais você deseja converter:");
        int real = sc.nextInt();
        double dolar = 0.18D * real;
        System.out.print("Seus R$" + real + " reais são equivalentes a $" + dolar + " dólares.");
        sc.close();
    }
}
