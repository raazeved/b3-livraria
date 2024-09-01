package tech.ada.poo.base.servico.biblioteca.service;

import tech.ada.poo.base.servico.biblioteca.repository.BibliotecaRepositorio;

public class BibliotecaServiceVirtualImpl
    extends BibliotecaServiceImpl
        implements BibliotecaServiceVirtual {

    public BibliotecaServiceVirtualImpl(BibliotecaRepositorio repositorio) {
        super.setRepositorio(repositorio);
    }



}
