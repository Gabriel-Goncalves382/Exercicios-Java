package exercicios;

import java.util.Scanner;

public class Exercicio87 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char confirmar = 'S';
        int total;
        for(total = 0; confirmar == 'S'; confirmar = sc.next().charAt(0)) {
            System.out.println("Cadastre o nome do cômodo: ");
            String nome = sc.next();
            System.out.println("Informe a largura: ");
            int largura = sc.nextInt();
            System.out.println("Informe o comprimento: ");
            int comprimento = sc.nextInt();
            int area = largura * comprimento;
            total += area;
            System.out.println("A área da" + nome + " é " + area + "m²");
            System.out.println("Deseja cadastrar outro cômodo ? [S/N]");
        }
        System.out.println("Área total: " + total + "m²");
        sc.close();
    }
}
