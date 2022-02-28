/* 12. Implemente um programa que calcule o mínimo múltiplo comum (m.m.c.) de dois
valores inteiros. */
package DecimoSegundo_Exercicio;

public class Main_DecimoSegundo_Exercicio {

    public static void main(String[] args) {

        int valor1 = 3;
        int valor2 = 4;

        int mmc = 2;

        boolean verificador = true;

        while (verificador) {
            if (mmc % valor1 == 0 && mmc % valor2 == 0) {

                System.out.println("MMC de " + (valor1) + "e" + (valor2) + "é: " + mmc);
                verificador = false;
            }
            
            mmc++;
        }

    }

}
