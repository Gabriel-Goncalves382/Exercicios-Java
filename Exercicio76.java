package exercicios;

import java.util.Scanner;

public class Exercicio76 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        String nome = sc.next();
        System.out.println("Qual seu sexo (F ou M)?");
        char sexo = sc.next().charAt(0);
        if (sexo != 'F' && sexo != 'f') {
            System.out.println(nome + " Sr.");
        } else {
            System.out.println(nome + " Sra.");
        }
        sc.close();
    }
}
