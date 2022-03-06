
package financeiro;

public class Financeiro {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa (1, "João", "00000000000");
        pessoa1.conta = new Conta (123, 0, true);
        
        Pessoa pessoa2 = new Pessoa (2, "Cleverson", "11111111111");
        pessoa2.conta = new Conta (1234, 500, true);

        System.out.println(pessoa1.toStringPessoa());
        
        Emprestimo emprestimo1 = new Emprestimo(1000, 0.01, 10, pessoa1);
        emprestimo1.depositaEmprestimo();
        System.out.println(pessoa1.conta.saldo);
    }
    
}
