package Atividade_06.Exercicio_02;

import java.util.ArrayList;
import java.util.List;

public class Personagem {
    String nome;
    String classe;
    String raca;
    int vida;
    int mana;
    int forca;
    int inteligencia;
    List<String> inventario = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Ficha de Personagem ===\n");
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Classe: ").append(classe).append(" | Raça: ").append(raca).append("\n");
        sb.append("Vida: ").append(vida).append("  Mana: ").append(mana).append("\n");
        sb.append("Força: ").append(forca).append("  Inteligência: ").append(inteligencia).append("\n");
        sb.append("Inventário:\n");
        for (String it : inventario) sb.append(" - ").append(it).append("\n");
        return sb.toString();
    }
}
