package lista.De.Exercicio;

public class Carro {

    public int ano;

    public String modelo;

    public double valorDoVeiculo;

    public String placa;
    
    public double ipva;

    public Carro(int ano, String modelo, double valorDoVeiculo, String placa) {
        this.ano = ano;
        this.modelo = modelo;
        this.valorDoVeiculo = valorDoVeiculo;
        this.placa = placa;
    }
    
    public double toCalcularIpva() {
        System.out.println("O IPVA do seu carro é de: ");
         return this.ipva = valorDoVeiculo * 0.035;
        
    }
    
    public boolean toVerificarIpva() {
        if (this.ano  < 2002) {
            System.out.println("Não é necessário pagar o IPVA do seu carro");
            return false;
        } 
        
        System.out.println("É necessário pagar o IPVA do seu carro");
        return true;
    }

}
