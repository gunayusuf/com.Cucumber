package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TutorialsNinjaPage {

    public TutorialsNinjaPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[text()='Phones & PDAs']")
    public WebElement phonesPdaClickButton;

    @FindBy(xpath = "//div//h4")
    public List<WebElement> brandNames;

    @FindBy(xpath = "//*[text()='Add to Cart']")
    public  List<WebElement> addOnAllElements;

    @FindBy(xpath = "//div[@class='btn-group btn-block']")
    public WebElement clickOnBlackCart;

    @FindBy(xpath = "//td[@class='text-left']")
    public List<WebElement> getListCart;

    @FindBy(xpath = "//strong//i[@class='fa fa-shopping-cart']")
    public WebElement viewCartButton;

    @FindBy(xpath = "//div//a[@class='btn btn-default']")
    public WebElement continueShoppingButton;



}
