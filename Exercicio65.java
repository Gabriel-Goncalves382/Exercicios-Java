package exercicios;

import java.util.Scanner;

public class Exercicio65 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo valor:");
        int n2 = sc.nextInt();
        int maior;
        if (n1 > n2) {
            maior = n1 - n2;
            System.out.println("O maior valor é " + n1 + ". O menor valor é " + n2 + ". A diferença é de " + maior);
        } else if (n2 > n1) {
            maior = n2 - n1;
            System.out.println("O maior valor é " + n2 + ". O menor valor é " + n1 + ". A diferença é de" + maior);
        } else {
            System.out.println("Os valores são iguais.");
        }
        sc.close();
    }
}
