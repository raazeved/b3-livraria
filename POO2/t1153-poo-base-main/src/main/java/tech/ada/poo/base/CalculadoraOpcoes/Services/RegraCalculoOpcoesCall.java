package tech.ada.poo.base.CalculadoraOpcoes.Services;

import tech.ada.poo.base.CalculadoraOpcoes.Model.Opcao;
import tech.ada.poo.base.CalculadoraOpcoes.Model.OpcaoPrecificacao;

public class RegraCalculoOpcoesCall implements RegraCalculoOpcoes {

        @Override public double calcularOpcoes(Opcao Opcao) {
            //   PrecoCall1 = BS.PrecoDaCall(Spot, Strike, TaxaDeJuros/100, Volatilidade/100, 0.3  );
            return OpcaoPrecificacao.PrecoDaCall(Opcao.getSpot(),
                    Opcao.getStrike(),
                    (Opcao.getTaxaDeJuros()/100),
                    (Opcao.getVolatilidade()/100),
                    (Opcao.getPrazo()), Opcao.getNrPassosSimular());
        }
}