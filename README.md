# BDD Com Cucumber Java
![Profile views](https://visitor-badge.glitch.me/badge?page_id=edufelizardo1.visitor-BDD_Com_Cucumber_Java)
![GitHub followers](https://img.shields.io/github/followers/edufelizardo1?style=social)
<!-- ![Profile views](https://gpvc.arturio.dev/edufelizardo1) -->
[![made-with-java](https://img.shields.io/badge/Language-Java-1f425f.svg)](https://www.oracle.com/br/java/technologies/javase-jdk8-doc-downloads.html)
[![made-with-java](https://img.shields.io/badge/framework-Gherkin-1f425f.svg)](https://cucumber.io/docs/gherkin/)
[![Framework-Cucumber](https://img.shields.io/badge/framework-Cucumber-1f425f.svg)](https://cucumber.io/)
[![made-with-java](https://img.shields.io/badge/framework-JUnit-1f425f.svg)](https://junit.org/junit4/)
[![made-with-java](https://img.shields.io/badge/ide-Intellij-1f425f.svg)](https://www.jetbrains.com/)
<!-- ![Profile views](https://gpvc.arturio.dev/edufelizardo1) -->
[![GitHub license](https://img.shields.io/github/license/edufelizardo1/CucumberBasic)](https://github.com/edufelizardo1/BDD_Com_Cucumber_Java/blob/main/LICENSE)
[![GitHub forks](https://img.shields.io/github/forks/edufelizardo1/CucumberBasic)](https://github.com/edufelizardo1/BDD_Com_Cucumber_Java/network)
[![GitHub stars](https://img.shields.io/github/stars/edufelizardo1/CucumberBasic)](https://github.com/edufelizardo1/BDD_Com_Cucumber_Java/stargazers)
[![Generic badge](https://img.shields.io/static/v1?label=build&message=success&color=<COLOR>)]()



* Teste de unidade automatizados
* Utilizando o BDD e TDD para construir os testes

### Configuração básica
1. Pom.xml: dependências
~~~
<!-- https://mvnrepository.com/artifact/info.cukes/cucumber-java -->
        <dependency>
            <groupId>info.cukes</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>1.2.5</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/info.cukes/cucumber-picocontainer -->
        <dependency>
            <groupId>info.cukes</groupId>
            <artifactId>cucumber-picocontainer</artifactId>
            <version>1.2.5</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>info.cukes</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>1.2.5</version>
            <scope>test</scope>
        </dependency>
        <!-- https://mvnrepository.com/artifact/junit/junit -->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
        </dependency>
~~~
2. Configurando a classe Hook ou Runner
* Não pode ser esquecido de fazer configuração
* Em ***figure = "Caminho da fiature"***
#### Exemplo:
~~~
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/aprender_cucumber.feature"},
        glue = {"steps"},
        plugin = "pretty"
        )
public class AprenderCucumberRunner {
}
~~~~
## Cenários:
~~~
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
~~~

São testes Simples que procuram entender a funcionalidade da ferramenta ***Cucumber***. Também tem como ituíto otimizar
os tempos de testes, principalmente os unitários, e de que forma pensei nisto. A minha necessidade de contribuir para
com meu time de desnvolvimento, fez com que eu me enteressasse em estudar esta ferramenta, para pode unir as técncicas
de desevolvimento ágil, ***Behaviour Driven Development (ou BDD)*** e o ***Test Driven Development (TDD)***

[<img src="https://img.shields.io/badge/linkedin-%230077B5.svg?&style=for-the-badge&logo=linkedin&logoColor=white" />](https://www.linkedin.com/in/eduardo-felizardo-c%C3%A2ndido-28b16122)
[<img src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" />](edufelizardo1@gmail.com)

