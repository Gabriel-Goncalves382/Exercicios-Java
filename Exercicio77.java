package exercicios;

import java.util.Scanner;

public class Exercicio77 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int num = sc.nextInt();
        int cont = 0;

        while(cont < 10) {
            ++cont;
            System.out.println(num + "*" + cont + "=" + cont * num);
        }
        sc.close();
    }
}
