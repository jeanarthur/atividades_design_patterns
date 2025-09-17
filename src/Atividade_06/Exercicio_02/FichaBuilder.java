package Atividade_06.Exercicio_02;

public class FichaBuilder implements PersonagemBuilder {
    private StringBuilder sb;
    private Personagem temp;

    public FichaBuilder() { reset(); }

    public void reset() { sb = new StringBuilder(); temp = new Personagem(); }
    public void setNome(String nome) { temp.nome = nome; sb.append("Nome: ").append(nome).append("\n"); }
    public void setClasse(String classe) { temp.classe = classe; sb.append("Classe: ").append(classe).append("\n"); }
    public void setRaca(String raca) { temp.raca = raca; sb.append("Raça: ").append(raca).append("\n"); }

    public void setAtributos(int vida, int mana, int forca, int inteligencia) {
        temp.vida = vida; temp.mana = mana; temp.forca = forca; temp.inteligencia = inteligencia;
        sb.append("Vida: ").append(vida).append(" Mana: ").append(mana).append("\n");
        sb.append("Força: ").append(forca).append(" Inteligência: ").append(inteligencia).append("\n");
    }

    public void addItem(String item) { temp.inventario.add(item); sb.append("Item: ").append(item).append("\n"); }

    public Personagem getPersonagem() {
        String texto = "=== FICHA ===\n" + sb.toString();
        reset();
        return new Personagem() {
            @Override
            public String toString() { return texto; }
        };
    }
}
