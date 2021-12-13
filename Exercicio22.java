package exercicios;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tempo gasto até o destino:");
        int tempo = sc.nextInt();
        System.out.println("Digite a velocidade média: ");
        int velocidade = sc.nextInt();
        int distancia = tempo * velocidade;
        double litrosUsados = (distancia / 12);
        System.out.print("Com a velocidade de " + velocidade + "km/h durante " + tempo + " h e a distancia de " + distancia + "km a quantidade de litros usadas será de " + litrosUsados + "L");
        sc.close();
    }
}
