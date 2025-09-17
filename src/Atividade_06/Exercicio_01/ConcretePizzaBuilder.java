package Atividade_06.Exercicio_01;

public class ConcretePizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public ConcretePizzaBuilder() { reset(); }

    public void reset() { pizza = new Pizza(); }
    public void setTipo(String tipo) { pizza.setTipo(tipo); }
    public void setMassa(String massa) { pizza.setMassa(massa); }
    public void setMolho(String molho) { pizza.setMolho(molho); }
    public void addIngrediente(String ingrediente) { pizza.addIngrediente(ingrediente); }

    public Pizza getPizza() {
        Pizza result = pizza;
        reset();
        return result;
    }
}
