package tech.ada.poo.base.CalculadoraOpcoes.Repository;

import tech.ada.poo.base.CalculadoraOpcoes.Model.Opcao;

import java.util.List;

public class OpcaoServico implements CRUDServico<Opcao> {

    private CRUDRepositorio<Opcao> OpcaoCRUDRepositorio;

    public OpcaoServico() {
        OpcaoCRUDRepositorio = new OpcaoRepositorio();
    }

    @Override
    public void cadastrar(Opcao opcao) {
        // impl verificar se nome e preco vazios
        if (!opcao.isNomeValido())
            throw new RuntimeException("nome do produto invalido");

        OpcaoCRUDRepositorio.cadastrar(opcao);
    }

    @Override
    public void excluir(Opcao opcao) {
        // procurar por id
        if (opcao == null) throw new RuntimeException("produto nao pode ser nulo");
        OpcaoCRUDRepositorio.excluir(opcao);
    }

    @Override
    public Opcao consultar(Long id) {
        return null;
    }

    @Override
    public void atualizar(Opcao opcao) {
        // implementar com banco de dados
    }

    @Override
    public List<Opcao> listar() {
        return OpcaoCRUDRepositorio.listar();
    }

}

