package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * @author edufelizardo1@gmail.com
 * @version 1.0.0
 */
public class PrazoSteps {
    Date date = new Date();

    @Dado("^que o prazo é de (\\d+)/(\\d+)/(\\d+)$")
    public void queOPrazoÉDe(int arg0, int arg1, int arg2) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, arg0);
        calendar.set(Calendar.MONTH, arg1 - 1);
        calendar.set(Calendar.YEAR, arg2);
        date = calendar.getTime();
    }

    /*Consigo mudar de dias para meses*/
    @Quando("^a entrega atrasar em (\\d+) (dia|dias|mes|meses)$")
    public void aEntregaAtrasarEmDias(int arg0, String tempo) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if (tempo.equals("dias")) {
            calendar.add(calendar.DAY_OF_MONTH, arg0);
        } else {
            calendar.add(calendar.MONTH, arg0);
        }
        date = calendar.getTime();
    }

    @Então("^será efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
    public void seráEfetuadaEm(String data) {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = format.format(date);
        Assert.assertEquals(data, dataFormatada);
    }
}
