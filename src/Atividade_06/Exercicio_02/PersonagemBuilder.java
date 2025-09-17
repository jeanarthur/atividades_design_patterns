package Atividade_06.Exercicio_02;

public interface PersonagemBuilder {
    void reset();
    void setNome(String nome);
    void setClasse(String classe);
    void setRaca(String raca);
    void setAtributos(int vida, int mana, int forca, int inteligencia);
    void addItem(String item);
    Personagem getPersonagem();
}
