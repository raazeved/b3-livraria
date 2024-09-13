package tech.ada.poo.base.CalculadoraOpcoes.Model;

import java.util.Date;

public class Opcao {

private Long id;
Double  Spot;
Double  Strike;
Double Prazo;
String  Vencimento;
String  DataReferencia;
Double  TaxaDeJuros;
Double  Volatilidade;
Double  Dividendos;
String  TipoDaOpcao; // Direito ;
String  Nome;
int NrPassosSimular;

Double precoOpcao;

public Opcao(Double Spot, Double Strike, Double Prazo, Double TaxaDeJuros,
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

public void setPrazo (double Prazo) {
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

    public String getVencimento() {
        return Vencimento;
    }

    public void setVencimento(String vencimento) {
        Vencimento = vencimento;
    }

    public String getDataReferencia() {
        return DataReferencia;
    }

    public void setDataReferencia(String dataReferencia) {
        DataReferencia = dataReferencia;
    }

    public Double getDividendos() {
        return Dividendos;
    }

    public void setDividendos(Double dividendos) {
        Dividendos = dividendos;
    }

    public Double getPrecoOpcao() {
        return precoOpcao;
    }

    public void setPrecoOpcao(Double precoOpcao) {
        this.precoOpcao = precoOpcao;
    }

    public void setNrPassosSimular(int nrPassosSimular) {
        this.NrPassosSimular = nrPassosSimular;
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

public double getPrazo() {
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

public int getNrPassosSimular() {
        return NrPassosSimular;
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



