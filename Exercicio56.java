package exercicios;

import java.util.Scanner;

public class Exercicio56 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tipo de combustível que desejas comprar: Alcool(A) ou Gasolina(G): ");
        String combustivel = sc.next();
        System.out.println("Digite a quantidade de litros que deseja comprar: ");
        int litros = sc.nextInt();
        if (litros < 20) {
            if (combustivel == "G") {
                System.out.println("O preço de " + litros + " litros de gasolina será de R$" + (litros - litros * 0.04D) * 3.3D);
            } else {
                System.out.println("O preço de " + litros + " litros de alcool será de R$" + (litros - litros * 0.03D) * 2.9D);
            }
        } else if (combustivel == "G") {
            System.out.println("O preço de " + litros + " litros de gasolina será de R$" + (litros - litros * 0.06D) * 3.3D);
        } else {
            System.out.println("O preço de " + litros + " litros de álcool será de R$" + (litros - litros * 0.05D) * 2.9D);
        }
        sc.close();
    }
}
