package tech.ada.poo.base.solid.p_02_o;

public class RegraCalculoSenior implements RegraCalculoSalario {

    @Override public double calcularSalario(Funcionario funcionario) {
        return funcionario.getSalario() * Coeficiente.SENIOR;
    }

}
