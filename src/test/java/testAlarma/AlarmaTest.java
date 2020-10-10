package testAlarma;

import Activity.AdicionarHora;
import Activity.MainActivity;
import Activity.SelectAlerta;
import appiumControl.Label;
import appiumControl.List;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

public class AlarmaTest {

    SelectAlerta selectAlerta= new SelectAlerta();
    MainActivity mainActivity= new MainActivity();
    AdicionarHora adicionarHora= new AdicionarHora();
    @Test

    public  void verifyCreateAlarma()throws MalformedURLException {

        selectAlerta.alertaOption.click();
        mainActivity.optionAlarma.click();
        adicionarHora.horaButton.click();
        
        adicionarHora.litoIconButton.click();
        adicionarHora.cerrarAlerta.click();

        Assert.assertFalse("ERROR, No muestra la hora del alarma adcionado",mainActivity.isDisplayedAlarma());
    }


    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
