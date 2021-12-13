package exercicios;

import java.util.Scanner;

public class Exercicio71 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o 1° valor:");
        float valor1 = sc.nextFloat();
        System.out.println("Digite o 2° valor:");
        float valor2 = sc.nextFloat();
        System.out.println("Digite o 3° valor:");
        float valor3 = sc.nextFloat();
        System.out.println("Digite o 4° valor:");
        float valor4 = sc.nextFloat();
        if (valor1 % 2.0F == 0.0F && valor1 % 3.0F == 0.0F) {
            System.out.println("Primeiro valor é divísivel por 2 e 3 = " + valor1 + " Dividido por 2 = " + valor2 / 2.0F + " Dividido por 3 = " + valor3 / 3.0F);
        } else if (valor2 % 2.0F == 0.0F && valor2 % 3.0F == 0.0F) {
            System.out.println("Segundo valor é divisível por 2 e 3 = " + valor2 + " Dividido por 2 = " + valor2 / 2.0F + " Dividido por 3 = " + valor2 / 3.0F);
        } else if (valor3 % 2.0F == 0.0F && valor3 % 3.0F == 0.0F) {
            System.out.println("Terceiro valor é divisível por 2 e 3 = " + valor3 + " Dividido por 2 = " + valor3 / 2.0F + " Dividido por 3 = " + valor3 / 3.0F);
        } else if (valor4 % 2.0F == 0.0F && valor4 % 3.0F == 0.0F) {
            System.out.println("Quarto valor é divisível por 2 e 3 = " + valor4 + " Dividido por 2 = " + valor4 / 2.0F + " Dividido por 3 = " + valor4 / 3.0F);
        }
        sc.close();
    }
}
