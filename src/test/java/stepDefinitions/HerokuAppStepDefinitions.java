package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuAppPage;
import utilities.Driver;

import java.time.Duration;

public class HerokuAppStepDefinitions {

    HerokuAppPage herokuAppPage=new HerokuAppPage();

    @Given("add element butonuna basar")
    public void add_element_butonuna_basar() {
        herokuAppPage.addElementButton.click();
    }
    @Then("Delete butonunu gorunur oluncaya kadar bekler")
    public void delete_butonunu_gorunur_oluncaya_kadar_bekler() {

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@onclick='deleteElement()']")));

    }
    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {

        Assert.assertTrue(herokuAppPage.deleteButtonClick.isDisplayed());

    }
    @Then("Delete butonuna basar")
    public void delete_butonuna_basar() {
        herokuAppPage.deleteButtonClick.click();

    }
    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {
       Assert.assertTrue(herokuAppPage.deleteListesi.isEmpty());
    }

}
