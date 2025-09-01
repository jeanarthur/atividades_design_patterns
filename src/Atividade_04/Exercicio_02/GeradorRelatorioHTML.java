package Atividade_04.Exercicio_02;

public class GeradorRelatorioHTML extends GeradorRelatorio {

    @Override
    protected Relatorio criarRelatorio() {
        return new RelatorioHTML();
    }

}
