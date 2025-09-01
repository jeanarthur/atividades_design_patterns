package Exercicio_01;
public class Configuracao {
    private static Configuracao instancia = null;
    private String urlBancoDados = "https://localhost:30006";
    private String nomeAplicacao = "LocalDB";
    private String versaoAplicacao = "1.0";

    private Configuracao() {}

    public static Configuracao getInstancia() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

    public String getUrlBancoDados() {
        return urlBancoDados;
    }
    
    public void setUrlBancoDados(String urlBancoDados) {
        this.urlBancoDados = urlBancoDados;
    }

    public String getNomeAplicacao() {
        return nomeAplicacao;
    }

    public void setNomeAplicacao(String nomeAplicacao) {
        this.nomeAplicacao = nomeAplicacao;
    }

    public String getVersaoAplicacao() {
        return versaoAplicacao;
    }

    public void setVersaoAplicacao(String versaoAplicacao) {
        this.versaoAplicacao = versaoAplicacao;
    }

    public void exibirConfiguracoes() {
        System.err.println("URL: " + getUrlBancoDados());
        System.err.println("Nome: " + getNomeAplicacao());
        System.err.println("Versão: " + getVersaoAplicacao());
    }

}
