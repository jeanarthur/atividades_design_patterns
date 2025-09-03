package Atividade_04.Exercicio_01;

public class ServicoPush extends ServicoNotificacao {

    @Override
    protected INotificacao criarNotificacao() {
        return new Push();
    }

}
