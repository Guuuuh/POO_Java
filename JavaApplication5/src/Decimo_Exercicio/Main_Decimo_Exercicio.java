/* 10. Explique a diferença entre as estruturas de repetição while e do ... while. */

package Decimo_Exercicio;

public class Main_Decimo_Exercicio {

    public static void main(String[] args) {

        int inicio = 1;
        
        int inicio2 = 1;

        int fim = 3;

        while (inicio < fim) {
            System.out.println("While");
            inicio++;
        }

        do {
            System.out.println("DoWhile");

            inicio2++;

        } while (inicio2 < fim);

    }

}
/* O do while vai executar os comandos antes de fazer a verificação e o while verifica antes de executar a primeira vez,
ou seja, o Do while vai executar no mínimo uma vez o codígo, mesmo tendo uma condição falsa.
O While como verifica primeiro antes de rodar o código, pode acabar não rodando o código nenhuma vez. */

