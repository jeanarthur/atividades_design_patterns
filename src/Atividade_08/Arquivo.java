public class Arquivo implements ElementoSistemaArquivos {
    private String nome;
    private int tamanhoEmKB;

    public Arquivo(String nome, int tamanhoEmKB) {
        this.nome = nome;
        this.tamanhoEmKB = tamanhoEmKB;
    }

    @Override
    public int getTamanhoEmKB() {
        return tamanhoEmKB;
    }

    @Override
    public String toString() {
        return "Arquivo: " + nome + " (" + tamanhoEmKB + " KB)";
    }
}
