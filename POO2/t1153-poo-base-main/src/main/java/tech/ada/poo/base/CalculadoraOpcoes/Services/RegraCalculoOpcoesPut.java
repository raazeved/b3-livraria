package tech.ada.poo.base.CalculadoraOpcoes.Services;

import tech.ada.poo.base.CalculadoraOpcoes.Model.Opcao;

public class RegraCalculoOpcoesPut implements RegraCalculoOpcoes {

    @Override public double calcularOpcoes(Opcao Opcao) {
        return Opcao.getStrike();
    }{
}
