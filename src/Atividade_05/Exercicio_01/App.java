package Atividade_05.Exercicio_01;

public class App {
    public static void main(String[] args) {
        Veiculo original = new Veiculo();
        original.setModelo("Civic");
        original.setMarca("Honda");
        original.setAno(2022);

        // Clonando o veículo
        Veiculo copia = (Veiculo) original.clonar();

        // Exibindo os dois
        System.out.println("Original: " + original);
        System.out.println("Cópia: " + copia);
    }
}
