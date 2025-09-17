package Atividade_06.Exercicio_02;

public class App {
    public static void main(String[] args) {
        System.out.println("=== EXERCÍCIO 02 - RPG ===");
        DiretorPersonagem diretorRPG = new DiretorPersonagem();

        // Criando personagem Guerreiro Anão
        ConcretePersonagemBuilder personagemBuilder = new ConcretePersonagemBuilder();
        diretorRPG.constróiGuerreiroAnao(personagemBuilder, "Thog");
        Personagem thog = personagemBuilder.getPersonagem();
        System.out.println(thog);

        // Criando ficha textual para Mago Elfo
        FichaBuilder fichaBuilder = new FichaBuilder();
        diretorRPG.constróiMagoElfo(fichaBuilder, "Elandril");
        Personagem fichaElandril = fichaBuilder.getPersonagem();
        System.out.println(fichaElandril);
    }
}
