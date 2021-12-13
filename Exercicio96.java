package exercicios;

import java.util.Scanner;

public class Exercicio96 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        char confirmar;
        do {
            System.out.println("Cadastre o nome do cômodo:");
            String nome = sc.next();
            System.out.println("Informe a largura: ");
            int largura = sc.nextInt();
            System.out.println("Informe o comprimento: ");
            int comprimento = sc.nextInt();
            int area = largura * comprimento;
            total += area;
            System.out.println("A área da " + nome + " é " + area + "m²");
            System.out.println("Deseja cadastrar outro cômodo ? [S/N]");
            confirmar = sc.next().charAt(0);
        } while(confirmar == 'S');

        System.out.println("Área total: " + total + "m²");
        sc.close();
    }
}
