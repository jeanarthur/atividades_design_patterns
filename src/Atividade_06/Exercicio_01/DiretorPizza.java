package Atividade_06.Exercicio_01;

public class DiretorPizza {
    public void constróiCalabresa(PizzaBuilder builder) {
        builder.reset();
        builder.setTipo("Calabresa");
        builder.setMassa("Tradicional");
        builder.setMolho("Tomate");
        builder.addIngrediente("Calabresa fatiada");
        builder.addIngrediente("Cebola");
        builder.addIngrediente("Orégano");
    }

    public void constróiMarguerita(PizzaBuilder builder) {
        builder.reset();
        builder.setTipo("Marguerita");
        builder.setMassa("Fina");
        builder.setMolho("Tomate");
        builder.addIngrediente("Queijo mussarela");
        builder.addIngrediente("Manjericão");
        builder.addIngrediente("Azeite");
    }
}
