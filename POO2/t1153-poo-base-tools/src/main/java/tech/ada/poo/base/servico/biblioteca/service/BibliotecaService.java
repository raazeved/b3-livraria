package tech.ada.poo.base.servico.biblioteca.service;

import tech.ada.poo.base.servico.biblioteca.model.ItemCatalogo;

public interface BibliotecaService {

    String reservar(String titulo);
    ItemCatalogo consultar(String titulo);

}
