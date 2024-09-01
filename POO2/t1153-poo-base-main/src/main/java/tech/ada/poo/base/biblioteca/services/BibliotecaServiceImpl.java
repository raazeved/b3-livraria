package tech.ada.poo.base.biblioteca.services;

import tech.ada.poo.base.biblioteca.repository.BibliotecaRepositorio;

public abstract class BibliotecaServiceImpl {

    protected BibliotecaRepositorio repositorio; // interface tá?

    public void setRepositorio(BibliotecaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public boolean consultar(String titulo) {
        return repositorio.consultar(titulo);
    }

}
