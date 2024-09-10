package tech.ada.poo.base.solid.p_03_l;

public class CarroEletrico implements Carro {

    private MotorEletrico motor;

    @Override public void ligar() {
        // agora eu nao tenho mais motor "convencional"
        //throw new AssertionError("eu nao tenho motor");
    }

    @Override public void acelerar() {
        // isso é uma loucura
    }

}
