package Activity;
import appiumControl.Button;
import org.openqa.selenium.By;

public class SelectAlerta {

    public  Button alertaOption;
    public SelectAlerta(){
        alertaOption= new Button(By.id("ch.bitspin.timely:id/continueButton"));

    }
}
