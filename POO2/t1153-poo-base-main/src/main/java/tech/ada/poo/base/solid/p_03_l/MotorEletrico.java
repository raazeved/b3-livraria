package tech.ada.poo.base.solid.p_03_l;

public class MotorEletrico implements Motor {

    public void darPartida() {
        System.out.println("dei partida a combustivel");
    }

    public void movimentar(int velocidade) {
        System.out.println("acelerando a " + velocidade + " km/h");
    }

}
