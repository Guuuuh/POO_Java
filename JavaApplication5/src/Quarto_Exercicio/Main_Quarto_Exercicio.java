/*4. Implemente um programa que, a partir de uma variável do tipo double, imprima
“positivo” caso o valor da variável seja maior ou igual a zero, ou “negativo” caso
o valor da variável seja menor que zero.*/

package Quarto_Exercicio;

public class Main_Quarto_Exercicio {

    public static void main(String[] args) {

        double variavel = -9.16;

        if (variavel >= 0) {
            System.out.println("O Valor é positivo");
        } else {
            System.out.println("O Valor é negativo");
        }

    }

}
