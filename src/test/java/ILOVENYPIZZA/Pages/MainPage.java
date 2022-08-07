package ILOVENYPIZZA.Pages;

import ILOVENYPIZZA.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage{

    @FindBy(xpath = "//a[contains(text(),'Menu')][1]")
    public WebElement menuOnMainPage;

    @FindBy(xpath = "//a[contains(text(),'Specials')][1]")
    public WebElement specialsOnMainPage;

    @FindBy(xpath = "//a[contains(text(),'Loyalty')][1]")
    public WebElement loyaltyOnMainPage;

    @FindBy(xpath = "//*[contains(text(),'Call Us Now')][1]")
    public WebElement phoneNumberOnMainPage;

    @FindBy(xpath = "//*[contains(text(),'WE TOSS')]")
    public WebElement advTextOnMainPage;
//
    @FindBy(xpath = "//a[contains(text(),'Home')][1]")
    public WebElement homeOnMainPage;

    @FindBy(xpath = "//div[@class='wrapper image-wrapper spw-image-container']")
    public WebElement menuOnMenuPage;

    @FindBy(id = "fca60cdf-f709-4cf5-923a-8ee5ef9f9987")
    public WebElement usernameInput;

    @FindBy(id = "3d20b1e6-cdb1-44f9-8344-5533735084c7")
    public WebElement passwordInput;

    @FindBy(id = "3c8f8aec-1300-49f4-8a81-eb7849b6df12")
    public WebElement signInButton;

    @FindBy(xpath = "//div[@class='profile-body ng-star-inserted']//div[@class='active ng-star-inserted']")
    public WebElement tuesdayCooper;


    @FindBy(xpath = "//a[contains(text(),'Order Now!')][1]")
    public WebElement orderOnMainPage;

    @FindBy(xpath = "//*[contains(text(),'Accept')]")
    public WebElement acceptCookiesOnOrderPage;

    @FindBy(xpath = "(//*[@data-testid='login-button'])")
    public WebElement signInOnOrderPage;

    @FindBy(xpath = "(//*[@data-testid='create-an-account-button'])")
    public WebElement createAnAccountOnOrderPage;

    @FindBy(xpath = "(//*[@data-testid='first-name-input'])")
    public WebElement firstNameOnAccountOnOrderPage;

    @FindBy(xpath = "(//*[@data-testid='last-name-input'])")
    public WebElement lastNameOnAccountOnOrderPage;

    @FindBy(xpath = "(//*[@data-testid='email-input'])")
    public WebElement emailOnAccountOnOrderPage;

    @FindBy(xpath = "(//*[@data-testid='phone-input'])")
    public WebElement phoneOnAccountOnOrderPage;

    @FindBy(xpath = "(//*[@data-testid='signup-password-input'])")
    public WebElement passwordOnAccountOnOrderPage;

    @FindBy(xpath = "(//*[@data-testid='confirm-password-input'])")
    public WebElement confirmPasswordOnAccountOnOrderPage;
    // (//*[@data-testid='item-details-save-button'])

    @FindBy(xpath = "(//*[@data-testid='close-modal'])")
    public WebElement closeOnAccountOnOrderPage;



    @FindBy(xpath = "//*[@name='Email']")
    public WebElement subscriptionOnMainPage;

    @FindBy(xpath = "//*[contains(text(),'Subscribe')]")
    public WebElement subscribeButtonOnMainPage;

    @FindBy(xpath = "//*[@data-icon='instagram'][1]")
    public WebElement instagramOnMainPage;

    @FindBy(xpath = "(//*[contains(text(),'Contact')])[1]")
    public WebElement contactLinkOnMainPage;

    @FindBy(xpath = "//*[@name='name']")
    public WebElement nameOnContact;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement emailOnContact;

    @FindBy(xpath = "//*[@name='phone']")
    public WebElement phoneOnContact;

    @FindBy(xpath = "//*[@name='message']")
    public WebElement messageOnContact;
//

    @FindBy(xpath = "(//*[@data-testid='menu-item-group-dropdown-button'])")
    public WebElement menuBarOnOrderPage;

    @FindBy(xpath = "(//*[contains(text(),'Gyros')])[4]")
    public WebElement gyrosOnMenuBarOnOrderPage;

    @FindBy(xpath = "(//*[contains(text(),'Lamb Gyro')])[1]")
    public WebElement lambGyroOnMenuBarOnOrderPage;

    @FindBy(xpath = "(//*[contains(text(),'Chicken Wings')])[4]")
    public WebElement wingsOnMenuBarOnOrderPage;
    //
    @FindBy(xpath = "(//*[contains(text(),'Lunch Specials')])[4]")
    public WebElement lunchSpecialsOnMenuBarOnOrderPage;

    @FindBy(xpath = "(//*[@data-testid='menu-item-card'])[30]")
    public WebElement fiftyWingsOnMenuBarOnOrderPage;

    @FindBy(xpath = "(//*[@data-testid='choice-list-modifier-checkbox'])[2]")
    public WebElement hotBuffaloForWingsOnMenuBarOnOrderPage;

    @FindBy(xpath = "(//*[@data-testid='choice-list-modifier-checkbox'])[7]")
    public WebElement blueCheeseForWingsOnMenuBarOnOrderPage;

    @FindBy(xpath = "//*[contains(text(),'Friday Special')]")
    public WebElement fridaySpecialOnOrderPage;

    // (
    @FindBy(xpath = "(//*[@data-testid='subitem-radio-button'])[2]")
    public WebElement lambGyroOnSpecialOnOrderPage;

    @FindBy(xpath = "(//*[@data-testid='your-bag-button'])[1]")
    public WebElement yourBagOnOrderPage;
// (//*[@id='ccexp'])[1]

    @FindBy(xpath = "(//*[@data-testid='remove-item-button'])[3]")
    public WebElement removeItemOnOrderPage;

    @FindBy(xpath = "(//*[contains(text(),'Continue to ')])[1]")
    public WebElement continueCheckoutOnOrderPage;

    @FindBy(xpath = "(//*[@data-testid='item-details-save-button'])")
    public WebElement addToBagOnOrderPage;

    @FindBy(xpath = "//*[@name='ccnumber']")
    public WebElement creditCardNumberOnOrderPage;

    @FindBy(xpath = "//*[@id='ccexp']")
    public WebElement expDateOnOrderPage;

    @FindBy(xpath = "//*[@id='cvv']")
    public WebElement cvvOnOrderPage;

    @FindBy(xpath = "//*[@id='field-6040']")
    public WebElement zipCodeOnOrderPage;

    @FindBy(xpath = "//*[@id='recaptcha-anchor']")
    public WebElement iAmNotRobotOnContact;

//  //*[contains(text(),'Friday Special')]

    @FindBy(xpath = "(//*[contains(text(),'Please enter')])[1]")
    public WebElement emailErrorMessageOnOrderPage;

    @FindBy(xpath = "//*[@class='ly-confirmation-message success-action hidden']")
    public WebElement emailApproveMessageOnOrderPage;

    @FindBy(xpath = "(//*[contains(text(),'Please enter')])[1]")
    public WebElement creditCardErrorMessageOnOrderPage;

    @FindBy(xpath = "//*[@data-testid='continue-to-review-button']")
    public WebElement continueCreditCardCheckOnOrderPage;

    public MainPage() {
        //it's mandatory if you want to use @FindBy annotation
        //this means LoginPage class
        //Driver.get() return webdriver object
        PageFactory.initElements(Driver.get(), this);
    }


    /**
     * reusable login method
     * just call this method to login
     * provide username and password as parameters
     *
     * @param username
      @param password
     */




}
