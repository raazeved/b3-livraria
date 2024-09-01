package tech.ada.poo.base.ordenador.comparator;

import tech.ada.poo.base.equals.Casa;

import tech.ada.poo.base.equals.Aluno;

import java.util.*;

public class MainComparator {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Roberto", 3.0);
        Aluno aluno2 = new Aluno("Silvio", 4.0);
        Aluno aluno3 = new Aluno("Andre", 5.0);
        Aluno aluno4 = new Aluno("Zuleika", 3.0);

        List<Aluno> Alunos = new ArrayList<Aluno>();

        Alunos.add(aluno1);
        Alunos.add(aluno2);
        Alunos.add(aluno3);
        Alunos.add(aluno4);

        Collections.sort(Alunos);
        System.out.println(Arrays.toString(Alunos.toArray()));





        // generics
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(12);
        numeros.add(2);
        numeros.add(33);
        numeros.add(81);
        numeros.add(21);
        //numeros.add("numero"); // exemplo sem generic <Integer>

        // [12, 2, 33, 81, 21] .. [2, 12, 21, 33, 81]

        System.out.println( Arrays.toString( numeros.toArray() ) );

        // comparator - quando usar?
        // quando eu quero definir explicitamente como eu quero ordenar
        Collections.sort(numeros,
            new Comparator<Integer>() {
                @Override
                public int compare(Integer esquerda, Integer direita) {
                    // para ordem inversa ou inverte o sinal ou valor
                    if (esquerda > direita)
                        return 1;
                    else if (esquerda < direita)
                        return -1;
                    else
                        return 0;
                }
            });

        Collections.sort(numeros);
        System.out.println( Arrays.toString( numeros.toArray() ) );



        // -----
        // criterio de comparacao é: ordem do numero + complemento
        List<Casa> casas = new ArrayList<Casa>();
        casas.add( new Casa("abc", 2 ));
        casas.add( new Casa("cba", 3 ));
        casas.add( new Casa("cba", 1 ));
        System.out.println( Arrays.toString( casas.toArray()) );

        // comparator -> bastante usado em camadas de servico/negocio e regras
        Collections.sort(casas,
            new Comparator<Casa>() {
                @Override
                public int compare(Casa esquerda, Casa direita) {
                    // todos tipos wrappers possuem impl propria do compareTo
                    int comparaNumero = esquerda.getNumero().compareTo( direita.getNumero() );

                    if ( comparaNumero == 0) {
                        return esquerda.getComplemento().compareTo(direita.getComplemento());
                    }
                    return comparaNumero;
                }
            }
        );

        Comparator<Casa> comparador = new ComparatorCasa();
        Collections.sort(casas, comparador);

        System.out.println( Arrays.toString( casas.toArray()) );

        System.out.println( "--casa sem comparator" );
        List<Casa> casas2 = new ArrayList<Casa>();
        casas2.add( new Casa("xef", 2 ));
        casas2.add( new Casa("fed", 3 ));
        casas2.add( new Casa("ded", 1 ));
        Collections.sort(casas2);
        System.out.println( Arrays.toString( casas2.toArray()) );
    }

}
