package financeiro;

public class Conta {

    public int numero;
    public double saldo;
    public boolean status;

    public Conta(int numero, double saldo, boolean status) {
        this.numero = numero;
        this.saldo = saldo;
        this.status = status;
    }

    public boolean saque(double valor) {
        if (this.saldo >= valor && valor > 0) {
            System.out.println("Saque Realizado com sucesso!");
            this.saldo -= valor;
            return true;
        }

        System.out.println("Saldo insuficiente para saque ou valor negativo informado");
        return false;
    }
    
    public boolean deposito(double valor) {
        if (valor > 0) {
            System.out.println("Depósito Realizado com sucesso!");
            this.saldo += valor;
            return true;
        }
        
        System.out.println("O valor de depósito precisa ser maior que 0");
        return false;
    }

}
