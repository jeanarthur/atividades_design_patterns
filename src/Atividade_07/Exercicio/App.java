package Atividade_07.Exercicio;

public class App {

    public static void main(String[] args) {

        SensorEmMilhas sensorEmMilhas = new SensorEmMilhas();
        AdaptadorDeVelocidade adaptadorDeVelocidadeMphParaKmh = new AdaptadorDeVelocidade(sensorEmMilhas);
        PainelDigital painelDigital = new PainelDigital();

        painelDigital.exibirVelocidade(adaptadorDeVelocidadeMphParaKmh);

    }

}
