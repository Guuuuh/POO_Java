/* 9. Implemente um programa simples de verificação de senhas, que permita uma
quantidade máxima de tentativas para inserir a senha correta. */
package Nono_Exercicio;

import java.util.Scanner;

public class Main_Nono_Exercicio {

    public static void main(String[] args) {

        var senha = "BloodborneTheBest";

        System.out.println("Insira a senha correta (5 Tentativas)");

        for (int inicio = 0; inicio < 5; inicio++) {
            System.out.print("Insira a Senha: ");

            Scanner sc = new Scanner(System.in);
            String inputsenha = sc.next();

            if (inputsenha.equals(senha)) {
                System.out.println("A Senha inserida está Correta");
                break;
            } else {
                System.out.println("A Senha inserida está Errada");
            }

        }
    }

}
