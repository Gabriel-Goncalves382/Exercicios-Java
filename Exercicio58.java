package exercicios;

import java.util.Scanner;

public class Exercicio58 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade em quilos de morangos que desejas comprar:");
        int morangos = sc.nextInt();
        System.out.println("Digite a quantidade em quilos de maçãs que desejas comprar:");
        int macas = sc.nextInt();
        double preco = morangos * 2.5D + macas * 1.8D;
        if (macas + morangos <= 8 && !(preco > 25.0D)) {
            System.out.println("O valor da compra será de R$" + preco);
        } else {
            System.out.println("O valor da compra será de R$" + (preco - preco * 0.1D));
        }
        sc.close();
    }
}
