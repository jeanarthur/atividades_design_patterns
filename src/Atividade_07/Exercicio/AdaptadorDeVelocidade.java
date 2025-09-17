package Atividade_07.Exercicio;

public class AdaptadorDeVelocidade implements MedidorDeVelocidade {

    protected SensorEmMilhas sensorEmMilhas;
    private static final double KM_POR_MILHA = 1.60934;

    AdaptadorDeVelocidade(SensorEmMilhas sensorEmMilhas) {
        this.sensorEmMilhas = sensorEmMilhas;
    }

    @Override
    public double getVelocidadeKmh() {
        return sensorEmMilhas.getVelocidadeMph() * KM_POR_MILHA;
    }

}
