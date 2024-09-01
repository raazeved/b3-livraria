package tech.ada.poo.base.biblioteca.repository;

import tech.ada.poo.base.biblioteca.model.ItemCatalogo;

public interface BibliotecaRepositorio {

    void emprestar(ItemCatalogo item);
    void reservar(ItemCatalogo item);
    void devolver(ItemCatalogo item);
    void cadastrar(ItemCatalogo item);

    boolean consultar(String titulo);

}
