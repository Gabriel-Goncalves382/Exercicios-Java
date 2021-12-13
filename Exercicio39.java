package exercicios;

import java.util.Scanner;

public class Exercicio39 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a hora do inicio da partida:");
        int horaInicio = sc.nextInt();
        System.out.println("Digite a hora do fim da partida");
        int horaFim = sc.nextInt();
        int duracao;
        if (horaInicio >= horaFim) {
            duracao = 24 - horaInicio + horaFim;
            System.out.println("A partida de xadrez durou " + duracao + " horas!");
        } else {
            duracao = horaFim - horaInicio;
            System.out.println("A partida de xadrez durou " + duracao + " horas!");
        }
        sc.close();
    }
}
