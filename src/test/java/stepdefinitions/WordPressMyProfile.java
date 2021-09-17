package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.WordpressLogIn;
import utilities.Driver;

import java.util.concurrent.TimeUnit;


public class WordPressMyProfile {

    WordpressLogIn wordpressLogIn = new WordpressLogIn();

    @Given("Go to Wordpress My Profile page")
    public void go_to_Wordpress_My_Profile_page() {
        Driver.getDriver().get("https://wordpress.com/me");
    }
    @Given("enter email address")
    public void enter_email_address() {
        wordpressLogIn.emailAddress.sendKeys("dolphinsilver275@gmail.com");

    }
    @Given("click continue button")
    public void click_continue_button() {
        wordpressLogIn.continueButton.click();

    }
    @Given("enter password")
    public void enter_password() {
        wordpressLogIn.password.sendKeys("251175Yg@");

    }
    @Given("click log in button")
    public void click_log_in_button() {
        wordpressLogIn.loginButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    @Given("click profile button")
    public void click_profile_button() {
        wordpressLogIn.profileButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    @Then("verify that you are in My Profile page")
    public void verify_that_you_are_in_My_Profile_page() {

        String strUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(strUrl,"https://wordpress.com/me");

    }
    @Then("verify that your display name is the same as your username")
    public void verify_that_your_display_name_is_the_same_as_your_username() {
        String displayname =wordpressLogIn.displayName.getAttribute("value");
        String username=wordpressLogIn.userName.getText();

        Assert.assertEquals(displayname,username);

    }
    @Then("complete your profile with your name,surname and about me")
    public void complete_your_profile_with_your_name_surname_and_about_me() {
        wordpressLogIn.firstName.sendKeys("Yunus");
        wordpressLogIn.lastName.sendKeys("Gumus");
        wordpressLogIn.aboutMe.sendKeys("Software Tester");

    }
    @Then("click save button")
    public void click_save_button() {
        wordpressLogIn.saveButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @Then("verify that is successfully saved")
    public void verify_that_is_successfully_saved() {
        String successfullySaved = wordpressLogIn.successfullySaved.getText();
        Assert.assertEquals(successfullySaved,"Settings saved successfully!");
        wordpressLogIn.closeSavedButton.click();

    }
    @Then("click Add button to add an URL for the profile link")
    public void click_Add_button_to_add_an_URL_for_the_profile_link() {
        wordpressLogIn.removeUrl.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wordpressLogIn.clickAddButton.click();
        wordpressLogIn.selectAddUrl.click();


    }
    @Then("enter URL and description")
    public void enter_URL_and_description() {

        wordpressLogIn.enterUrl.sendKeys("https://www.aweber.com/");
        wordpressLogIn.enterDescription.sendKeys("AWeber");

    }
    @Then("click Add Site button")
    public void click_Add_Site_button() {
        wordpressLogIn.addSiteButton.click();


    }
    @Then("verify that is successfully added")
    public void verify_that_is_successfully_added() {
        String verifyUrl = wordpressLogIn.verifyUrl.getText();


    }
    @Then("click log out button")
    public void click_log_out_button() {
        wordpressLogIn.firstName.clear();
        wordpressLogIn.lastName.clear();
        wordpressLogIn.aboutMe.clear();
        wordpressLogIn.saveButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wordpressLogIn.logOutButton.click();
        Driver.getDriver().quit();

    }

}





