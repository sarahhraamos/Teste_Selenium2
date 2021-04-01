package io.cucumber.sarah;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.*;
import io.cucumber.sarah.services.Configuracao;

public class CompartilhadoSteps {

    @Dado("clico em novo")
    public void clico_em_novo() throws InterruptedException {
        Thread.sleep(1000);
        Configuracao.seletorQueryCss("a.btn.btn-primary").click();    
    }

    @Entao("devo clicar em salvar")
    public void salvar() {
        Configuracao.seletorQueryCss("input.btn.btn-primary").click();
    }

}