package Atividade_04.Exercicio_01;

public class SMS implements INotificacao {

    @Override
    public void enviar(String mensagem) {
        System.err.println("[SMS] enviado: " + mensagem);
    }

}
