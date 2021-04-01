package io.cucumber.sarah;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.*;
import io.cucumber.sarah.services.Configuracao;

public class ProdutoSteps {

    @Dado("que clico em produtos")
    public void que_clico_em_produtos() {
        Configuracao.seletorQueryCss("a[href='/produtos'").click();
    }

    @Dado("preencho o nome do produto com {string}")
    public void nomeProduto(String string) throws InterruptedException {
        Thread.sleep(1000);
        Configuracao.seletorQueryCss("input#produto_nome.form-control").sendKeys(string);
    }

    @Dado("preencho descricao com {string}")
    public void preencho_descricao_com(String string) {
        Configuracao.seletorQueryCss("textarea#produto_descricao.form-control").sendKeys(string);
    }

    @Dado("preencho quantidade com {string}")
    public void preencho_quantidade_com(String string) {
        Configuracao.seletorQueryCss("input#produto_quantidade.form-control").sendKeys(string);
    }

    @Dado("preencho vencimento com {string}")
    public void preencho_vencimento_com(String string) {
        Configuracao.seletorQueryCss("input#produto_vencimento").click();
        Configuracao.seletorQueryCss("input#produto_vencimento").sendKeys(string);
    }

    @Dado("preencho  com preco compra com {string}")
    public void preencho_com_preco_compra_com(String string) {
        Configuracao.seletorQueryCss("input#produto_preco_compra").sendKeys(string);
    }

    @Dado("preencho  com preco venda com {string}")
    public void preencho_com_preco_venda_com(String string) {
        Configuracao.seletorQueryCss("input#produto_preco_venda").sendKeys(string);
    }

    @Dado("fecho a aplicacao")
    public void fim() {
        Configuracao.fechar();
    }


}