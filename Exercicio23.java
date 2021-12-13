package exercicios;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor:");
        int valor = sc.nextInt();
        System.out.println("Digite a taxa:");
        int taxa = sc.nextInt();
        System.out.println("Digite o tempo:");
        int tempo = sc.nextInt();
        int prestacao = valor + valor * taxa / 100 * tempo;
        System.out.print("O valor da prestação em atraso é de: " + prestacao);
        sc.close();
    }
}
