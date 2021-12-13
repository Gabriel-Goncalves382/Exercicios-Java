package exercicios;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio da lata:");
        float raio = sc.nextInt();
        System.out.println("Digite a altura da lata:");
        float altura = sc.nextInt();
        double volume = Math.PI * Math.pow(raio, 2) * altura;
        System.out.print("O volume da lata é: " + volume);
        sc.close();
    }
}
