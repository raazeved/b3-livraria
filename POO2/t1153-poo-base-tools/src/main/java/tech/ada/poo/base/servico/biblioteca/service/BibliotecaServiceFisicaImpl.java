package tech.ada.poo.base.servico.biblioteca.service;

import tech.ada.poo.base.servico.biblioteca.repository.BibliotecaRepositorio;
import tech.ada.poo.base.servico.biblioteca.model.ItemCatalogo;

public class BibliotecaServiceFisicaImpl
    extends BibliotecaServiceImpl
        implements BibliotecaServiceFisica {

    public BibliotecaServiceFisicaImpl(BibliotecaRepositorio repositorio) {
        super.setRepositorio(repositorio);
    }

    @Override
    public void emprestar() {
        System.out.println("emprestar");
    }

    @Override
    public void devolver() {
        System.out.println("devolver");
    }

    @Override
    public void cadastrar(ItemCatalogo item) {
        // validar para nao salvar item existente
        // lancar excecao que ItemCatalogoExisteException, se existir igual
        // impl o obter e chamar ele do repositorio e comparar com equals

        super.repositorio.cadastrar(item);
        System.out.println( "item " + item +  " cadastrado!" );
    }

}
