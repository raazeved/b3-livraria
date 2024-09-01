package tech.ada.poo.base.equals;

public class Aluno implements Comparable<Aluno> {

    private String nome;
    private Double nota; // inteiro de proposito

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
          return nome;
    }

    public void setNome(String Nome) {
        this.nome = nome;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
            this.nota = nota;
    }
    @Override
    public int compareTo(Aluno aluno){  // estou recebendo
        int compareNota = this.nota.compareTo(aluno.nota); // retorno do método -1 0 1

        if (compareNota ==0 ) {
           return (-1) * this.nome.compareTo(aluno.nome);
        }
        return compareNota;
    }

    @Override
    public boolean equals(Object obj) {
    // verificar o objeto que se recebe
    if (obj == null || !(obj instanceof tech.ada.poo.base.equals.Aluno) ) return false;
    // verificar os atributos identificaveis

    if (this.nome == null || this.nota == null) return false;

            // fazer casting
            tech.ada.poo.base.equals.Aluno aluno = (tech.ada.poo.base.equals.Aluno) obj;

            // comparar com this os atributos
            boolean r1 = (
                    this.getNome().equals(aluno.getNome())
            );
            boolean r2 = (this.getNota().equals(aluno.getNota())
            );
            return (r1 && r2); // tautologia = true
        }

        // TODO hashcode


        @Override
        public String toString() {
            return this.nome + " " + this.nota;
        }

}
