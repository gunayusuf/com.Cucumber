package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.TutorialsNinjaPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class TutorialNinjaStepDefinitions {

    TutorialsNinjaPage tnp=new TutorialsNinjaPage();

    @Given("kullanici tutorial Ninja anasayfasinda")
    public void kullanici_tutorial_ninja_anasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("tutorialsninjaUrl"));

    }
    @Then("kullanici phone pda sekmesine gecis yapar")
    public void kullanici_phone_pda_sekmesine_gecis_yapar() {
        tnp.phonesPdaClickButton.click();

    }
    @Then("kullanici arayuzdeki tum telefonlari alısveris listesine ekler")
    public void kullanici_arayuzdeki_tum_telefonlari_alısveris_listesine_ekler() {
        for (WebElement each:tnp.addOnAllElements
             ) {
            each.click();
        }

    }
    @Then("kullanici alisveris sepetine tiklar")
    public void kullanici_alisveris_sepetine_tiklar() {
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(tnp.clickOnBlackCart).click(tnp.clickOnBlackCart).perform();

    }
    @Then("kullanici alisveris sepetine gecis yapar")
    public void kullanici_alisveris_sepetine_gecis_yapar() {
        tnp.viewCartButton.click();

    }
    @Then("kullanici alisverisine devam eder")
    public void kullanici_alisverisine_devam_eder() {
        tnp.continueShoppingButton.click();

    }


    @And("kullanici urunlerin markalarini listeler")
    public void kullaniciUrunlerinMarkalariniListeler() {
        for (WebElement each:tnp.brandNames
             ) {
            System.out.println(each.getText());
        }
    }


    @Then("kullanici alisveris sepetindeki urunleri listeler")
    public void kullaniciAlisverisSepetindekiUrunleriListeler() {
        for (WebElement each:tnp.getListCart
             ) {
            System.out.println(each.getText());
        }
    }

}
