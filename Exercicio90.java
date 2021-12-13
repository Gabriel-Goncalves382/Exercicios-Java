package exercicios;

public class Exercicio90 {

    public static void main(String[] args) {
        int i = 1;
        int valor = 0;
        do {
            if (i % 2 == 0) {
                valor += i;
                System.out.println(valor);
            }
            ++i;
        } while(i < 500);
        System.out.println("Fim!");
    }
}
