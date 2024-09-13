package tech.ada.poo.base.CalculadoraOpcoes;

import java.util.Arrays;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import tech.ada.poo.base.CalculadoraOpcoes.Controller.*;
import tech.ada.poo.base.CalculadoraOpcoes.Repository.OpcaoServico;
import tech.ada.poo.base.CalculadoraOpcoes.Services.RegraCalculoOpcoesCall;
import tech.ada.poo.base.CalculadoraOpcoes.Services.RegraCalculoOpcoesPut;
import tech.ada.poo.base.CalculadoraOpcoes.Repository.OpcaoServico;

import tech.ada.poo.base.CalculadoraOpcoes.View.OpcaoView;
import tech.ada.poo.base.CalculadoraOpcoes.Model.Opcao;

// repositorio -> servico -> (controlador -> view)
// (banco + repositorio) -> (servico + regras) -> (controlador -> view)

public class MainCalculadoraOpcoes {

  public static void main(String[] args) {
    // Preço da Put e Preço da Call
    Double PrecoCall, PrecoPut;

    // Model - Operação de Opções
    Opcao Ops = new Opcao(0.0,
            0.0,
            0.0,
            0.0,
            0.0,
            0.0,
            "PUT"
            , "OPCAO DE JUROS");

    // Controller - Fluxo de Controle
    CalcularOpcoes calcOps = new CalcularOpcoes();

    calcOps.ControlarEntradaDeDados(Ops);

    System.out.println("------------------ Aguarde Calculando ----------------");

    // Calculo da Opções
    RegraCalculoOpcoesPut OpsPut = new RegraCalculoOpcoesPut();
    RegraCalculoOpcoesCall Opscall = new RegraCalculoOpcoesCall();

    // precificação da Put
    PrecoPut = OpsPut.calcularOpcoes(Ops);

    // cadastrar Opcão
      OpcaoServico opcaoServico = new OpcaoServico();
      opcaoServico.cadastrar(Ops);


    // precificação da Call
    Ops.setNrPassosSimular(20000);
    PrecoCall = Opscall.calcularOpcoes(Ops);

    System.out.println("Preço da Opção de PUT  <SEM> Monte Carlo [" + PrecoPut + "]");
    System.out.println("Preço da Opção de Call <COM> Monte Carlo [" + PrecoCall + "]");

    System.out.println("------------------ Resumo da Operação ----------------");

    // View - Visualizar Dados da Opcao
    OpcaoView vlwOps = new OpcaoView();

    List<Opcao> Opcoes = opcaoServico.listar();
    vlwOps.setOpcoes( Opcoes );
    vlwOps.listarOpcoes();;

    vlwOps.OpcaoViewText(Ops);
    vlwOps.OpcaoViewWindow(Ops);

/*
      OpcaoPrecificacao BS = new OpcaoPrecificacao();
      PrecoPut = BS.PrecoDaPut(Spot, Strike, TaxaDeJuros/100, Volatilidade/100, 0.3  );

      PrecoCall1 = BS.PrecoDaCall(Spot, Strike, TaxaDeJuros/100, Volatilidade/100, 0.3, 10000 );

      System.out.println("Preço da Opção de PUT sem Monte Carlo [" + PrecoPut + "]");
      System.out.println("Preço da Opção de Call Monte Carlo 10mil passos[" + PrecoCall1 + "]");
 */

  }
}