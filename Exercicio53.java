package exercicios;

import java.util.Scanner;

public class Exercicio53 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do primeiro time:");
        String time1 = sc.next();
        System.out.println("Digite a pontuação desse time:");
        int pont1 = sc.nextInt();
        System.out.println("Digite o nome do segundo time:");
        String time2 = sc.next();
        System.out.println("Digite a pontuação desse time:");
        int pont2 = sc.nextInt();
        if (pont1 == pont2) {
            System.out.println("A partida terminou em empate");
        } else if (pont1 > pont2) {
            System.out.println("Vencedor foi o time " + time1);
        } else {
            System.out.println("Vencedor foi o time " + time2);
        }
        sc.close();
    }
}
