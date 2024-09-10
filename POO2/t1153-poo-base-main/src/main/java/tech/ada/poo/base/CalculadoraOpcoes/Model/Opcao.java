package tech.ada.poo.base.CalculadoraOpcoes.Model;

import java.util.Date;

public class Opcao {

private Long id;
Double  Spot;
Double  Strike;
Date    Prazo;
Double  TaxaDeJuros;
Double  Volatilidade;
Double  Dividendos;
String  TipoDaOpcao; // Direito ;
String  Nome;

Double precoOpcao;

public Opcao(Double Spot, Double Strike, Date Prazo, Double TaxaDeJuros,
                      Double Volatilidade, Double Dividendos, String TipoDaOpcao, String Nome)
    {
        this.Spot = Spot;
        this.Strike = Strike;
        this.Prazo = Prazo;
        this.TaxaDeJuros = TaxaDeJuros;
        this.Volatilidade = Volatilidade;
        this.Dividendos = Dividendos;
        this.TipoDaOpcao = TipoDaOpcao;
        this.Nome = Nome;
    }

// Propert Get
public void setSpot (Double Spot) {
    this.Spot = Spot;
}

public void setStrike (Double Strike) {
        this.Strike = Strike;
}

public void setPrazo (Date Prazo) {
        this.Prazo = Prazo;
}

public void setTaxaDeJuros (Double TaxaDeJuros) {
        this.TaxaDeJuros = TaxaDeJuros;
}

public void setVolatilidade (Double Volatilidade) {
        this.Volatilidade = Volatilidade;
}

public void setdividendos (Double dividendos) {
        this.Dividendos = Dividendos;
}

public void setTipoDaOpcao (String TipoDaOpcao) {
        this.TipoDaOpcao = TipoDaOpcao;
}

public void setNome (String Nome) {
        this.Nome = Nome;
}

// Property Get

public Double getSpot()  {
        return Spot;
}

public Double getStrike()  {
        return Strike;
}

public Date getPrazo() {
        return Prazo;
}

public Double getTaxaDeJuros () {
        return TaxaDeJuros;
}

public Double getVolatilidade () {
    return Volatilidade;
}

public Double getdividendos () {
    return Dividendos;
}

public String getTipoDaOpcao () {
    return TipoDaOpcao;
}

public String getNome () {
        return Nome;
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

@Override
public String toString() {
    return this.getId() + " " + this.getNome() + " " + this.getStrike();
}

@Override
public boolean equals(Object obj) {
   if (obj == null || this.getId() == null) return false;
      if (! (obj instanceof tech.ada.poo.base.marketplace.Produto) ) return false;
          tech.ada.poo.base.marketplace.Produto produto = (tech.ada.poo.base.marketplace.Produto) obj; // fazendo casting
            if (produto.getId() == null) return false;

            return (this.getId().equals(produto.getId()));
        }

        public boolean isNomeValido() {
            return (this.getNome() != null || !this.getNome().isEmpty());
        }

}

