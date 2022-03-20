package Práticas;

public class Venda {

    private int idVendedor;

    private String modeloCarro;

    private double valorCarro;

    private Cliente cliente;

    public Venda(int idVendedor, String modeloCarro, double valorCarro) {
        this.idVendedor = idVendedor;
        this.modeloCarro = modeloCarro;
        this.valorCarro = valorCarro;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public double getValorCarro() {
        return valorCarro;
    }

    public void setValorCarro(double valorCarro) {
        this.valorCarro = valorCarro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
