package tech.ada.poo.base.biblioteca.repository;

import tech.ada.poo.base.biblioteca.model.ItemCatalogo;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaRepositorioListImpl implements BibliotecaRepositorio {

    private List<ItemCatalogo> itens = new ArrayList<ItemCatalogo>();

    @Override
    public void cadastrar(ItemCatalogo item) {
        itens.add(item);
    }

    @Override
    public void emprestar(ItemCatalogo item) {
        item.setemprestado(true);
    }

    @Override
    public void reservar(ItemCatalogo item) {
        item.setreservado(true);
    }

    @Override
    public void devolver(ItemCatalogo item) {
        item.setdevolver(true);
    }


    @Override
    public boolean consultar(String titulo) {
        if (this.itens == null || itens.isEmpty()) return false;
        for (ItemCatalogo item: this.itens) {
            // aqui vai dar certo a comparacao, mas nao eh uma boa pratica
            //if (item.getTitulo().equals(itemCatalogo.getTitulo()))
            //    return true;
            // forma correta
            if (item.getTitulo().equals(titulo)) // implementada dentro ItemCatalogo
                return true;
        }
        return false;
    }

    public boolean consultar(ItemCatalogo item) {
        return false; // implementar
    }


}
