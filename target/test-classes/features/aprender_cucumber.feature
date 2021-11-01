# language: pt
@AprenderCucumber
Funcionalidade: Aprender Cucumber
  Como um aluno
  Eu quero aprender a ultilizar Cucumber
  Para que ue possa automatizar critérios de aceitação

  Cenario: Deve executar a especificação
    Dado que creie o arquivo corretamente
    Quando executa-lo
    Então a especificação deve ser finalizar com sucesso

  Cenario: Deve incrementar contador
    Dado  que o valor do contador é 15
    Quando eu incermentar em 3
    Então o valor do contador será 18

  Cenario: Deve incrementar contador
    Dado  que o valor do contador é 123
    Quando eu incermentar em 35
    Então o valor do contador será 158