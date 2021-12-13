package exercicios;

import java.util.Scanner;

public class Exercicio34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas maçãs você deseja comprar?:");
        int maca = sc.nextInt();
        double preco;
        if (maca < 12) {
            preco = (double)maca * 1.3D;
            System.out.println("O valor da sua compra é de R$" + preco);
        } else {
            preco = (maca * 1);
            System.out.println("O valor da sua compra é de R$" + preco);
        }
        sc.close();
    }
}
