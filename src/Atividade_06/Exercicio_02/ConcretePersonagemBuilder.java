package Atividade_06.Exercicio_02;

public class ConcretePersonagemBuilder implements PersonagemBuilder {
    private Personagem p;

    public ConcretePersonagemBuilder() { reset(); }

    public void reset() { p = new Personagem(); }
    public void setNome(String nome) { p.nome = nome; }
    public void setClasse(String classe) { p.classe = classe; }
    public void setRaca(String raca) { p.raca = raca; }
    public void setAtributos(int vida, int mana, int forca, int inteligencia) {
        p.vida = vida; p.mana = mana; p.forca = forca; p.inteligencia = inteligencia;
    }
    public void addItem(String item) { p.inventario.add(item); }

    public Personagem getPersonagem() {
        Personagem tmp = p;
        reset();
        return tmp;
    }
}
