package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerokuAppPage {

    public HerokuAppPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//button[text()='Add Element']")
    public WebElement addElementButton;


    @FindBy(xpath = "//button[text()='Delete']")
    public WebElement deleteButtonClick;

    @FindBy(xpath = "//button[@class='added-manually']")
    public List<WebElement> deleteListesi;
}
