
package aula.dia.pkg09.pkg03;

public class FinanceiroEncapsulado {

    public static void main(String[] args) {
        Conta minhaConta = new Conta (100, 1, true);
        
        minhaConta.setSaldo(-100);
        
        System.out.println(minhaConta.getSaldo());

    }
    
}