package Atividade_04.Exercicio_02;

public class GeradorRelatorioPDF extends GeradorRelatorio {

    @Override
    protected Relatorio criarRelatorio() {
        return new RelatorioPDF();
    }

}
