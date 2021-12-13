package exercicios;

import java.util.Scanner;

public class Exercicio43 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da sua conta:");
        int numConta = sc.nextInt();
        System.out.println("Digite o saldo total do cartão:");
        float saldoTot = sc.nextFloat();
        System.out.println("Digite o valor gasto em débito:");
        float debito = sc.nextFloat();
        System.out.println("Digite o valor gasto em crédito:");
        float credito = sc.nextFloat();
        float saldoAtual = saldoTot - debito + credito;
        if (saldoAtual >= 0.0F) {
            System.out.println("Conta N°" + numConta + "- Saldo Positivo: R$" + saldoAtual);
        } else {
            System.out.println("Conta N°" + numConta + "- Saldo Negativo: R$" + saldoAtual);
        }
        sc.close();
    }
}
