package exercicios;

import java.util.Scanner;

public class Exercicio61 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome do Produto:");
        String nomeProduto = sc.next();
        System.out.println("Quantidade de " + nomeProduto + " que foram compradas:");
        int qtdProduto = sc.nextInt();
        System.out.println("Digite o preço do(a) " + nomeProduto + ":");
        int precoUnidade = sc.nextInt();
        double total = (qtdProduto * precoUnidade);
        double desconto;
        double precoFinal;
        if (qtdProduto <= 5) {
            desconto = total * 2.0D / 100.0D;
            precoFinal = total - desconto;
            System.out.println("O total á pagar é de R$" + precoFinal);
        } else if (qtdProduto > 5 && qtdProduto <= 10) {
            desconto = total * 3.0D / 100.0D;
            precoFinal = total - desconto;
            System.out.println("O total á pagar é de R$" + precoFinal);
        } else if (qtdProduto > 10) {
            desconto = total * 10.0D / 100.0D;
            precoFinal = total - desconto;
            System.out.println("O total á pagar é de R$" + precoFinal);
        }
        sc.close();
    }
}
