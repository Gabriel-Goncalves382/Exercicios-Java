package exercicios;

import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        String nome = sc.nextLine();
        System.out.println("Digite o seu sexo:");
        char sexo = sc.next().charAt(0);
        System.out.println("Digite a sua altura:");
        float altura = sc.nextFloat();
        double pesoIdeal;
        if (sexo == 'M') {
            pesoIdeal = 72.7D * altura - 58.0D;
            System.out.println(nome + ", o seu peso ideal é" + pesoIdeal + "kg");
        } else {
            pesoIdeal = 62.1D * altura - 44.7D;
            System.out.println(nome + ", o seu peso ideal é " + pesoIdeal + "kg");
        }
        sc.close();
    }
}
