package tech.roger.financas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import tech.roger.financas.model.TipoTransacao;
import tech.roger.financas.model.Transacao;
import tech.roger.financas.model.Conta;
import tech.roger.financas.repository.TransacaoRepository;
import tech.roger.financas.repository.ContaRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//Controller

@RestController
@RequestMapping("api/v1/transacoes")

public class TransacaoController {

    @GetMapping("Transacao")
    public Transacao ObterTransacao() {
         Transacao transacao = new Transacao();
         transacao.setDescricao("Tenis de Marca");
         transacao.setValor(new BigDecimal(110));
         transacao.setHorario(LocalDateTime.now());
         transacao.setTipo(TipoTransacao.Outros);
         return transacao;
    }

    @Autowired
    TransacaoRepository TRep;
    @RequestMapping("SalvarTransacao")
    @ResponseBody
    public Transacao SalvarTransacao() {

        Transacao transacao = new Transacao();
        transacao.setDescricao("Tenis de Marca");
        transacao.setValor(new BigDecimal(110));
        transacao.setHorario(LocalDateTime.now());
        transacao.setTipo(TipoTransacao.Outros);
        return TRep.save(transacao);
    }

    @RequestMapping("ListaTransacoes")
    @ResponseBody
    public List<Transacao> ListaTransacoes() {

        return TRep.findAll();
    }

/*
    @RequestMapping("ObterTransacaoConta")
    @ResponseBody
    public Conta ObterTransacaoConta() {
        Conta conta = new Conta();
        Transacao transacao1 = new Transacao();
        transacao1.setDescricao("Tenis de Marca");
        transacao1.setValor(new BigDecimal(110));
        transacao1.setHorario(LocalDateTime.now());
        transacao1.setTipo(TipoTransacao.OUTROS);

        conta.cadastrar(transacao1);

        Transacao transacao2 = new Transacao();
        transacao2.setDescricao("Calca Jeans");
        transacao2.setValor(new BigDecimal(410));
        transacao2.setHorario(LocalDateTime.now());
        transacao2.setTipo(TipoTransacao.Outros);

        conta.cadastrar(transacao2);

        return conta;
   */
}