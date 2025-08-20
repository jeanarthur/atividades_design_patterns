package Exercicio_02;

public class Main {
    
    public static void main(String[] args) {
        System.err.println("-- Contador A --");
        Contador cont_A = Contador.INSTANCIA;
        cont_A.exibirValor();

        cont_A.incrementar();
        cont_A.exibirValor();
        System.err.println();

        System.err.println("-- Contador B --");
        Contador cont_B = Contador.INSTANCIA;
        cont_B.exibirValor();

        cont_B.incrementar();
        cont_B.incrementar();
        cont_B.exibirValor();
        System.err.println();


        System.err.println("-- Contador C --");
        Contador cont_C = Contador.INSTANCIA;
        cont_C.exibirValor();

        cont_C.decrementar();
        cont_C.exibirValor();
        System.err.println();

    }

}
