package tech.ada.poo.base.marketplace;

public class Produto {

    private Long id;
    private String nome;
    Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.getId() + " " + this.getNome() + " " + this.getPreco();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getId() == null) return false;
        if (! (obj instanceof Produto) ) return false;

        Produto produto = (Produto) obj; // fazendo casting
        if (produto.getId() == null) return false;

        return (this.getId().equals(produto.getId()));
    }

    public boolean isNomeValido() {
        return (this.getNome() != null || !this.getNome().isEmpty());
    }
}
