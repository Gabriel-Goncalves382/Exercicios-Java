package exercicios;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade em anos:");
        int anos = sc.nextInt();
        System.out.println("Digite os meses");
        int meses = sc.nextInt();
        System.out.println("Digite os dias");
        int dias = sc.nextInt();
        int idade = anos * 365 + meses * 30 + dias;
        System.out.println("Sua idade em dias é: " + idade + " dias!");
        sc.close();
    }
}
