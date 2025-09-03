package Atividade_04.Exercicio_02;

public class Main {

    private static GeradorRelatorio definirGerador(String arg) {
        switch (arg.toLowerCase()) {
            case "html":
                return new GeradorRelatorioHTML();
            case "excel":
                return new GeradorRelatorioExcel();
            default:
                return new GeradorRelatorioPDF();
        }
    }

    public static void main(String[] args) {

        // Define valores se nenhum argumento for passado
        if (args.length < 2) {
            args = new String[] { "pdf", "Nenhum conteúdo informado" };
        }

        GeradorRelatorio geradorRelatorio = definirGerador(args[0]);
        String conteudo = args[1];
        geradorRelatorio.processarRelatorio(conteudo);
    }

}
