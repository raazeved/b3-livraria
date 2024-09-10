package tech.ada.poo.base.solid.p_02_o;

public class RegraCalculoEstagiario implements RegraCalculoSalario {

    @Override public double calcularSalario(Funcionario funcionario) {
        return funcionario.getSalario() * Coeficiente.ESTAGIARIO; // evitem numero magicos
    }

}
