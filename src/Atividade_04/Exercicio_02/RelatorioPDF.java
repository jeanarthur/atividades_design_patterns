package Atividade_04.Exercicio_02;

public class RelatorioPDF implements Relatorio {

    @Override
    public void gerar(String conteudo) {
        System.err.println(" ---- Relatório PDF ---- ");
        System.err.println(conteudo);
        System.err.println(" ----------------------- ");
    }
    
}
