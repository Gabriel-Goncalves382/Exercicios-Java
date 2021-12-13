package exercicios;

public class Exercicio89 {

    public static void main(String[] args) {
        int i = 15;
        int cont = 0;
        do {
            double num = Math.pow((double)cont, 2.0D);
            System.out.println(num);
            ++i;
            ++cont;
        } while(i < 200);
        System.out.println(cont);
    }
}
