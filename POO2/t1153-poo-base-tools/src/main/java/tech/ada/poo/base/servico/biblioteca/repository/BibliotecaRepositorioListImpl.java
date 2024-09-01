package tech.ada.poo.base.servico.biblioteca.repository;

import tech.ada.poo.base.servico.biblioteca.model.ItemCatalogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BibliotecaRepositorioListImpl implements BibliotecaRepositorio {

    static int CODIGO = 1;
    private List<ItemCatalogo> itens = new ArrayList<ItemCatalogo>();

    @Override
    public ItemCatalogo cadastrar(ItemCatalogo item) {
        item.setCodigo(CODIGO++);
        itens.add(item);
        return item;
    }

    // TODO melhorar para usar o Optional ao inves de null
    // exemplo: Optional.of(obj) .. Optional.empty()
    @Override
    public ItemCatalogo consultar(String titulo) {
        if (this.itens == null || itens.isEmpty()) return null;
        for (ItemCatalogo item: this.itens) {
            if (item.getTitulo().equals(titulo))
                return item;
        }
        return null;
    }

    @Override
    public ItemCatalogo atualizar(ItemCatalogo item) {
        return item; // se fosse repositorio banco deveria chamar
    }
}
