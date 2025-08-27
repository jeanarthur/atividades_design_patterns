package Atividade_04.Exercicio_01;

public class Main {
    
    public static void main(String[] args) {
        
        ServicoNotificacao servicoEmail = new ServicoEmail();
        servicoEmail.notificar("Boa noite, segue am anexo... Atenciosamente");
        System.err.println();

        ServicoNotificacao servicoSms = new ServicoSMS();
        servicoSms.notificar("Internet sem limites: TIM Ultrafibra 500...");
        System.err.println();

        ServicoNotificacao servicoPush = new ServicoPush();
        servicoPush.notificar("É hora de beber agua!");

    }

}
