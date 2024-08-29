package tech.ada.poo.base.services.biblioteca;

public class MainBiblioteca {

    public static void main(String[] args) {

        ItemCatalogo livroabc = new Livro("livro abc");

        BibliotecaRepositorio repositorio = new BibliotecaRepositorioListImpl();

        BibliotecaServiceFisica bibServiceFisica = new BibliotecaServiceFisicaImpl(repositorio);
        bibServiceFisica.cadastrar( livroabc );

        boolean r1 = bibServiceFisica.consultar( "livro abs" );
        boolean r2 = bibServiceFisica.consultar( "livro abc" );
        System.out.println(r1 + " "+ r2);

        BibliotecaServiceVirtual bibServiceVirtual = new BibliotecaServiceVirtualImpl();
        bibServiceVirtual.reservar();

    }

}
