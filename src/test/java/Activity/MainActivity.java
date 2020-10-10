package Activity;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class MainActivity {
    public Button optionAlarma;
    public  MainActivity(){

        optionAlarma= new Button(By.id("ch.bitspin.timely:id/leftButton"));
    }
    public boolean isDisplayedAlarma(){
        String locator="ch.bitspin.timely:id/time_glow";
        Label contact = new Label(By.xpath(locator));
        return contact.isDisplayed();
    }
}
