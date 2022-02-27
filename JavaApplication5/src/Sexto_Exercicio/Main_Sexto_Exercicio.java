/*6. Implemente um programa que leia dois valores inteiros, A e B e troque os valores
de maneira que A possua o valor de B e B possua o valor de A. Imprima o
resultado na tela.*/

package Sexto_Exercicio;

public class Main_Sexto_Exercicio {

    public static void main(String[] args) {
        int a = 5;

        int b = 9;

        int c = a;

        System.out.println(a);

        System.out.println(b);
        
        System.out.println("----------");
        
        a = b;
        
        b = c;
        
        System.out.println(a);

        System.out.println(b);
    }

}
