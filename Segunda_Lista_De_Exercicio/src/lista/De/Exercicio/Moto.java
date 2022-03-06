package lista.De.Exercicio;

public class Moto {

    public int ano;

    public String modelo;

    public double valorDoVeiculo;

    public String placa;
    
    public double ipva;

    public Moto(int ano, String modelo, double valorDoVeiculo, String placa) {
        this.ano = ano;
        this.modelo = modelo;
        this.valorDoVeiculo = valorDoVeiculo;
        this.placa = placa;
    }
    
    public double toCalcularIpva() {
        System.out.println("O IPVA da sua Moto é de: ");
         return this.ipva = valorDoVeiculo * 0.035;
        
    }
    
    public boolean toVerificarIpva() {
        if (this.ano  < 2002) {
            System.out.println("Não é necessário pagar o IPVA da sua Moto");
            return false;
        } 
        
        System.out.println("É necessário pagar o IPVA da sua Moto");
        return true;
    }

}
