package tech.ada.poo.base.solid.p_02_o;

public class CalculadoraSalario {

    public void calcular(Funcionario funcionario, RegraCalculoSalario regra) {
        regra.calcularSalario(funcionario);
    }

}
