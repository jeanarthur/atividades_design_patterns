package Atividade_06.Exercicio_01;

public class App {
    public static void main(String[] args) {
        System.out.println("=== EXERCÍCIO 01 - PIZZARIA ===");
        DiretorPizza diretorPizza = new DiretorPizza();

        // Construindo uma pizza normal
        ConcretePizzaBuilder pizzaBuilder = new ConcretePizzaBuilder();
        diretorPizza.constróiCalabresa(pizzaBuilder);
        Pizza pizzaCalabresa = pizzaBuilder.getPizza();
        System.out.println(pizzaCalabresa);

        // Construindo uma comanda textual
        ComandaBuilder comandaBuilder = new ComandaBuilder();
        diretorPizza.constróiMarguerita(comandaBuilder);
        Pizza comanda = comandaBuilder.getPizza();
        System.out.println(comanda);
    }
}
