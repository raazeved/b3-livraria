package tech.ada.poo.base.services.biblioteca;

public interface BibliotecaRepositorio {

    void cadastrar(ItemCatalogo item);

    boolean consultar(String titulo);
}
