package exercicios;

import java.util.Scanner;

public class Exercicio97 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = 0;
        int valor;
        int menor;
        do {
            System.out.println("Informe um número inteiro: *Para parar basta escrever um número negativo*");
            valor = sc.nextInt();
            menor = valor;
            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }
        } while(valor >= 0);
        System.out.println("Maior: " + maior + " | Menor: " + menor);
        sc.close();
    }
}
