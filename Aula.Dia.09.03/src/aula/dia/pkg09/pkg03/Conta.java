package aula.dia.pkg09.pkg03;

public class Conta {

    private double saldo;
    private int numero;
    private boolean status;

    public Conta(double saldo, int numero, boolean status) {
        this.setSaldo(saldo);
        this.numero = numero;
        this.status = status;
    }

    /* getter */
    public double getSaldo() {
        return this.saldo;
    }

    /* setter */
    public void setSaldo(double saldo) {
        if (saldo > 0) {
            this.saldo = saldo;
        } else {
            this.saldo = 0;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
