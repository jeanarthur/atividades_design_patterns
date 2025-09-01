package Atividade_04.Exercicio_02;

public abstract class GeradorRelatorio {
    
    protected abstract Relatorio criarRelatorio();
    
    void processarRelatorio(String conteudo) {
        System.err.println("Processando relatório...");
        Relatorio relatorio = criarRelatorio();
        relatorio.gerar(conteudo);
    }

}
