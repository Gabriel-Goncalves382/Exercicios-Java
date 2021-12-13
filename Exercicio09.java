package exercicios;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da raio do círculo:");
        int raio = sc.nextInt();
        double area = Math.PI * (raio * raio);
        System.out.print("A área do círculo é: " + area + "cm");
        sc.close();
    }
}
