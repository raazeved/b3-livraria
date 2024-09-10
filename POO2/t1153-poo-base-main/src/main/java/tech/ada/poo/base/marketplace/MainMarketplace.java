package tech.ada.poo.base.marketplace;

import java.util.Arrays;
import java.util.List;

public class MainMarketplace {

    public static void main(String[] args) {

        // etapa 1
        Produto biscoito = new Produto("Cream Cracker", 3d);
        Produto agua = new Produto("Agua Tonica", 1d);
        Produto laranja = new Produto("Laranja", 0.8);
        Produto rucula = new Produto("Rucula", 1.7);
        Produto brocolis = new Produto("Brocolis", 4.5);
        Produto tomate = new Produto("Tomate", null);

        // DAO, repositorio, ... aqui abordagem bottom-up
        // etapa 2 cadastrar

        ProdutoServico produtoServico = new ProdutoServico();
        produtoServico.cadastrar(biscoito);
        produtoServico.cadastrar(agua);
        produtoServico.cadastrar(laranja);
        produtoServico.cadastrar(rucula);
        produtoServico.cadastrar(brocolis);
//        produtoServico.cadastrar(tomate); // lanca erro dado invalido

        // etapa 3 listar
        ProdutoView view = new ProdutoView();
        List<Produto> produtos = produtoServico.listar();
        view.setProdutos( produtos );
        view.listarProdutos();

        // etapa 4 excluir
        Produto biscoito2 = new Produto("Cream Cracker", 3d);
        biscoito2.setId(1L);
        produtoServico.excluir(biscoito2);
        view.listarProdutos();

        // MVC
        // Repositorio -> Servico -> Main (simplificando aqui)
        view.listarProdutos();

        // controller
        // Repositorio -> Servico -> Controller (View) -> Main

        // para proxima aula 07
        // cadastrar, excluir e listar de no minimo 1 unica entidade
    }

}
