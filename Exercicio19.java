package exercicios;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        float celsius = sc.nextFloat();
        float fahrenheit = (9.0F * celsius + 160.0F) / 5.0F;
        System.out.print("A temperatura em Fahrenheit é: " + fahrenheit + " °F");
        sc.close();
    }
}