package Atividade_06.Exercicio_01;

public class ComandaBuilder implements PizzaBuilder {
    private StringBuilder sb;
    private String tipo;

    public ComandaBuilder() { reset(); }

    public void reset() { sb = new StringBuilder(); tipo = ""; }

    public void setTipo(String tipo) {
        this.tipo = tipo;
        sb.append("=== COMANDA ===\nPizza: ").append(tipo).append("\n");
    }

    public void setMassa(String massa) { sb.append("Massa: ").append(massa).append("\n"); }
    public void setMolho(String molho) { sb.append("Molho: ").append(molho).append("\n"); }
    public void addIngrediente(String ingrediente) { sb.append("Ingrediente: ").append(ingrediente).append("\n"); }

    public Pizza getPizza() {
        String full = sb.toString();
        reset();
        return new Pizza() {
            @Override
            public String toString() { return full; }
        };
    }
}
