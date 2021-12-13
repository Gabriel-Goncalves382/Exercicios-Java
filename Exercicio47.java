package exercicios;

import java.util.Scanner;

public class Exercicio47 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de votos para o candidato A:");
        int a = sc.nextInt();
        System.out.println("Digite a quantidade de votos para o candidato B:");
        int b = sc.nextInt();
        System.out.println("Digite a quantidade de votos para o candidato C:");
        int c = sc.nextInt();
        System.out.println("Digite a quantidade de votos brancos:");
        int brancos = sc.nextInt();
        System.out.println("Digite a quantidade de votos nulos:");
        int nulos = sc.nextInt();
        float total = (a + b + c + brancos + nulos);
        float porcentagemTotal = total / 100.0F;
        System.out.println("O total de votos foi de " + total);
        System.out.println("O candadidato A recebeu " + a / porcentagemTotal + "% dos votos");
        System.out.println("O candadidato B recebeu " + b / porcentagemTotal + "% dos votos");
        System.out.println("O candadidato C recebeu " + c / porcentagemTotal + "% dos votos");
        System.out.println("Votos brancos representam " + brancos / porcentagemTotal + "% dos votos");
        System.out.println("E votos nulos representam " + nulos / porcentagemTotal + "% dos votos");
        sc.close();
    }
}
