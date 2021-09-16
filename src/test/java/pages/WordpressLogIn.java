package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WordpressLogIn {
    public WordpressLogIn(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy( id = "usernameOrEmail" )
    public WebElement emailAddress;

    @FindBy(xpath = "//*[text()='Continue']")
    public WebElement continueButton;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//*[text()='Log In']")
    public WebElement loginButton;

    @FindBy(xpath = "//header/a[3]/span[1]/img[1]")
    public  WebElement profileButton;

    @FindBy(id = "display_name")
    public WebElement displayName;

    @FindBy(tagName = "h2")
    public WebElement userName;

    @FindBy(id = "first_name")
    public WebElement firstName;

    @FindBy(id = "last_name")
    public WebElement lastName;

    @FindBy(id = "description")
    public WebElement aboutMe;

    @FindBy(xpath = "//*[text()='Save profile details']")
    public  WebElement saveButton;

    @FindBy(xpath = "//*[text()='Settings saved successfully!']")
    public  WebElement successfullySaved;

    @FindBy(xpath = "//button[@class='notice__dismiss']")
    public  WebElement closeSavedButton;

    @FindBy(xpath = "//button[@class='button is-compact']")
    public  WebElement clickAddButton;

    @FindBy(xpath = "//*[text()='Add URL']")
    public  WebElement selectAddUrl;

    @FindBy(xpath = "//input[@class='form-text-input profile-links-add-other__value']")
    public  WebElement enterUrl;

    @FindBy(xpath = "//input[@class='form-text-input profile-links-add-other__title']")
    public  WebElement enterDescription;

    @FindBy(xpath = "//*[text()='Add Site']")
    public  WebElement addSiteButton;

    @FindBy(xpath = "//*[@class='profile-link__title']")
    public  WebElement verifyUrl;

    @FindBy(xpath = "//*[@class='button profile-link__remove is-borderless']")
    public  WebElement removeUrl;

    @FindBy(xpath = "//button[contains(text(),'Log out')]")
    public  WebElement logOutButton;



}
