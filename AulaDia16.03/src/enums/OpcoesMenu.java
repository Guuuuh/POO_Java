package enums;

public enum OpcoesMenu {
    SALVAR(1),
    IMPRIMIR(2),
    ABRIR(3);

    private final int valor;

    private OpcoesMenu(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
