![](https://img.shields.io/badge/cucumber-v.0.0.1-yellow.svg)
![](https://img.shields.io/badge/selenium-v.3.141.59-green.svg)

# Teste individual Accenture II :zap: </br>
<b> Objetivo:</b> Criar um projeto em Selenium Webdrive, com Java e Cucumber, usando Page objects.
<br>
## Sarah Ramos
<br>
<br>

## Casos de Teste :red_circle: <br>
<b>Funcionalidade: </b>Entrar no [site](https://vendas-aula.herokuapp.com/) e preencher os formulários<br>
<b>Cenario:</b> Cadastrar cliente<br>
    Dado que estou no site de vendas-aula<br>
    E devo clicar na aba cliente<br>
    E clico em novo<br>
    E devo preencher o nome com "ana"<br>
    E devo preencher o telefone com "4002892"<br>
    E devo preencher o email com "@gmail.com"<br>
    Entao devo clicar em salvar<br>
<br>
<br>
<b>Cenário 2:</b> Cadastrar pedido<br>
    Dado que clico em pedidos<br>
    E clico em novo<br>
    E escolho um cliente vinculado<br>
    Entao devo clicar em salvar<br>
    E clico em voltar <br>
    E clico em itens<br>
    E clico em novo<br>
    Entao devo preencher o valor do produto com "200"<br>
    Entao devo clicar em salvar<br>
<br>
<br>
<b>Cenario 3:</b> Cadastrar produto<br>
    Dado que clico em produtos<br>
    E clico em novo<br>
    E preencho o nome do produto com "Bola"<br>
    E preencho descricao com "nao sei"<br>
    E preencho quantidade com "50"<br>
    E preencho vencimento com "12022015402232"<br>
    E preencho  com preco compra com "10"<br>
    E preencho  com preco venda com "20"<br>
    Entao devo clicar em salvar<br>
    E fecho a aplicacao<br>
  <br>
  <br>
  <br>
## Tecnologias utilizadas :heart_eyes: <br>
 :white_check_mark: <b>Java</b><br>
> Linguagem de programação para desenvolvimento da aplicação.<br>
 
 :white_check_mark: <b>Selenium</b><br>
> Framework responsável por fazer a integração do código java com a linguagem Gherkin(Cucumber) abrindo o browser fazendo o teste de comportamento.<br>
 
 :white_check_mark: <b>Cucumber</b><br>
> Framework responsável por traduzir uma linguagem humana em código Java.<br>

:white_check_mark: <b>Maven</b><br>
> Gerenciador de dependências para o Java.<br>

<br>
<br>
<br>

## Como utilizar :computer:<br>

- Instalar o [Java](https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR)
- Instalar [JDK](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html)
- Verificar se o JAVA_HOME está configurado em seu computador.
- Clone do projeto.<br>
`` git clone https://github.com/sarahhraamos/TesteIndividual_Accenture.git ``
- Entrando na pasta do projeto<br>
`` cd TesteIndividual_Accenture ``
- Fazer o download do [Chrome Webdriver](https://chromedriver.chromium.org/downloads) e colocar o arquivo descompactado dentro da pasta driver na raiz do projeto:<br>
<b>Exemplo:</b><br>
``cd driver``<br>
``curl https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_linux64.zip``<br>
``unzip chromedriver_linux64.zip``<br>
``rm -rf chromedriver_linux64.zip``<br>
``cd ../driver``<br>
- Limpando e validando maven Unix<br>
``./mvnw clean``<br>
- Limpando e validando maven Windows<br>
``mvnw.cmd clean``<br>
- Executando teste no Unix<br>
``./test.sh``<br>
- Executando teste no Windows<br>
``test.bat``<br>
