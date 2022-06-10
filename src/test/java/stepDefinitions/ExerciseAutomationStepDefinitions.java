package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.ExercisesAutomationPage;
import utilities.ConfigReader;


public class ExerciseAutomationStepDefinitions {

    ExercisesAutomationPage exercise=new ExercisesAutomationPage();
    Faker faker=new Faker();


    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertTrue(exercise.homePageVisibilty.isDisplayed());
    }
    @Then("Click on Signup and Login button")
    public void click_on_signup_and_login_button() {
        exercise.homePageSingupLogin.click();

    }
    @Then("Verify New User Signup is visible")
    public void verify_new_user_signup_is_visible() {
        Assert.assertTrue(exercise.newUserSignUpVisibility.isDisplayed());

    }
    @Then("Enter name and email address")
    public void enter_name_and_email_address() {
        exercise.newUserNameBox.sendKeys(ConfigReader.getProperty("wrongUsername"));
        exercise.newUserEmailBox.sendKeys(ConfigReader.getProperty("wrongEmail"));
    }
    @Then("Click Signup button")
    public void click_signup_button() {
        exercise.newUserSignUpButton.click();
    }
    @Then("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verify_that_enter_account_information_is_visible() {

        Assert.assertTrue(exercise.enterAccountInformationVisibility.isDisplayed());

    }
    @Then("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {
        exercise.titleRadioButton.click();


        exercise.nameBox.sendKeys(faker.name().firstName());
        exercise.password.sendKeys(faker.internet().password());
        exercise.dropdownDays.sendKeys("21");
        exercise.dropdownMonths.sendKeys("September");
        exercise.dropdownYears.sendKeys("2000");


    }
    @Then("Select checkbox Sign up for our newsletter")
    public void select_checkbox_sign_up_for_our_newsletter() {

        exercise.acceptNewsletterBox.click();

    }
    @Then("Select checkbox Receive special offers from our partners")
    public void select_checkbox_receive_special_offers_from_our_partners() {
        exercise.acceptOffers.click();

    }
    @Then("Fill details: First name, Last name, Company, Address, Address, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address_country_state_city_zipcode_mobile_number() {
        exercise.firstName.sendKeys(faker.name().firstName());
        exercise.lastName.sendKeys(faker.name().lastName());
        exercise.company.sendKeys(faker.company().name());
        exercise.adress1.sendKeys(faker.address().fullAddress());
        exercise.adress2.sendKeys(faker.address().fullAddress());
        exercise.dropdownCountry.sendKeys("United States");
        exercise.state.sendKeys(faker.address().city());
        exercise.city.sendKeys(faker.address().city());
        exercise.zipcode.sendKeys(faker.address().zipCode());
        exercise.mobileNumber.sendKeys(faker.phoneNumber().phoneNumber());

    }
    @Then("Click Create Account button")
    public void click_create_account_button() {

        exercise.createAccountButton.click();

    }
    @Then("Verify that ACCOUNT CREATED is visible")
    public void verify_that_account_created_is_visible() {

        Assert.assertTrue(exercise.accountCreatedVisibility.isDisplayed());

    }
    @Then("Click Continue button")
    public void click_continue_button() {

        exercise.continueButton.click();

    }
    @Then("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {

        Assert.assertTrue(exercise.userNameVisibility.isDisplayed());

    }
    @Then("Click Logout button")
    public void click_logout_button() {

        exercise.logoutButton.click();

    }

    @Then("Verify Login to your account is visible")
    public void verify_login_to_your_account_is_visible() {
        Assert.assertTrue(exercise.logintoYourAccountVisibility.isDisplayed());
    }
    @Then("Enter correct email address and password")
    public void enter_correct_email_address_and_password() {
        exercise.loginEmailAddressBox.sendKeys(ConfigReader.getProperty("trueEmail"));
        exercise.loginPasswordBox.sendKeys(ConfigReader.getProperty("truePassword"));

    }
    @Then("Click login button")
    public void click_login_button() {

        exercise.loginAccountLoginButton.click();

    }
    @Then("Click Delete Account button")
    public void click_delete_account_button() {

        exercise.deleteAccountButton.click();

    }
    @Then("Verify that DELETE ACCOUNT is visible")
    public void verify_that_delete_account_is_visible() {

        exercise.deleteAccountButton2.click();

        Assert.assertTrue(exercise.deleteAccountVisibility.isDisplayed());

    }



}
