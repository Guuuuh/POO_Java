package financeiro;

public class Transferencia {

    public String log;

    public void movimentacao(Pessoa pessoaOrigem, Pessoa pessoaDestino, double valor) {

        boolean auxVerificacao = pessoaOrigem.conta.saque(valor);

        if (auxVerificacao) {
            pessoaDestino.conta.deposito(valor);
        }
    }

}
