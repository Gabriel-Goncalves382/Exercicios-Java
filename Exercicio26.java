package exercicios;

import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite comprimento da caixa retangular:");
        int comprimento = sc.nextInt();
        System.out.println("Digite altura da caixa retangular:");
        int altura = sc.nextInt();
        System.out.println("Digite a largura da caixa retangular:");
        int largura = sc.nextInt();
        int volume = comprimento * largura * altura;
        System.out.print("O volume da caixa retangular é: " + volume);
        sc.close();
    }
}
