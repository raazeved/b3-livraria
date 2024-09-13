package tech.ada.poo.base.CalculadoraOpcoes.Services;

import tech.ada.poo.base.CalculadoraOpcoes.Model.Opcao;
import tech.ada.poo.base.CalculadoraOpcoes.Model.OpcaoPrecificacao;

public class RegraCalculoOpcoesPut implements RegraCalculoOpcoes {

    @Override public double calcularOpcoes(Opcao Opcao) {
        //    PrecoPut = BS.PrecoDaPut(Spot, Strike, TaxaDeJuros/100, Volatilidade/100, 0.3  );
        System.out.println("------------------ Calculando Preço da Put ----------------");

        System.out.println("S " +Opcao.getSpot() + "/ " +
                "St" + Opcao.getStrike() + "/ " +
                "J"+ (Opcao.getTaxaDeJuros()/100)+ "/ " +
                "V"+ (Opcao.getVolatilidade()/100) + "/ " +
                "P"+ (Opcao.getPrazo()+0.1));

        return OpcaoPrecificacao.PrecoDaPut(Opcao.getSpot(),
                    Opcao.getStrike(),
                    (Opcao.getTaxaDeJuros()/100),
                    (Opcao.getVolatilidade()/100),
                    (Opcao.getPrazo()+0.1));
        }
    }