package Atividade_04.Exercicio_01;

public class Push implements INotificacao {

    @Override
    public void enviar(String mensagem) {
        System.err.println("[Push] enviado: " + mensagem);
    }

}
