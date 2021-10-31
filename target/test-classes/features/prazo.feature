# language:pt
Funcionalidade: Prazo de Entrega
  Como consumidor
  Eu quero inofrmar a data de compra
  Para que eu possa saber o prazo de entrga

  Cenario: Deve calcular atraso no prazo de entrega
    Dado  que o prazo é de 05/11/2021
    Quando a entrega atrasar em 2 dias
    Então será efetuada em 07/11/2021

  Cenario: Deve calcular atraso no prazo de entrega da China
    Dado  que o prazo é de 05/10/2021
    Quando a entrega atrasar em 2 meses
    Então será efetuada em 05/12/2021