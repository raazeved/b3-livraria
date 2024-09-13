package tech.ada.poo.base.CalculadoraOpcoes.Repository;

import tech.ada.poo.base.CalculadoraOpcoes.Model.Opcao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OpcaoRepositorio implements CRUDRepositorio<Opcao> {

    List<Opcao> opcoes = new ArrayList<Opcao>();
    static long SEQ = 1;

    private Long proximoId() {
        return SEQ++;
    }

    @Override
    public void cadastrar(Opcao opcao) {
        opcao.setId( proximoId() );
        opcoes.add(opcao);
    }

    @Override
    public void excluir(Opcao opcao) {
        // procurar por id
        if (opcao == null) throw new RuntimeException("opcao não pode ser nulo");
        // se produto existe
        if (opcoes.isEmpty()) throw new RuntimeException("lista vazia");

        // removendo produto
        for (Opcao prod : this.opcoes) {
            if (opcao.equals(prod)) { // impl equals
                opcoes.remove(prod); // impl remocao do produto
                return;
            }
        }

        // impl produto nao encontrado
        throw new RuntimeException("produto nao existe");
    }

    @Override
    public Opcao consultar(Long id) {
        return null;
    }

    @Override
    public void atualizar(Opcao produto) {

    }

    @Override
    public List<Opcao> listar() {
        return opcoes;
    }

}
