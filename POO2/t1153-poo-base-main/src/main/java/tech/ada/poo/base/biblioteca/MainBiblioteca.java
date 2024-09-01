package tech.ada.poo.base.biblioteca;

import tech.ada.poo.base.biblioteca.model.ItemCatalogo;
import tech.ada.poo.base.biblioteca.model.Livro;
import tech.ada.poo.base.biblioteca.repository.BibliotecaRepositorio;
import tech.ada.poo.base.biblioteca.repository.BibliotecaRepositorioListImpl;
import tech.ada.poo.base.biblioteca.interfaces.BibliotecaServiceFisica;
import tech.ada.poo.base.biblioteca.services.BibliotecaServiceFisicaImpl;
import tech.ada.poo.base.biblioteca.interfaces.BibliotecaServiceVirtual;
import tech.ada.poo.base.biblioteca.services.BibliotecaServiceVirtualImpl;

public class MainBiblioteca {

    public static void main(String[] args) {

        ItemCatalogo livroabc = new Livro("livro abc");

        BibliotecaRepositorio repositorio = new BibliotecaRepositorioListImpl();

        BibliotecaServiceFisica bibServiceFisica = new BibliotecaServiceFisicaImpl(repositorio);
        bibServiceFisica.cadastrar( livroabc );
        boolean r1 = bibServiceFisica.consultar( "livro abs" );
        boolean r2 = bibServiceFisica.consultar( "livro abc" );
        System.out.println(r1 + " "+ r2);

        BibliotecaServiceVirtual bibServiceVirtual = new BibliotecaServiceVirtualImpl(repositorio);
        bibServiceVirtual.reservar(livroabc);
        boolean r3 = bibServiceVirtual.consultar("Livro abs");
        boolean r4 = bibServiceVirtual.consultar("Livro abc");
        System.out.println(r3 + " "+ r4);

        bibServiceVirtual.emprestar(livroabc);
        boolean r5 = bibServiceVirtual.consultar("Livro abs");
        boolean r6 = bibServiceVirtual.consultar("Livro abc");
        System.out.println(r5 + " "+ r6);


        /* Scanner scanner = new Scanner(System.in);
         int opcaoEscolhida = false;

        int opcaoEscolhida;
        do {
            System.out.println("Digite a opção escolhida: ");
            System.out.println("Opção 1 - Cadastrar novo livro");
            System.out.println("Opção 2 - Consultar um livro por nome");
            System.out.println("Opção 3 - Reservar um Livro");
            System.out.println("Opção 4 - Emprestar um Livro");
            System.out.println("Opção 0 - Sair");
            opcaoEscolhida = scanner.nextInt();
            scanner.nextLine();
            String tituloFilme;
            String cpf;
            if (opcaoEscolhida == 1) {
                System.out.println("Escreva o nome do autor: ");
                tituloFilme = scanner.nextLine();
                System.out.println("Informe o cpf do autor: ");
                cpf = scanner.nextLine();
                Autor autorQueSeraSalvo = new Autor(tituloFilme, cpf, new ArrayList());
                negocio.salvar(autorQueSeraSalvo);
                negocio.obterAutores();
            }

*/
    }

}
