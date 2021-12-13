package exercicios;

import java.util.Scanner;

public class Exercicio59 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Usuário:");
        int usuario = sc.nextInt();
        if (usuario == 1234) {
            System.out.println("Senha:");
            int senha = sc.nextInt();
            if (senha == 9999) {
                System.out.println("Acesso Permitido.");
            } else {
                System.out.println("Senha incorreta. Acesso Negado.");
            }
        } else {
            System.out.println("Usuário Inválido.");
        }
        sc.close();
    }
}
