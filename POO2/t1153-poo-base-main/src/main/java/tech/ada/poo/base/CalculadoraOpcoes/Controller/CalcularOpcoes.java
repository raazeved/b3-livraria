package tech.ada.poo.base.CalculadoraOpcoes.Controller;

import tech.ada.poo.base.CalculadoraOpcoes.Model.Opcao;
import tech.ada.poo.base.CalculadoraOpcoes.Services.RegraCalculoOpcoes;
import tech.ada.poo.base.CalculadoraOpcoes.Lib.DataUtil;

import java.util.Scanner;

// papel de representar o fluxo de controle para coleta dos dados e acoes de tomada de decisao

public class CalcularOpcoes {

    public void calcular(Opcao Opcao, RegraCalculoOpcoes regra) {
        regra.calcularOpcoes(Opcao);
    }

public void ControlarEntradaDeDados(Opcao Ops) {

        Scanner entrada = new Scanner(System.in);
        DataUtil datautil = new DataUtil();

        Double Spot, Strike, TaxaDeJuros, Volatilidade, PrecoPut, PrecoCall1, PrecoCall2;
        String Nome;
        String Vencimento, DataReferencia;  // data

        System.out.println("Digite o tipo de Opção (CALL ou PUT):");
        Nome = entrada.next();
        Ops.setNome(Nome);

        System.out.println("Entre com Preço do Ativo Objeto:");
        Spot = entrada.nextDouble();

        while (Spot < 0 || Spot > 30) {
            System.out.println("Preço do Ativo Objeto inválido. Digite novamente");
            Spot = entrada.nextDouble();
        }

        Ops.setSpot(Spot);

        System.out.println("Entre com Preço de Exercicio :");
        Strike = entrada.nextDouble();

        while (Strike < 0 || Strike > 30) {
            System.out.println("Preço de Exercicio inválido. Digite novamente");
            Strike = entrada.nextDouble();
        }

        Ops.setStrike(Strike);

        System.out.println("Entre com a Taxa de Juros dessa Operação");
        TaxaDeJuros = entrada.nextDouble();

        while (TaxaDeJuros < 0 || TaxaDeJuros > 30) {
            System.out.println("Taxa de Juros inválida. Digite novamente");
            TaxaDeJuros = entrada.nextDouble();
        }

        Ops.setTaxaDeJuros(TaxaDeJuros);

        System.out.println("Entre com a data de Vencimento DD/MM/YYYY dessa Operação");
        Vencimento = entrada.next();

        while (!datautil.ValidarData(Vencimento)) {
            System.out.println("Data de Vencimento DD/MM/YYYY inválida. Digite novamente");
            Vencimento = entrada.next();
        }

        Ops.setVencimento(Vencimento);

        System.out.println("Entre com a data Referencia DD/MM/YYYY para Operação");
        DataReferencia = entrada.next();

        while (!datautil.ValidarData(DataReferencia)) {
            System.out.println("Data de Referencia DD/MM/YYYY inválida. Digite novamente");
            DataReferencia = entrada.next();
        }
        Ops.setDataReferencia(DataReferencia);

        Ops.setPrazo(datautil.CalcularData(Vencimento, DataReferencia));

        System.out.println("Entre com a Volatilidade Implicita para Operação");
        Volatilidade = entrada.nextDouble();

        while (Volatilidade < 0 || Volatilidade > 100) {
            System.out.println("Data de Referencia DD/MM/YYYY inválida. Digite novamente");
            Volatilidade = entrada.nextDouble();
        }
        Ops.setVolatilidade(Volatilidade);

        entrada.close();

      }
}
