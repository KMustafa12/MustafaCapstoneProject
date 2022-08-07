package ILOVENYPIZZA.StepDefinitions;


import ILOVENYPIZZA.Pages.MainPage;
import ILOVENYPIZZA.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ContactStepDefs {

   MainPage mainPage= new MainPage();



    @Then("user should be able to fill out Contact Information")
    public void user_should_be_able_to_fill_out_Contact_Information() {
        mainPage.contactLinkOnMainPage.click();
        BrowserUtils.wait(3);

        Assert.assertNotNull(mainPage.nameOnContact);
        Assert.assertNotNull(mainPage.emailOnContact);
        Assert.assertNotNull(mainPage.phoneOnContact);
        Assert.assertNotNull(mainPage.messageOnContact);
        mainPage.nameOnContact.sendKeys("Mustafa");
        BrowserUtils.wait(2);
        mainPage.emailOnContact.sendKeys("sdet.mustafa@gmail.com");
        BrowserUtils.wait(2);
        mainPage.phoneOnContact.sendKeys("9192229922");
        BrowserUtils.wait(2);
        mainPage.messageOnContact.sendKeys("Hello World");
        BrowserUtils.wait(4);


    }









}
