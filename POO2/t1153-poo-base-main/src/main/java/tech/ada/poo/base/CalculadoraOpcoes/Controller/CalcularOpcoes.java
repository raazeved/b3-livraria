package tech.ada.poo.base.CalculadoraOpcoes.Controller;

import tech.ada.poo.base.CalculadoraOpcoes.Model.Opcao;
import tech.ada.poo.base.CalculadoraOpcoes.Services.RegraCalculoOpcoes;

public class CalcularOpcoes {

    public void calcular(Opcao Opcao, RegraCalculoOpcoes regra) {
        regra.calcularOpcoes(Opcao);
    }
}
