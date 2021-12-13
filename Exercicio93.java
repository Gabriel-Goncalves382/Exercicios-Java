package exercicios;

import java.util.Scanner;

public class Exercicio93 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int indice = 1;
        int soma = 0;

        do {
            System.out.println("Informe o " + indice + "º número: ");
            int numero = sc.nextInt();
            int fatorial = 1;

            for(int auxiliar = numero; auxiliar >= 1; --auxiliar) {
                fatorial *= auxiliar;
            }

            soma += fatorial;
            ++indice;
        } while(indice <= 15);

        System.out.println(soma);
        sc.close();
    }
}
