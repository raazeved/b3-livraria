package tech.ada.poo.base.CalculadoraOpcoes.Repository;

import java.util.List;

public interface CRUDRepositorio<T> {

    void cadastrar(T t);
    void excluir(T t);
    T consultar(Long id);
    void atualizar(T t);
    List<T> listar();

}
