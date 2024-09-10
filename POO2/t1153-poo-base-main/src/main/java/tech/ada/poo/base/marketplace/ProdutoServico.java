package tech.ada.poo.base.marketplace;

import java.util.List;

public class ProdutoServico implements CRUDServico<Produto> {

    private CRUDRepositorio<Produto> produtoCRUDRepositorio;

    public ProdutoServico() {
        produtoCRUDRepositorio = new ProdutoRepositorio();
    }

    @Override
    public void cadastrar(Produto produto) {
        // impl verificar se nome e preco vazios
        if (!produto.isNomeValido())
            throw new RuntimeException("nome do produto invalido");

        if (produto.getPreco() == null || produto.getPreco() <= 0)
            throw new RuntimeException("preco do produto invalido");

        produtoCRUDRepositorio.cadastrar(produto);
    }

    @Override
    public void excluir(Produto produto) {
        // procurar por id
        if (produto == null) throw new RuntimeException("produto nao pode ser nulo");
        produtoCRUDRepositorio.excluir(produto);
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
        return produtoCRUDRepositorio.listar();
    }

}
