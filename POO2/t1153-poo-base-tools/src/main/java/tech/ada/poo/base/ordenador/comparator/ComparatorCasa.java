package tech.ada.poo.base.ordenador.comparator;

import tech.ada.poo.base.equals.Casa;

import java.util.Comparator;

public class ComparatorCasa implements Comparator<Casa> {

    @Override
    public int compare(Casa esquerda, Casa direita) {
        int comparaNumero = esquerda.getNumero().compareTo( direita.getNumero() );

        if ( comparaNumero == 0) {
            return esquerda.getComplemento().compareTo(direita.getComplemento());
        }
        return comparaNumero;
    }

}
