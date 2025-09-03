package Atividade_04.Exercicio_02;

public class RelatorioHTML implements Relatorio {

    @Override
    public void gerar(String conteudo) {
        System.err.println(" ---- Relatório HTML ---- ");
        System.err.println(conteudo);
        System.err.println(" ----------------------- ");
    }
    
}
