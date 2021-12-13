package exercicios;

public class Exercicio84 {

    public static void main(String[] args) {
        int c = 0;
        System.out.println("A conversão de graus Celsius em Fahrenheit de 10 em 10 graus é: ");

        while(c < 100) {
            c += 10;
            int f = (9 * c + 160) / 5;
            System.out.println(c + "°C são " + f + "°F");
        }
    }
}
