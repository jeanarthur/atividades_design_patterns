package Atividade_05.Exercicio_02;

public abstract class Animal implements Prototype {
    protected String nome;
    protected int idade;

    public Animal() {}

    public Animal(Animal origem) {
        if (origem != null) {
            this.nome = origem.nome;
            this.idade = origem.idade;
        }
    }

    public abstract void exibir();
}

