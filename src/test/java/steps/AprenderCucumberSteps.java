package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

public class AprenderCucumberSteps {
    @Dado("^que creie o arquivo corretamente$")
    public void queCreieOArquivoCorretamente() {
    }

    @Quando("^executa-lo$")
    public void executaLo() {
    }

    @Então("^a especificação deve ser finalizar com sucesso$")
    public void aEspecificaçãoDeveSerFinalizarComSucesso() {
    }

    int contador = 0;
    @Dado("^que o valor do contador é (\\d+)$")
    public void queOValorDoContadorÉ(int contador) {
        this.contador = contador;
    }

    @Quando("^eu incermentar em (\\d+)$")
    public void euIncermentarEm(int incremento) {
        contador += incremento;
    }

    @Então("^o valor do contador será (\\d+)$")
    public void oValorDoContadorSerá(int resultado) {
        Assert.assertEquals(resultado, contador);
    }
}
