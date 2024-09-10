package tech.ada.poo.base.solid.p_03_l;

public class CarroMotorCombustao implements Carro {

    private MotorCombustao motor;

    public CarroMotorCombustao() {
        this.motor = new MotorCombustao();
    }

    @Override public void ligar() {
        motor.darPartida();
    }

    @Override public void acelerar() {
        motor.movimentar(50);
    }

}
