package Atividade_05.Exercicio_02;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro() {}

    public Cachorro(Cachorro origem) {
        super(origem);
        if (origem != null) {
            this.raca = origem.raca;
        }
    }

    @Override
    public Prototype clonar() {
        return new Cachorro(this);
    }

    @Override
    public void exibir() {
        System.out.println("Cachorro [nome=" + nome + ", idade=" + idade + ", raça=" + raca + "]");
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
