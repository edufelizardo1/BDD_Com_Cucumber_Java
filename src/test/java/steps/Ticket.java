package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
/**
 * @author edufelizardo1@gmail.com
 * @version 1.0.0
 */
public class Ticket {
    @Dado("^que o ticket é (A.\\d{3})$")
    public void queOTicketÉAF(String arg0) {
    }

    @Dado("^que o valor da passagem é R\\$ (\\d+),(\\d+)$")
    public void queOValorDaPassagemÉR$(int arg0, int arg1) {
    }

    @Dado("^que o nome do passageiro é \"(.*)\"$")
    public void queONomeDoPassageiroÉ(String arg0) throws Throwable {
    }

    @Dado("^que o telefone do passageiro é (\\d+)-(\\d+)$")
    public void queOTelefoneDoPassageiroÉ(int arg0, int arg1) {
    }

    @Quando("^criar os steps$")
    public void criarOsSteps() {
    }

    @Então("^o teste vai funcionar$")
    public void oTesteVaiFuncionar() {
    }

    @Dado("^que o ticket especial é A.(\\d+)$")
    public void queOTicketEspecialÉAB(int arg0) {
    }
}
