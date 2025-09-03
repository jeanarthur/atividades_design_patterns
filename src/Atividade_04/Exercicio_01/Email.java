package Atividade_04.Exercicio_01;

public class Email implements INotificacao {

    @Override
    public void enviar(String mensagem) {
        System.err.println("[Email] enviado: " + mensagem);
    }
    
}
