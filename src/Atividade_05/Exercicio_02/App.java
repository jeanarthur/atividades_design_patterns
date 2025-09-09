package Atividade_05.Exercicio_02;

public class App {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        c1.nome = "Rex";
        c1.idade = 5;
        c1.setRaca("Labrador");

        Gato g1 = new Gato();
        g1.nome = "Mimi";
        g1.idade = 3;
        g1.setCor("Branco");

        // Clonando
        Cachorro c2 = (Cachorro) c1.clonar();
        Gato g2 = (Gato) g1.clonar();

        // Exibindo
        c1.exibir();
        c2.exibir();
        g1.exibir();
        g2.exibir();
    }
}
