/*8. Implemente um programa que calcule a área de:
a. um quadrado (tipo = 1);
b. um círculo (tipo = 2);
c. um triângulo (tipo = 3).
Nesse exercício é necessário criar uma variável do tipo int para verificar qual tipo de
área se está querendo calcular (quadrado, círculo ou triângulo). A partir do tipo definido
na variável, calcule a área e apresente o resultado.*/

package Oitavo_Exercicio;

import java.util.Scanner;

public class Main_Oitavo_Exercicio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha entre Calcular a área do Quadrado (case 1) Círculo (case 2) Triângulo (case 3): ");

        int area = entrada.nextInt();

        switch (area) {
            case 1 -> {
                int quadrado = 5;
                /* Todos os lados do quadrado possuem 5cm */

                int totalQuadrado = quadrado * quadrado;

                System.out.println("Está é a área do quadrado com 5 cm de cada lado: " + totalQuadrado);
            }

            case 2 -> {
                int circulo = 20;
                /* o raio do quadrado é 20 */

                int totalCirculo = (int) 3.14 * (circulo * circulo);

                System.out.println("Está é a área do Circulo com 20 de raio: " + totalCirculo);
            }

            case 3 -> {
                int triangulo = 8;
                /* Cada lado do triângulo possui 8 cm com uma altura de 10 cm*/

                int totalTriangulo = (8 * 10) / 2;

                System.out.println("Está é a área do Triângulo com 8cm de base e 10cm de altura: " + totalTriangulo);
            }

        }

    }

}
