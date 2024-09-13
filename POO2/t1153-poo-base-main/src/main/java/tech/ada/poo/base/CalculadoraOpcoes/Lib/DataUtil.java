package tech.ada.poo.base.CalculadoraOpcoes.Lib;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import org.joda.time.DateTime;
import org.joda.time.Duration;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.lang.Object;
import java.util.Date;

import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.Days;


public class DataUtil {

    public static void main(String[] args) {
        String Vencimento = "20/11/2023";
        String DataReferencia = "20/12/2024";
        LocalDate outraData = LocalDate.of(2020, Month.SEPTEMBER, 26);

        int dias = DataDiff(28, 2, 2000, 1, 3, 2008);
        System.out.println(dias);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data1 = LocalDate.parse(Vencimento, fmt);
        LocalDate data2 = LocalDate.parse(DataReferencia, fmt);

        System.out.println(data1);
        System.out.println(data2);

        // Calcula a diferença de dias entre as duas datas
        long diferencaEmDias = ChronoUnit.DAYS.between(data1, data2);
        // Calcula a diferença de meses entre as duas datas
        long diferencaEmMes = ChronoUnit.MONTHS.between(data1, data2);
        // Calcula a diferença de anos entre as duas datas
        long diferencaEmAnos = ChronoUnit.YEARS.between(data1, data2);


        // Exibe a diferença em dias entre as datas
        System.out.println("Diferença em dias entre " + data1 + " e " + data2 + " = " + diferencaEmDias);
        // Exibe a diferença em meses entre as datas
        System.out.println("Diferença em meses entre " + data1 + " e " + data2 + " = " + diferencaEmMes);
        // Exibe a diferença em anos entre as datas
        System.out.println("Diferença em anos entre " + data1 + " e " + data2 + " = " + diferencaEmAnos);


        //    DateTimeFormatter f = DateTimeFormatter.ofPattern( "dd/MM/yyyy" ) ;
        //    LocalDate ld = LocalDate.parse( input , f ) ;
        //    System.out.println(dtToday);
        //    System.out.println(dtOther);

        //DateTime dtToday = new DateTime(DateTime.parse(Vencimento, "dd/MM/yyyy"));

        //DateTime dtOther = new DateTime(DateTime.parse(DataReferencia, "dd/MM/yyyy"));

        // Duration dur = new Duration(dtOther, dtToday); //pega a duração da diferença dos dois

        // System.out.println(dur.getStandardDays());
    }

    public static int DataDiff(int dia1, int mes1, int ano1, int dia2, int mes2, int ano2) {

        int mes[] = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dias = 0, meses = 0, anos = 0;
        String temp = Integer.toString(ano1);

        if (temp.charAt(temp.length() - 1) == '0' && temp.charAt(temp.length() - 2) == '0') {
            if (ano1 % 400 == 0) {
                mes[1] = 29;
            } else {
                mes[1] = 28;
            }
        } else if (ano1 % 4 == 0) {
            mes[1] = 29;
        } else {
            mes[1] = 28;
        }

        anos = ano2 - ano1;

        if (mes2 > mes1 || mes1 == mes2) {
            meses = mes2 - mes1;
        } else {
            meses = 12 - (mes1 - mes2);
            anos -= 1;
        }

        if (dia2 > dia1 || dia1 == dia2) {
            dias = dia2 - dia1;
        } else {
            dias = (mes[mes1 - 1] - dia1) + dia2;
            meses -= 1;
        }

        System.out.printf("* Diferença em dias/meses/anos:\n\n-> %d dia(s) / %d mes(es) / %d ano(s) .\n\n", dias, meses, anos);

        return (anos * 365 + meses * 31 + dias);

    }


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

    public static Double CalcularData(String Vencimento, String DataReferencia) {
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate data1 = LocalDate.parse(Vencimento, fmt);
            LocalDate data2 = LocalDate.parse(DataReferencia, fmt);

            // Calcula a diferença de dias entre as duas datas
            long diferencaEmDias = ChronoUnit.DAYS.between(data1, data2);
            // Calcula a diferença de meses entre as duas datas
            long diferencaEmMes = ChronoUnit.MONTHS.between(data1, data2);
            // Calcula a diferença de anos entre as duas datas
            long diferencaEmAnos = ChronoUnit.YEARS.between(data1, data2);

            double converted = (double) diferencaEmAnos;
            return converted;
    }
}