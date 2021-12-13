package exercicios;

import java.util.Scanner;

public class Exercicio79 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acul = 0;
        for(int cont = 0; cont < 501; ++cont){
            if (cont % 2 == 0) {
                acul += cont;
            }
        }
        System.out.println("O valor da soma dos pares corresponde a:" + acul);
        sc.close();
    }
}
