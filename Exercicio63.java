package exercicios;

import java.util.Scanner;

public class Exercicio63 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código do empregado:");
        int cod = sc.nextInt();
        System.out.println("Digite o ano do nascimento do empregado:");
        int anoNascimento = sc.nextInt();
        System.out.println("Digite o ano de ingresso do empregado na empresa:");
        int ingresso = sc.nextInt();
        System.out.println("Digite o ano atual:");
        int anoAtual = sc.nextInt();
        int idade = anoAtual - anoNascimento;
        int tempoTrabalhado = anoAtual - ingresso;
        if (idade < 65 && tempoTrabalhado > 30) {
            if (idade < 60 && tempoTrabalhado < 25) {
                System.out.println("Funcionário #" + cod + ". Não requerer! Idade:" + idade + " E Tempo de trabalho: " + tempoTrabalhado);
            } else {
                System.out.println("Funcionário #" + cod + ". Requerer Aposentadoria! Idade:" + idade + " E tempo de trabalho: " + tempoTrabalhado);
            }
        } else {
            System.out.println("Funcionário #" + cod + ". Requerer Aposentadoria! Idade:" + idade + " E tempo de trabalho: " + tempoTrabalhado);
        }
        sc.close();
    }
}
