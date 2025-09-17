package Atividade_06.Exercicio_02;

public class DiretorPersonagem {
    public void constróiGuerreiroAnao(PersonagemBuilder builder, String nome) {
        builder.reset();
        builder.setNome(nome);
        builder.setClasse("Guerreiro");
        builder.setRaca("Anão");
        builder.setAtributos(120, 20, 18, 8);
        builder.addItem("Machado");
        builder.addItem("Armadura leve");
    }

    public void constróiMagoElfo(PersonagemBuilder builder, String nome) {
        builder.reset();
        builder.setNome(nome);
        builder.setClasse("Mago");
        builder.setRaca("Elfo");
        builder.setAtributos(80, 150, 6, 20);
        builder.addItem("Cajado");
        builder.addItem("Roupas místicas");
    }
}

