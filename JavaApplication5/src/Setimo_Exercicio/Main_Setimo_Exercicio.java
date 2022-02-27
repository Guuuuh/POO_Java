/*7. Implemente um programa que verifique se o valor contido em uma variável do
tipo int é um valor primo.*/
package Setimo_Exercicio;

import java.util.Scanner;

public class Main_Setimo_Exercicio {

    public static void main(String[] args) {
        
        System.out.print("Insira o Numero que deseja verificar: ");

        Scanner sc = new Scanner(System.in);
        int variavel = sc.nextInt();
        
        if (Primo(variavel) == true) System.out.println("É Primo");
        else {
            System.out.println("Não é Primo");
        }
        
    }

    public static boolean Primo(int variavel) {
        if ((variavel == 0) && (variavel == 1)) {
            return false;
        } else {
            int inicio, fim;

            fim = (int) Math.sqrt(variavel);
            for (inicio = 2; inicio <= fim; inicio++) {
                if ((variavel % inicio) == 0) 
                    return (false);                
            }
            
            return (true);

        }

    }
}
