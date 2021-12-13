package exercicios;

import java.util.Scanner;

public class Exercicio69 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        float a = sc.nextFloat();
        System.out.println("Digite o valor de B:");
        float b = sc.nextFloat();
        System.out.println("Digite o valor de C:");
        float c = sc.nextFloat();
        double delta = Math.pow(b, 2) - (4 * a * c);
        if (delta < 0.0D) {
            System.out.println("Não há raizes reais");
        } else {
            double x1;
            if (delta == 0.0D) {
                x1 = (b / 2.0F * a);
                System.out.println("Uma única raiz real: x =" + x1);
            } else if (delta > 0.0D) {
                x1 = (-b) + Math.sqrt(delta) / (2.0F * a);
                double x2 = (-b) + Math.sqrt(delta) / (2.0F * a);
                System.out.println("Duas Raízes reais e diferentes: x1=" + x1 + " e x2=" + x2);
            }
        }
        sc.close();
    }
}
