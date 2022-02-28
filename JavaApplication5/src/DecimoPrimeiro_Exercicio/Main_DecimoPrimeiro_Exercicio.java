/* 11. Explique a diferença entre a utilização dos incrementos ++i e i++. */
package DecimoPrimeiro_Exercicio;

public class Main_DecimoPrimeiro_Exercicio {

    public static void main(String[] args) {

        int I = 0;
        int J = 0;
        
        System.out.println(I);
        System.out.println(J);
        
        System.out.println("---------------");

        int A = I++; // A = 0, I = 1
        int B = ++J; // B = 1, J = 1
        
        System.out.println(A);
        
        System.out.println(B);
        
        System.out.println(I);
        
        System.out.println(J);
        
        /* instrução ++J, incrementa a variável B antes dela ser utilizada no comando.
        Já a I++ incrementara depois de ser utilizada 
        Por isso a variável A permance como 0, e a B é incrementada para 1 */

    }

}
