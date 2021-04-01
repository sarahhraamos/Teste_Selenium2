package io.cucumber.sarah;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.*;
import io.cucumber.sarah.services.Configuracao;

public class PedidoSteps {

    @Dado("que clico em pedidos")
    public void que_clico_em_pedidos() throws InterruptedException {
        Thread.sleep(1000);
        Configuracao.seletorQueryCss("a[href='/pedidos'").click(); 
    }

    @Dado("escolho um cliente vinculado")
    public void escolho_um_cliente_vinculado() throws InterruptedException {
        Thread.sleep(1000);
        Configuracao.seletorQueryXpath("//*[@id='pedido_cliente_id']").click();
        Configuracao.seletorQueryXpath("//*[@id='pedido_cliente_id']/option[2]").click();
    }

    @Entao("clico em voltar")
    public void clico_em_voltar() {
        Configuracao.seletorQueryCss("a.btn.btn-default").click();
    }

    @Entao("clico em itens")
    public void clico_em_itens() throws InterruptedException {
        Thread.sleep(1000);
        Configuracao.seletorQueryCss("a[href='/pedidos/4/pedido_produtos'").click(); 
    }

    @Entao("devo preencher o valor do produto com {string}")
    public void devo_preencher_o_valor_do_produto_com(String string) throws InterruptedException {
        Thread.sleep(1000);
        Configuracao.seletorQueryCss("input#pedido_produto_valor").sendKeys(string);
    }
    


}