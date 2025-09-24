public class App {
    public static void main(String[] args) {
        Arquivo foto = new Arquivo("foto.png", 1200);
        Arquivo musica = new Arquivo("musica.mp3", 5000);
        Arquivo documento = new Arquivo("documento.docx", 300);

        Diretorio documentos = new Diretorio("Documentos");
        documentos.adicionar(documento);

        Diretorio midias = new Diretorio("Mídias");
        midias.adicionar(foto);
        midias.adicionar(musica);

        Diretorio raiz = new Diretorio("Raiz");
        raiz.adicionar(documentos);
        raiz.adicionar(midias);

        System.out.println(documentos); // 300 KB
        System.out.println(midias);     // 6200 KB
        System.out.println(raiz);       // 6500 KB
    }
}
