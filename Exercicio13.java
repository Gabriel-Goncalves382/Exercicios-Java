package exercicios;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número total de eleitores da cidade:");
        int total = sc.nextInt();
        System.out.println("Digite o número de votos validos:");
        int validos = sc.nextInt();
        System.out.println("Digite o número de votos brancos:");
        int brancos = sc.nextInt();
        System.out.println("Digite o número de votos nulos:");
        int nulos = sc.nextInt();
        double percvalido = (double) (validos * 100 / total);
        double percbranco = (double) (brancos * 100 / total);
        double percnulo = (double) (nulos * 100 / total);
        System.out.println("O Percentual de votos validos é de " + percvalido + "%, de votos em branco " + percbranco + "% e de votos nulos é " + percnulo + "%");
        sc.close();
    }
}