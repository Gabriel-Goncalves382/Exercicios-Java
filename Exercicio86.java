package exercicios;

public class Exercicio86 {

    public static void main(String[] args) {
        int i = 50;
        int soma = 0;

        int cont;
        for(cont = 0; i < 70; i += 2) {
            soma += i;
            ++cont;
        }

        System.out.println("Soma = " + soma + " | Média = " + soma / cont);
        int media = soma / 10;
        System.out.println("Média aritmética dos valores lidos: " + media);
    }
}
