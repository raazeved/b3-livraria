package tech.ada.poo.base.services.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaRepositorioListImpl implements BibliotecaRepositorio {

    private List<ItemCatalogo> itens = new ArrayList<ItemCatalogo>();

    @Override
    public void cadastrar(ItemCatalogo item) {
        itens.add(item);
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
