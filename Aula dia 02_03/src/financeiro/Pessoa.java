package financeiro;

public class Pessoa {

    public int codigo;
    public String nome;
    public String cpf;
    public Conta conta;

    public Pessoa(int codigo, String nome, String cpf) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;

    }
    
    public String toStringPessoa() {
        return "Código: " + this.codigo + 
               ", Nome: " + this.nome + 
               ", Cpf: " + this.cpf +
               ", Conta: " + this.conta.numero;
    }

}
