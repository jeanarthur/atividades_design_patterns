package Atividade_06.Exercicio_01;

public interface PizzaBuilder {
    void reset();
    void setTipo(String tipo);
    void setMassa(String massa);
    void setMolho(String molho);
    void addIngrediente(String ingrediente);
    Pizza getPizza();
}
