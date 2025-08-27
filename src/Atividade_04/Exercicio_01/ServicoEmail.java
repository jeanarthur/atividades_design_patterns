package Atividade_04.Exercicio_01;

public class ServicoEmail extends ServicoNotificacao {

    @Override
    protected INotificacao criarNotificacao() {
        return new Email();
    }

}
