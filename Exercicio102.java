package exercicios;

public class Exercicio102 {

    public static void main(String[] args) {
        int total = 0;
        for(int i = 1; i <= 500; ++i) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        System.out.println(total);
    }
}
