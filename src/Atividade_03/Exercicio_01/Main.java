package Exercicio_01;
public class Main {
    public static void main(String[] args) throws Exception {
        System.err.println("------ Acessando antes da alteração");
        Configuracao config = Configuracao.getInstancia();
        config.exibirConfiguracoes();
        System.err.println();

        System.err.println("------ Acessando pela mesma variável após alteração");
        config.setUrlBancoDados("https://google.com");
        config.setNomeAplicacao("OnlineDB");
        config.setVersaoAplicacao("2.0");
        config.exibirConfiguracoes();
        System.err.println();

        System.err.println("------ Acessando por nova instância");
        Configuracao.getInstancia().exibirConfiguracoes();

    }
}
