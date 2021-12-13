package exercicios;

import java.util.Scanner;

public class Exercicio80 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eis a lista de números ímpares entre 0 e 20");
        for(int cont = 0; cont < 21; ++cont) {
            if (cont % 2 == 1) {
                System.out.println("O número " + cont + " é impar");
            }
        }
        System.out.println("Fim!");
        sc.close();
    }
}
