package exercicios;

import java.util.Scanner;

public class Exercicio62 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a 1° Nota do aluno:");
        int n1 = sc.nextInt();
        System.out.println("Digite a 2° Nota do aluno:");
        int n2 = sc.nextInt();
        System.out.println("Digite a 3° Nota do aluno:");
        int n3 = sc.nextInt();
        System.out.println("Média na Avaliação dos exercícios:");
        int ex = sc.nextInt();
        double mediaAproveitamento = ((n1 + n2 * 2 + n3 * 3 + ex) / 7);
        String conceito = null;
        if (mediaAproveitamento >= 9.0D) {
            conceito = "A";
        } else if (mediaAproveitamento >= 7.5D && mediaAproveitamento < 9.0D) {
            conceito = "B";
        } else if (mediaAproveitamento >= 6.0D && mediaAproveitamento < 7.5D) {
            conceito = "C";
        } else if (mediaAproveitamento < 6.0D) {
            conceito = "D";
        }
        System.out.println("Sua média de aproveitamento é " + mediaAproveitamento);
        System.out.println("A sua média geral é: " + conceito);
        sc.close();
    }
}
