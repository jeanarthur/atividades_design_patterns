package Atividade_04.Exercicio_01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {
            System.err.println("+-----------------------+");
            System.err.println("| 1 - Enviar Email      |");
            System.err.println("| 2 - Enviar SMS        |");
            System.err.println("| 3 - Enviar Push       |");
            System.err.println("| 0 - Sair              |");
            System.err.println("+-----------------------+");
            System.err.print("Escolha uma opção: ");
            Scanner scanner = new Scanner(System.in);

            int opcao = scanner.nextInt();
            scanner.nextLine();
            if (opcao == 0) {
                System.err.println("Saindo...");
                scanner.close();
                break;
            }

            ServicoNotificacao servico;
            switch (opcao) {
                case 1:
                    servico = new ServicoEmail();
                    break;
                case 2:
                    servico = new ServicoSMS();
                    break;
                case 3:
                    servico = new ServicoPush();
                    break;
                default:
                    System.err.println("Opção inválida!");
                    continue;
            }

            System.err.print("Digite a mensagem: ");
            String mensagem = scanner.nextLine();
            servico.notificar(mensagem);
        }
    }

}
