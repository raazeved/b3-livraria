package tech.ada.poo.base.services.biblioteca;

public abstract class BibliotecaServiceImpl {

    protected BibliotecaRepositorio repositorio; // interface tá?

    public void setRepositorio(BibliotecaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public boolean consultar(String titulo) {
        return repositorio.consultar(titulo);
    }

}
