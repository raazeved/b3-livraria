package tech.ada.poo.base.biblioteca.model;

import tech.ada.poo.base.biblioteca.controller.LivroOperacoes;

public abstract class ItemCatalogo {

    private String titulo;
    private tech.ada.poo.base.biblioteca.controller.LivroOperacoes LivroOperacoes;
    private boolean reservado;
    private boolean emprestado;
    private String status;

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

    public void setStatus(String status) {
        if (LivroOperacoes.equals(status)){
            this.status = status; }

    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && !(obj instanceof ItemCatalogo)) return false;
        ItemCatalogo item = (ItemCatalogo) obj;

        if ( this.titulo.equals(item.getTitulo()) ) // refatorar para ignore case
            return true;

        return false;
    }

    public boolean getreservado(){
        return reservado;
    }

    public void setreservado(boolean reservado) {
        if (reservado) {
            System.out.println("Livro já reservado");
        } else {
            reservado = true;
            System.out.println("Livro reservado");
        }
    }

    public boolean getemprestado(){
        return emprestado;
    }

    public void setdevolver(boolean devolver){
        if (emprestado) {
            this.emprestado = devolver;
            System.out.println("Livro emprestado devolvido");
         }

        if (reservado) {
            this.reservado = devolver;
        }
            System.out.println("Livro reservado devolvido");
        }

    public void setemprestado(boolean emprestado){
            if (emprestado) {
                System.out.println("Livro já emprestado");
            } else { emprestado=true;
                System.out.println("Livro emprestado");
            }
    }

    }