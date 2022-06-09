package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    /*
    Cucumber'da step definitions package'i icerisinde
     @before, @after gibi bir notasyon varsa
    extends testBase dememize gerek kalmadan
    her scenerio'dan once ve/veya sonra bu method'lar calisacaktir

    Bu da bizim isteyecegimiz bir durum degildir

    Cucumber'da @before, @after kullanma ihtiyacimiz olursa
    bunu stepDefinitions package'i altinda olusturacagimiz
    Hooks class'ina koyariz

    Biz her scenerio'dan sonra test sonucunu kontrol edip
    failed olan scenerio'lar icin
    screenshot almasi amaciyla
    @After method'u kullanacagiz

     */

    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
        Driver.closeDriver();
    }


}
