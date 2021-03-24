#Author: Danilo Lourenço 

Feature: Keenggo

@keenggo
Scenario: Realizar Cadastro e login

Given navegar ate o site "http://advantageonlineshopping.com/#/"
When Preencher campo de Cadastro  
And Cadastro sera realizado com sucesso
And Preencher informacoes de Login 
Then Login sera realizado com sucesso
