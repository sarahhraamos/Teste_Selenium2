package io.cucumber.sarah;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.*;
import io.cucumber.sarah.services.Configuracao;

public class ClienteSteps{

    @Dado("que estou no site de vendas-aula")
    public void entrarNosite() {
        Configuracao.abrir("https://vendas-aula.herokuapp.com/");
    }

    @Dado("devo clicar na aba cliente")
    public void clicarNaAbaCliente() {
        Configuracao.seletorQueryCss("a[href='/clientes'").click();
    }


    @Dado("devo preencher o nome com {string}")
    public void preencherNome(String string) throws InterruptedException {
        Thread.sleep(1000);
        Configuracao.seletorQueryCss("input#cliente_nome").sendKeys(string);
    }

    @Dado("devo preencher o telefone com {string}")
    public void preencherTelefone(String string) {
        Configuracao.seletorQueryCss("input#cliente_telefone").sendKeys(string);
    }

    @Dado("devo preencher o email com {string}")
    public void preencherEmail (String string) {
        Configuracao.seletorQueryCss("input#cliente_email").sendKeys(string);
    }


}