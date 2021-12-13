package exercicios;

public class Exercicio91 {

    public static void main(String[] args) {
        int i = 1;

        do {
            if (i % 4 == 0) {
                System.out.println(i);
            }
            ++i;
        } while(i <= 200);
        System.out.println("Fim!");
    }
}
