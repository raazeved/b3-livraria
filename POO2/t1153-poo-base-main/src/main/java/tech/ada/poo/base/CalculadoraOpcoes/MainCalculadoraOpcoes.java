package tech.ada.poo.base.CalculadoraOpcoes;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import tech.ada.poo.base.CalculadoraOpcoes.Lib.BlackSholes;
import java.lang.Object;


// repositorio -> servico -> (controlador -> view)
// (banco + repositorio) -> (servico + regras) -> (controlador -> view)

public class MainCalculadoraOpcoes {

public static boolean ValidarData(String DataValidar) {
    try {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        sdf.parse(DataValidar);
        return true;
    } catch (ParseException ex) {
        return false;
    }
}

public static boolean CalcularDiasCorridos(String DataValidar) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            sdf.parse(DataValidar);
            return true;
        } catch (ParseException ex) {
            return false;
        }
    }


    public class CalculaDiff {
        public static void main(String[] args) {
            DateTime dtToday = new DateTime(); //pega data e hora atual
            DateTime dtOther = new DateTime(DateTime.parse("2014-06-15T08:00:55Z")); //exemplo

            Duration dur = new Duration(dtOther, dtToday); //pega a duração da diferença dos dois

            System.out.println(dur.getStandardDays());
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Double  Spot, Strike,TaxaDeJuros, Volatilidade, PrecoPut, PrecoCall1, PrecoCall2;
        String  Nome;
        String  Vencimento, DataReferencia;  // data

    System.out.println( "Digite o tipo de Opção (CALL ou PUT):" );
    Nome = entrada.next();

    System.out.println( "Entre com Preço do Ativo Objeto:" );
    Spot = entrada.nextDouble();

    while(Spot <0 || Spot >30) {
        System.out.println("Preço do Ativo Objeto inválido. Digite novamente");
        Spot = entrada.nextDouble();
    }

    System.out.println( "Entre com Preço de Exercicio :" );
    Strike = entrada.nextDouble();

    while(Strike <0 || Strike >30) {
        System.out.println("Preço de Exercicio inválido. Digite novamente");
        Strike = entrada.nextDouble();
    }

    System.out.println( "Entre com a Taxa de Juros dessa Operação" );
    TaxaDeJuros = entrada.nextDouble();

    while(TaxaDeJuros <0 || TaxaDeJuros >30) {
        System.out.println("Taxa de Juros inválida. Digite novamente");
        TaxaDeJuros = entrada.nextDouble();
    }

    System.out.println( "Entre com a data de Vencimento DD/MM/YYYY dessa Operação" );
    Vencimento = entrada.next();

    while ( ! ValidarData(Vencimento) ) {
        System.out.println("Data de Vencimento DD/MM/YYYY inválida. Digite novamente");
        Vencimento = entrada.next();
    }

    System.out.println( "Entre com a data Referencia DD/MM/YYYY para Operação" );
    DataReferencia = entrada.next();

    while ( ! ValidarData(DataReferencia) ) {
        System.out.println("Data de Referencia DD/MM/YYYY inválida. Digite novamente");
        DataReferencia = entrada.next();
    }

    System.out.println( "Entre com a Volatilidade Implicita para Operação" );
    Volatilidade = entrada.nextDouble();

    while ( Volatilidade <0 || Volatilidade >100 ) {
        System.out.println("Data de Referencia DD/MM/YYYY inválida. Digite novamente");
        Volatilidade = entrada.nextDouble();
    }
    if (Spot>0 || Spot<8) {
        System.out.println("Preço do Ativo Objeto [" + Spot + "]");
        System.out.println("Preço de Exercício de uma Opção [" + Strike + "]");
        System.out.println("Taxsa de Juros [" + TaxaDeJuros + "]");
        System.out.println("Data de Vencimento DD/MM/YYYY [" + Vencimento + "]");
        System.out.println("Data de Referencia DD/MM/YYYY [" + DataReferencia + "]");
        System.out.println("Prazo da operação [" + ("Pendente") + "]");
        System.out.println("Volatilidade Implicita da Operação [" + Volatilidade + "]");
    }

      System.out.println("------------------ Aguarde Calculando ----------------");

      BlackSholes BS = new BlackSholes();
      PrecoPut = BS.callPrice(Spot, Strike, TaxaDeJuros/100, Volatilidade/100, 0.3  );

      PrecoCall1 = BS.call(Spot, Strike, TaxaDeJuros/100, Volatilidade/100, 0.3  );

      PrecoCall2= BS.call2(Spot, Strike, TaxaDeJuros/100, Volatilidade/100, 0.3  );

      System.out.println("Preço da Opção de PUT sem Monte Carlo [" + PrecoPut + "]");
      System.out.println("Preço da Opção de Call Monte Carlo 10mil passos[" + PrecoCall1 + "]");
      System.out.println("Preço da Opção de Call Monte Carlo 20mil passos[" + PrecoCall2 + "]");

      entrada.close();

/*
    Opcao opcao = new  Opcao(   Spot,
                                Strike,
                                Prazo,
                                TaxaDeJuros,
                                Volatilidade,
                                Dividendos,
                                TipoDaOpcao,
                                Nome);
*/

}
}
