package tech.ada.poo.base.marketplace;

import java.util.Arrays;
import java.util.List;

// papel de representar a visualizacao e acoes de tomada de decisao
public class ProdutoView {

    private List<Produto> produtos;

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void listarProdutos() {
        // seguem a lista de produtos ordenados por ...
        System.out.println( Arrays.toString(produtos.toArray()) );
    }

}
