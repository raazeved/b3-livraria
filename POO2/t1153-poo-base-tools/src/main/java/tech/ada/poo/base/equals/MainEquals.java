package tech.ada.poo.base.equals;

public class MainEquals {

    public static void main(String[] args) {

        Casa c1 = new Casa("123");
        c1.setNumero( c1.getNumero() + "abc" );
        Casa c2 = new Casa("123");
        c2.setNumero( c2.getNumero() + "abc" );

        boolean iguais = ( c1.equals(c2) );
        System.out.println( iguais );

        // 1. verificar com ==
        System.out.println("--1--");
        // sem a mutacao do setNumero retorna true
        boolean iguais2 = (c1.getNumero() == c2.getNumero());
        System.out.println( iguais2 );
        System.out.println( c1.getNumero() );
        System.out.println( c2.getNumero() );

        // 2. verificar com equal no numero
        System.out.println("--2--");
        boolean iguais3 = (c1.getNumero().equals(c2.getNumero()));
        System.out.println( iguais3 );

        // 3. verificar com equals com override
        // POO = ( estado + comportamento )
        // se nao for assim, vai ter propriedade + funcoes
        System.out.println("--3--");
        boolean iguais4 = (c1.equals(c2));
        System.out.println( iguais4 );
        Casa c3 = new Casa(null);
        boolean iguais5 = (c3.equals(c1));
        System.out.println( iguais5 );

        // 4. verificar multi atributos
        /// aqui digamos que a regra mudou
        System.out.println("--4--");
        Casa c4 = new Casa("987", 1);
        Casa c5 = new Casa("987", 1);
        boolean iguais6 = (c4.equals(c5));
        System.out.println( iguais6 );
        // sugestao use nomes de variaveis adequados

        // em resumo
        // nao colocar logica da casa fora dela (no main)
        // isso se refere a regra de igualidade
        // que aprendemos sobre equals

        // ALUNOS

        Aluno a1 = new Aluno("Roger");
        a1.setNome( a1.getNome() + "abc" );
        Aluno a2 = new Aluno("Roger");
        a2.setNome( a2.getNome() + "abc" );

       // boolean iguais = ( a1.equals(a2) );
        System.out.println( iguais );

    }

}
