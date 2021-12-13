package exercicios;

import java.util.Scanner;

public class Exercicio57 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade do primeiro homem:");
        int h1 = sc.nextInt();
        System.out.println("Digite a idade do segundo homem:");
        int h2 = sc.nextInt();
        System.out.println("Digite a idade do primeira mulher:");
        int m1 = sc.nextInt();
        System.out.println("Digite a idade do segunda mulher:");
        int m2 = sc.nextInt();
        if (h1 > h2) {
            if (m1 > m2) {
                System.out.println("A idade do homem mais velho somada com a idade da mulher mais nova é " + (h1 + m2));
                System.out.println("A idade do homem mais novo multiplicada com a idade da mulher mais velha é " + h2 * m1);
            } else {
                System.out.println("A idade do homem mais velho somada com a idade da mulher mais nova é " + (h1 + m1));
                System.out.println("A idade do homem mais novo multiplicada com a idade da mulher mais velha é " + h2 * m2);
            }
        } else if (m1 > m2) {
            System.out.println("A idade do homem mais velho somada com a idade da mulher mais nova é " + (h2 + m2));
            System.out.println("A idade do homem mais novo multiplicada com a idade da mulher mais velha é " + h1 * m1);
        } else {
            System.out.println("A idade do homem mais velho somada com a idade da mulher mais nova é " + (h2 + m1));
            System.out.println("A idade do homem mais novo multiplicada com a idade da mulher mais velha é " + h1 * m2);
        }
        sc.close();
    }
}
