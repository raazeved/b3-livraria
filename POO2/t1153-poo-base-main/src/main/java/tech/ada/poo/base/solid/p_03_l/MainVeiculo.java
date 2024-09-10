package tech.ada.poo.base.solid.p_03_l;

public class MainVeiculo {

    public static void main(String[] args) {
        // semantica .. o design .. termo ubiquo (ouvir falar isso em DDD)
        Carro carroCombustao = new CarroMotorCombustao();
        Carro carroEletrico = new CarroEletrico();

        CarroTeste pista = new CarroTeste();
        pista.testar(carroCombustao);
        pista.testar(carroEletrico);
    }

    static class CarroTeste {
        void testar(Carro carro) {
            carro.ligar();
            carro.acelerar();
        }
    }

}
