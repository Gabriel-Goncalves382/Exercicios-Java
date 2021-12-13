package exercicios;

import java.util.Scanner;

public class Exercicio95 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;

        do {
            int fatorial = 1;

            for(int auxiliar = i; auxiliar > 1; --auxiliar) {
                fatorial *= auxiliar - 1;
            }

            System.out.println("Número - " + i + " = " + fatorial);
            i += 2;
        } while(i < 10);

        sc.close();
    }
}
