package steps;

import converter.DateConverter;
import cucumber.api.Transform;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

import java.util.Date;

public class PrazoTransformSteps {

    Date entrega = new Date();

    @Dado("^-> que o prazo é de (.*)$")
    public void queOPrazoÉDe(@Transform(DateConverter.class) Date date) {
        entrega = date;
    }

    @Então("^-> será efetuada em (.*)$")
    public void seráEfetuadaEm(@Transform(DateConverter.class) Date date) {
        entrega = date;
        Assert.assertEquals(date, entrega);
    }
}
