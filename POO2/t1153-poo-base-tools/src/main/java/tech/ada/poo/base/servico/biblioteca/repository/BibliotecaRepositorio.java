package tech.ada.poo.base.servico.biblioteca.repository;

import tech.ada.poo.base.servico.biblioteca.model.ItemCatalogo;

public interface BibliotecaRepositorio {

    ItemCatalogo cadastrar(ItemCatalogo item);

    ItemCatalogo consultar(String titulo);

    ItemCatalogo atualizar(ItemCatalogo item);

}
