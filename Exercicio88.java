package exercicios;

import java.util.Scanner;

public class Exercicio88 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = 0;
        System.out.println("Informe um número inteiro: *Para parar basta escrever um número negativo*");
        int valor = sc.nextInt();

        int menor;
        for(menor = valor; valor >= 0; valor = sc.nextInt()) {
            if (valor > maior) {
                maior = valor;
            }

            if (valor < menor) {
                menor = valor;
            }

            System.out.println("Informe um número inteiro: *Para parar basta escrever um número negativo*");
        }

        System.out.println("Maior: " + maior + " | Menor: " + menor);
        sc.close();
    }
}

