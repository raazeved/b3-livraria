package tech.ada.poo.base.solid.p_01_s;

public interface ControleEstoqueServico {

    void adicionarProduto(); // ok-1
    void removerProduto(); // ok-1
    void gerarRelatorioMovimentacao(); // ok-2
    void enviarNotificacaoFornecedor(); //ok-3
    void enviarEmail(); // ok-4

    // interface produto
    // adicionar e remover > produto

    // interface relatorio
    // gerarRelatorioMovimentacao

    // interface notificacao
    // enviarNotificacaoFornecedor ..

    // interface
    // enviarEmail ..

    // ok-1
    interface ProdutoServico {
        void adicionarProduto();
        void removerProduto();
    }

    // ok-2
    interface RelatorioServico {
        void gerarRelatorioMovimentacao();
    }

    // ok-3
    interface NotificacaoServico {
        void enviarNotificacaoFornecedor();
    }

    // ok-4
    interface EmailServico {
        void enviarEmail();
    }

    // apos isso a interface ControleEstoqueServico nao vai mais existir

}
