package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPage=new AmazonPage();

    @Given("kullanici amazon anasayfasinda")
    public void kullanici_amazon_anasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @Then("kullanici Nutella icin arama yapar")
    public void kullanici_nutella_icin_arama_yapar() {
    amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

    }
    @Then("sonuclarin Nutella icerdigini test eder")
    public void sonuclarin_nutella_icerdigini_test_eder() {

        String arananKelime="Nutella";
        String actualAramaSonucStr=amazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {

        Driver.closeDriver();

    }

    @Then("kullanici Java icin arama yapar")
    public void kullanici_java_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Java" + Keys.ENTER);

    }
    @Then("sonuclarin Java icerdigini test eder")
    public void sonuclarin_java_icerdigini_test_eder() {
        String arananKelime="Java";
        String actualAramaSonucStr=amazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));

    }
    @When("kullanici iphone icin arama yapar")
    public void kullanici_iphone_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("iphone" + Keys.ENTER);

    }

    @Then("sonuclarin iphone icerdigini test eder")
    public void sonuclarin_iphone_icerdigini_test_eder() {
        String arananKelime="iphone";
        String actualAramaSonucStr=amazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));

    }

    @Given("kullanici {string} icin arama yapar")
    public void kullanici_icin_arama_yapar(String istenenKelime) {
        amazonPage.aramaKutusu.sendKeys(istenenKelime+Keys.ENTER);

    }

    @Then("sonuclarin {string} icerdigini test eder")
    public void sonuclarin_icerdigini_test_eder(String istenenKelime) {
    String arananKelime=istenenKelime;
    String actualSonucStr=amazonPage.aramaSonucElementi.getText();

    Assert.assertTrue(actualSonucStr.contains(arananKelime));

    }


    @Given("kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String istenenUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));

    }

    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBakler(int istenenSaniye) {

        try {
            Thread.sleep(istenenSaniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @And("urlin {string} icerdigini test eder")
    public void urlinIcerdiginTestEder(String istenenKelime) {

        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenKelime));

    }
}
