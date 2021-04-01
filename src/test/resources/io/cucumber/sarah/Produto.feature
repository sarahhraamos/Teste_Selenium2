# language : pt

Funcionalidade: Navegar pelo site e preencher os formularios

Cenario: Cadastrar produto
    Dado que clico em produtos
    E clico em novo
    E preencho o nome do produto com "Bola"
    E preencho descricao com "nao sei"
    E preencho quantidade com "50"
    E preencho vencimento com "12022015402232"
    E preencho  com preco compra com "10"
    E preencho  com preco venda com "20"
    Entao devo clicar em salvar
    E fecho a aplicacao