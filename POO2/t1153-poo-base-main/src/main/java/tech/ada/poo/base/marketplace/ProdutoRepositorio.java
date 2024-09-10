package tech.ada.poo.base.marketplace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProdutoRepositorio implements CRUDRepositorio<Produto> {

    List<Produto> produtos = new ArrayList<Produto>();
    static long SEQ = 1;

    private Long proximoId() {
        return SEQ++;
    }

    @Override
    public void cadastrar(Produto produto) {
        produto.setId( proximoId() );
        produtos.add(produto);
    }

    @Override
    public void excluir(Produto produto) {
        // procurar por id
        if (produto == null) throw new RuntimeException("produto nao pode ser nulo");
        // se produto existe
        if (produtos.isEmpty()) throw new RuntimeException("lista vazia");

        // removendo produto
        for (Produto prod : this.produtos) {
            if (produto.equals(prod)) { // impl equals
                produtos.remove(prod); // impl remocao do produto
                return;
            }
        }

        // impl produto nao encontrado
        throw new RuntimeException("produto nao existe");
    }

    @Override
    public Produto consultar(Long id) {
        return null;
    }

    @Override
    public void atualizar(Produto produto) {

    }

    @Override
    public List<Produto> listar() {
        return produtos;
    }

}
