package Atividade_05.Exercicio_02;

public class Gato extends Animal {
    private String cor;

    public Gato() {}

    public Gato(Gato origem) {
        super(origem);
        if (origem != null) {
            this.cor = origem.cor;
        }
    }

    @Override
    public Prototype clonar() {
        return new Gato(this);
    }

    @Override
    public void exibir() {
        System.out.println("Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]");
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
