/*3. Implemente um programa que, a partir de uma variável do tipo int, imprima “par”
caso o valor da variável seja par, ou “impar” caso o valor da variável seja ímpar.*/

package Terceiro_Exercício;

public class Main_Terceiro_Exercício {

    public static void main(String[] args) {

        int variavel = 10;

        if (variavel % 2 == 0) {
            System.out.println("O Valor é Par");
        } else {
            System.out.println("O Valor é Impar");
        }
    }

}
