package Exercicio_02;

public enum Contador {
    INSTANCIA;

    private int valor = 0;

    public void incrementar() {
        INSTANCIA.valor++;
    }

    public void decrementar() {
        INSTANCIA.valor--;
    }

    public void exibirValor() {
        System.err.println("Valor atual: " + INSTANCIA.valor);
    }
}
