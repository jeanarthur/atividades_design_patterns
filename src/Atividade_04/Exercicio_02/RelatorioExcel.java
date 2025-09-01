package Atividade_04.Exercicio_02;

public class RelatorioExcel implements Relatorio {

    @Override
    public void gerar(String conteudo) {
        System.err.println(" ---- Relatório Excel ---- ");
        System.err.println(conteudo);
        System.err.println(" ----------------------- ");
    }
    
}
