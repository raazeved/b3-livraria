package tech.ada.poo.base.servico.biblioteca.service;

import tech.ada.poo.base.servico.biblioteca.model.ItemCatalogo;
import tech.ada.poo.base.servico.biblioteca.repository.BibliotecaRepositorio;

public abstract class BibliotecaServiceImpl implements BibliotecaService {

    protected BibliotecaRepositorio repositorio;

    public void setRepositorio(BibliotecaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public ItemCatalogo consultar(String titulo) {
        return repositorio.consultar(titulo);
    }

    @Override
    public String reservar(String titulo) {
        ItemCatalogo item = repositorio.consultar(titulo);

        // TODO tratar se nao existir

        // gerando hash e marcando reserva no item
        String hash = String.valueOf(titulo.hashCode());
        item.setReserva(hash);

        // se banco ou memoria, nao muda
        repositorio.atualizar(item);

        return hash;
    }

}
