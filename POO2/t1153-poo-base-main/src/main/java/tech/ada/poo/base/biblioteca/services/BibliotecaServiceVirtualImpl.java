package tech.ada.poo.base.biblioteca.services;

import tech.ada.poo.base.biblioteca.interfaces.BibliotecaServiceVirtual;
import tech.ada.poo.base.biblioteca.model.ItemCatalogo;
import tech.ada.poo.base.biblioteca.repository.BibliotecaRepositorio;

public class BibliotecaServiceVirtualImpl
    extends BibliotecaServiceImpl
        implements BibliotecaServiceVirtual {

    public BibliotecaServiceVirtualImpl(BibliotecaRepositorio repositorio) {
        super.setRepositorio(repositorio);
    }

    @Override
    public void reservar( ItemCatalogo item) {
        super.repositorio.reservar(item);
        System.out.println( "item " + item +  " reservado!" );
    }

    @Override
    public boolean consultar(String titulo) {
        return super.consultar(titulo);
    }

    @Override
    public void emprestar(ItemCatalogo item) {
        super.repositorio.emprestar(item);
        System.out.println( "item " + item +  " emprestado!" );
    }

    @Override
    public void devolver(ItemCatalogo item) {
        super.repositorio.devolver(item);
        System.out.println( "item " + item +  " emprestado!" );
    }

    @Override
    public void cadastrar(ItemCatalogo item) {
        super.repositorio.cadastrar(item);
        System.out.println( "item " + item +  " cadastrado!" );
    }
}
