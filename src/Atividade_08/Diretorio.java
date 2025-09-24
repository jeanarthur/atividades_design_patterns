import java.util.ArrayList;
import java.util.List;

public class Diretorio implements ElementoSistemaArquivos {
    private String nome;
    private List<ElementoSistemaArquivos> elementos;

    public Diretorio(String nome) {
        this.nome = nome;
        this.elementos = new ArrayList<>();
    }

    public void adicionar(ElementoSistemaArquivos elemento) {
        elementos.add(elemento);
    }

    public void remover(ElementoSistemaArquivos elemento) {
        elementos.remove(elemento);
    }

    @Override
    public int getTamanhoEmKB() {
        int total = 0;
        for (ElementoSistemaArquivos e : elementos) {
            total += e.getTamanhoEmKB();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Diretório: " + nome + " (" + getTamanhoEmKB() + " KB)";
    }
}
