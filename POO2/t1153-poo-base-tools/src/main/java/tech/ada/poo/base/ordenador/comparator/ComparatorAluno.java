package tech.ada.poo.base.ordenador.comparator;

import tech.ada.poo.base.equals.Aluno;

import java.util.Comparator;

public class ComparatorAluno implements Comparator<Aluno> {

    @Override
    public int compare(Aluno esquerda, Aluno direita) {
        int comparaNome = esquerda.getNome().compareTo( direita.getNome() );

        if ( comparaNome == 0) {
            return esquerda.getNota().compareTo(direita.getNota());
        }
        return comparaNome;
    }

}
