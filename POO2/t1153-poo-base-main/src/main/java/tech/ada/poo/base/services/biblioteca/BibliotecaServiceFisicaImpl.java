package tech.ada.poo.base.services.biblioteca;

public class BibliotecaServiceFisicaImpl
    extends BibliotecaServiceImpl
        implements BibliotecaServiceFisica {

    public BibliotecaServiceFisicaImpl(BibliotecaRepositorio repositorio) {
        super.setRepositorio(repositorio);
    }

    @Override
    public void reservar() {
        System.out.println("reservar");
    }

    @Override
    public boolean consultar(String titulo) {
        return super.consultar(titulo);
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
        super.repositorio.cadastrar(item);
        System.out.println( "item " + item +  " cadastrado!" );
    }

}
