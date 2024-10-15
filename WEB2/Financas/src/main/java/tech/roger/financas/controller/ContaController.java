package tech.roger.financas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import tech.roger.financas.model.TipoTransacao;
import tech.roger.financas.model.Conta;
import tech.roger.financas.model.Transacao;
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
@RequestMapping("api/v1/contas")

public class ContaController {

    @Autowired
    ContaRepository contaRepository;

    // Método 1: Usando @RequestParam para buscar conta pelo ID
    @GetMapping("buscar")
    public Conta getContaByIdRequestParam(@RequestParam Long id) {
        var conta = new Conta();
        conta.setSaldo(BigDecimal.TEN);
        contaRepository.save(conta);
        return contaRepository.findById(id).orElse(null);
    }

    // Método 2: Usando @PathVariable para buscar conta pelo ID
    @GetMapping("/{id}")
    public Conta getContaByIdPathVariable(@PathVariable Long id) {
        Transacao transacao = new Transacao();
        transacao.setDescricao("Minha primeira transacao");
        transacao.setValor(BigDecimal.valueOf(new Random().nextInt(100)));
        transacao.setHorario(LocalDateTime.now());
        transacao.setTipo(TipoTransacao.Outros);
        var conta = new Conta();
        conta.setSaldo(BigDecimal.ONE);
        conta.setTransacoes(List.of(transacao));
        contaRepository.save(conta);
        return contaRepository.findById(id).orElse(null);
    }

    @GetMapping()
    public List<Conta> getContas() {
        return contaRepository.findAll();
    }

}
