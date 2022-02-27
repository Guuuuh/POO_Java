/*5. Implemente um programa que recebe como entrada uma temperatura em
Fahrenheit e converta para Celsius.*/

package Quinto_Exercicio;

import java.util.Scanner;

public class Main_Quinto_Exercicio {

    public static void main(String[] args) {

        System.out.print("Insira a temperatura em Fahrenheit: ");

        Scanner sc = new Scanner(System.in);
        int Fahrenheit = sc.nextInt();

        System.out.print("A Temperatura em Celsius é: " + ((Fahrenheit - 32) / 1.8));

    }

}
