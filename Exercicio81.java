package exercicios;

public class Exercicio81 {

    public static void main(String[] args) {
        int acul = 0;
        int cont = 0;
        while(cont < 15) {
            if (acul == 0) {
                acul = 3;
            } else {
                acul *= 3;
            }
            ++cont;
            System.out.println(acul);
        }
    }
}
