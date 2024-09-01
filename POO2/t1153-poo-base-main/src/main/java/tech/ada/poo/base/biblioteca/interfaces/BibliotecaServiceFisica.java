package tech.ada.poo.base.biblioteca.interfaces;

import tech.ada.poo.base.biblioteca.model.ItemCatalogo;

public interface BibliotecaServiceFisica extends BibliotecaService {

    void emprestar(ItemCatalogo item);
    void reservar(ItemCatalogo item);
    void devolver(ItemCatalogo item);
    void cadastrar(ItemCatalogo item);

}
