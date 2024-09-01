package tech.ada.poo.base.servico.biblioteca;

import tech.ada.poo.base.servico.biblioteca.model.ItemCatalogo;
import tech.ada.poo.base.servico.biblioteca.model.Livro;
import tech.ada.poo.base.servico.biblioteca.repository.BibliotecaRepositorio;
import tech.ada.poo.base.servico.biblioteca.repository.BibliotecaRepositorioListImpl;
import tech.ada.poo.base.servico.biblioteca.service.BibliotecaServiceFisica;
import tech.ada.poo.base.servico.biblioteca.service.BibliotecaServiceFisicaImpl;
import tech.ada.poo.base.servico.biblioteca.service.BibliotecaServiceVirtual;
import tech.ada.poo.base.servico.biblioteca.service.BibliotecaServiceVirtualImpl;

public class MainBiblioteca {

    public static void main(String[] args) {

        // instanciando interfaces de servico e injetando repositorio nelas
        BibliotecaRepositorio repositorio = new BibliotecaRepositorioListImpl();
        BibliotecaServiceFisica bibServiceFisica = new BibliotecaServiceFisicaImpl(repositorio);
        BibliotecaServiceVirtual bibServiceVirtual = new BibliotecaServiceVirtualImpl(repositorio);

        // livros
        ItemCatalogo labc = new Livro("livro abc");
        ItemCatalogo lalmanaque = new Livro("almanaque carros");

        // cadastro e consulta
        bibServiceFisica.cadastrar( labc );
        ItemCatalogo r1 = bibServiceFisica.consultar( "livro abs" );
        ItemCatalogo r2 = bibServiceFisica.consultar( "livro abc" );
        System.out.println(r1 + " "+ r2);

        // cadastro existente
        // TODO implementar cenario

        // reservar
        String titulo = r2.getTitulo();
        String reserva = bibServiceFisica.reservar(titulo);
        System.out.println( "reserva " + reserva  );

    }

}
