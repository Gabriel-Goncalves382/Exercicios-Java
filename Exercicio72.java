package exercicios;

import java.util.Scanner;

public class Exercicio72 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o 1° valor:");
        int valor1 = sc.nextInt();
        System.out.println("Digite o 2° valor:");
        int valor2 = sc.nextInt();
        System.out.println("Digite o 3° valor:");
        int valor3 = sc.nextInt();
        System.out.println("Digite o 4° valor:");
        int valor4 = sc.nextInt();
        System.out.println("Digite o 5° valor:");
        int valor5 = sc.nextInt();
        if (valor1 > valor2 && valor1 > valor3 && valor1 > valor4 && valor1 > valor5){
            System.out.println("O maior número é " + valor1);
        } else if (valor2 > valor1 && valor2 > valor3 && valor2 > valor4 && valor2 > valor5) {
            System.out.println("O maior número é " + valor2);
        } else if (valor3 > valor1 && valor3 > valor2 && valor3 > valor4 && valor3 > valor5) {
            System.out.println("O maior número é " + valor3);
        } else if (valor4 > valor1 && valor4 > valor2 && valor4 > valor3 && valor4 > valor5) {
            System.out.println("O maior número é " + valor4);
        } else if (valor5 > valor1 && valor5 > valor2 && valor5 > valor3 && valor5 > valor4) {
            System.out.println("O maior número é " + valor5);
        }
        if (valor1 < valor2 && valor1 < valor3 && valor1 < valor4 && valor1 < valor5){
            System.out.println("O menor número é " + valor1);
        } else if (valor2 < valor1 && valor2 < valor3 && valor2 < valor4 && valor2 < valor5){
            System.out.println("O menor número é " + valor2);
        } else if (valor3 < valor1 && valor3 < valor2 && valor3 < valor4 && valor3 < valor5){
            System.out.println("O menor número é " + valor3);
        } else if (valor4 < valor1 && valor4 < valor2 && valor4 < valor3 && valor4 < valor5){
            System.out.println("O menor número é " + valor4);
        } else if (valor5 < valor1 && valor5 < valor2 && valor5 < valor3 && valor5 < valor4){
            System.out.println("O menor número é " + valor5);
        }
        sc.close();
    }
}
