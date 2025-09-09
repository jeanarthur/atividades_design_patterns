package Atividade_05.Exercicio_01;

public class Veiculo implements Prototype {
    private String modelo;
    private String marca;
    private int ano;

    public Veiculo() {}

    // Construtor de cópia
    public Veiculo(Veiculo origem) {
        if (origem != null) {
            this.modelo = origem.modelo;
            this.marca = origem.marca;
            this.ano = origem.ano;
        }
    }

    @Override
    public Prototype clonar() {
        return new Veiculo(this);
    }

    @Override
    public String toString() {
        return "Veiculo [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + "]";
    }

    // Getters e Setters
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setMarca(String marca) { this.marca = marca; }
    public void setAno(int ano) { this.ano = ano; }
}
