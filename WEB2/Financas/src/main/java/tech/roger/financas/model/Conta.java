package tech.roger.financas.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "saldo", nullable = false, precision = 10, scale = 2)
    private BigDecimal saldo;

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(List<Transacao> transacoes) {
        this.transacoes = transacoes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "conta_id")
    private List<Transacao> transacoes;

    public BigDecimal getSaldo() {
        return saldo;
    }
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }


}
