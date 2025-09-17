package Atividade_06.Exercicio_01;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String tipo;
    private String massa;
    private String molho;
    private List<String> ingredientes = new ArrayList<>();

    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setMassa(String massa) { this.massa = massa; }
    public void setMolho(String molho) { this.molho = molho; }
    public void addIngrediente(String ing) { ingredientes.add(ing); }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pizza: ").append(tipo).append("\n");
        sb.append("Massa: ").append(massa).append("\n");
        sb.append("Molho: ").append(molho).append("\n");
        sb.append("Ingredientes:\n");
        for (String i : ingredientes) sb.append(" - ").append(i).append("\n");
        return sb.toString();
    }
}
