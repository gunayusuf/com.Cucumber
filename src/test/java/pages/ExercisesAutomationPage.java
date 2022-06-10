package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ExercisesAutomationPage {

    public ExercisesAutomationPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//html")
    public WebElement homePageVisibilty;

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement homePageSingupLogin;

    @FindBy(xpath = "//h2[text()='New User Signup!']")
    public WebElement newUserSignUpVisibility;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement newUserNameBox;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement newUserEmailBox;

    @FindBy(xpath = "(//button[@class='btn btn-default'])[2]")
    public WebElement newUserSignUpButton;

    @FindBy(xpath = "//b[text()='Enter Account Information']")
    public WebElement enterAccountInformationVisibility;

    @FindBy(xpath = "(//input[@type='radio'])[1]")
    public WebElement titleRadioButton;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameBox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//select[@id='days']")
    public WebElement dropdownDays;

    @FindBy(xpath = "//select[@id='months']")
    public WebElement dropdownMonths;

    @FindBy(xpath = "//select[@id='years']")
    public WebElement dropdownYears;

    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement acceptNewsletterBox;

    @FindBy(xpath = "//input[@id='optin']")
    public WebElement acceptOffers;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='company']")
    public WebElement company;


    @FindBy(xpath = "//input[@id='address1']")
    public WebElement adress1;


    @FindBy(xpath = "//input[@id='address2']")
    public WebElement adress2;

    @FindBy(xpath = "//select[@id='country']")
    public WebElement dropdownCountry;

    @FindBy(xpath = "//input[@id='state']")
    public WebElement state;


    @FindBy(xpath = "//input[@id='city']")
    public WebElement city;


    @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement zipcode;



    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement mobileNumber;


    @FindBy(xpath = "(//button[@class='btn btn-default'])[1]")
    public WebElement createAccountButton;

    @FindBy(xpath = "//b[text()='Account Created!']")
    public WebElement accountCreatedVisibility;


    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement continueButton;

    @FindBy(xpath = "//a[text()=' Logged in as ']")
    public WebElement userNameVisibility;

    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement logoutButton;

    @FindBy(xpath = "//h2[text()='Login to your account']")
    public WebElement logintoYourAccountVisibility;

    @FindBy(xpath = "(//input[@placeholder='Email Address'])[1]")
    public WebElement loginEmailAddressBox;

    @FindBy(xpath = "(//input[@placeholder='Password'])[1]")
    public WebElement loginPasswordBox;

    @FindBy(xpath = "(//button[@class='btn btn-default'])[1]")
    public WebElement loginAccountLoginButton;

    @FindBy(xpath = "//a[@href='/delete_account']")
    public WebElement deleteAccountButton;

    @FindBy(xpath = "//button[@class='btn btn-danger']")
    public WebElement deleteAccountButton2;

    @FindBy(xpath = "//h1[text()='Delete Account']")
    public WebElement deleteAccountVisibility;

}
