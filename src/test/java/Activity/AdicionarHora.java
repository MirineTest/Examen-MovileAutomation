package Activity;

import appiumControl.Button;
import appiumControl.List;
import org.junit.After;
import org.openqa.selenium.By;
import sessionManager.Session;

import java.net.MalformedURLException;

public class AdicionarHora {
    public Button horaButton;
    public Button horaDefecto;
    public Button litoIconButton;
    public Button cerrarAlerta;

    public AdicionarHora(){
        horaButton= new Button(By.id("ch.bitspin.timely:id/action1"));
        horaDefecto= new Button(By.id("ch.bitspin.timely:id/bar_time"));

        litoIconButton= new Button(By.id("ch.bitspin.timely:id/done_action_icon"));
        cerrarAlerta=new Button(By.id("ch.bitspin.timely:id/positiveButtonInner"));


    }


}



