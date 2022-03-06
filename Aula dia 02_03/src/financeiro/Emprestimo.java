package financeiro;

public class Emprestimo {
    public double valor;
    public double juros;
    public int qtdeParcelas;
    public Pessoa pessoa;

    public Emprestimo(double valor, double juros, int qtdeParcelas) {
        this.valor = valor;
        this.juros = juros;
        this.qtdeParcelas = qtdeParcelas;
    }

    public Emprestimo(double valor, double juros, int qtdeParcelas, Pessoa pessoa) {
        this.valor = valor;
        this.juros = juros;
        this.qtdeParcelas = qtdeParcelas;
        this.pessoa = pessoa;
    }
    
    public boolean depositaEmprestimo() {
        if (this.valor > 0 ) {
            this.pessoa.conta.deposito(this.valor);
            System.out.println("Empréstimo realizado com sucesso !");
            return true;
        }
        System.out.println("O Valor do empréstimo precisa ser maior que 0");
        return false;
    }
}
