package Práticas;

public class Cliente {

    private String nomeCliente;

    private int idCliente;

    private String endereco;

    public Cliente(String nomeCliente, int idCliente, String endereco) {
        this.nomeCliente = nomeCliente;
        this.idCliente = idCliente;
        this.endereco = endereco;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
