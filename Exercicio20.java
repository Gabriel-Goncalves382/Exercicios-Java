package exercicios;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit:");
        float fahrenheit = sc.nextFloat();
        float celsius = (fahrenheit - 32.0F) * 5.0F / 9.0F;
        System.out.print("A temperatura em Celsius é: " + celsius + " °C");
        sc.close();
    }
}
