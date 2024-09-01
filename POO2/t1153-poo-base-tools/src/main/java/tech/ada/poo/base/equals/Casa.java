package tech.ada.poo.base.equals;

public class Casa implements Comparable<Casa> {

    private String numero;

    private Integer complemento; // inteiro de proposito

    public Casa(String num) {
        this.numero = num;
    }

    public Casa(String num, Integer complemento) {
        this.numero = num;
        this.complemento = complemento;
        // se nao aceitar zero a hora de reclamar é aqui - exception
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Integer getComplemento() {
        return complemento;
    }

    public void setComplemento(Integer complemento) {
        this.complemento = complemento;
    }

    @Override
    public boolean equals(Object obj) {
        // verificar o objeto que se recebe
        if (obj == null || !(obj instanceof Casa) ) return false;
        // verificar os atributos identificaveis
        if (this.numero == null || this.complemento == null) return false;

        // fazer casting
        Casa casa = (Casa) obj;

        // comparar com this os atributos
        boolean r1 = (
            this.getNumero().equals(casa.getNumero())
        );
        boolean r2 = (this.getComplemento().equals(casa.getComplemento())
        );
        return (r1 && r2); // tautologia = true
    }

    // TODO hashcode


    @Override
    public String toString() {
        return this.numero + " " + this.complemento;
    }

    @Override
    public int compareTo(Casa item) {
        int comparaNumero = this.numero
            .compareTo(item.getNumero());

        if (comparaNumero == 0 ) {
            return this.getComplemento()
                .compareTo(item.getComplemento());
        }

        return comparaNumero;
    }
}
