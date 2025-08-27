package Atividade_04.Exercicio_01;

public abstract class ServicoNotificacao {

    protected abstract INotificacao criarNotificacao();

    void notificar(String mensagem) {
        INotificacao notificacao = criarNotificacao();
        System.err.println("[ServicoNotificao] enviando notificação...");
        notificacao.enviar(mensagem);
    }

}
