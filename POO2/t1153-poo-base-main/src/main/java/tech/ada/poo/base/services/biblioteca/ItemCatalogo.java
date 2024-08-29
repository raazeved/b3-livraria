package tech.ada.poo.base.services.biblioteca;

public abstract class ItemCatalogo {

    private String titulo;

    @Override
    public String toString() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && !(obj instanceof ItemCatalogo)) return false;
        ItemCatalogo item = (ItemCatalogo) obj;

        if ( this.titulo.equals(item.getTitulo()) ) // refatorar para ignore case
            return true;

        return false;
    }
}
