package Atividade_04.Exercicio_01;

public class ServicoSMS extends ServicoNotificacao {

    @Override
    protected INotificacao criarNotificacao() {
        return new SMS();
    }
    
}
