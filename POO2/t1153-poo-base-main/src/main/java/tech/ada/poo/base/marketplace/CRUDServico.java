package tech.ada.poo.base.marketplace;

import java.util.List;

public interface CRUDServico<T> {

    void cadastrar(T t);
    void excluir(T t);
    T consultar(Long id);
    void atualizar(T t);
    List<T> listar();

}
