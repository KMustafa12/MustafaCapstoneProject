package ILOVENYPIZZA.StepDefinitions;

import ILOVENYPIZZA.Pages.MainPage;
import ILOVENYPIZZA.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MenuStepDefs {


    MainPage mainPage=new MainPage();

    @When("user should be able to see main page")
    public void user_should_be_able_to_see_main_page() {

        BrowserUtils.wait(2);
        mainPage.homeOnMainPage.click();
        Assert.assertNotNull(mainPage.homeOnMainPage);
        BrowserUtils.wait(2);
    }

    @Then("user should be able to see menu page")
    public void user_should_be_able_to_see_menu_page() {

        BrowserUtils.wait(3);
        Assert.assertNotNull(mainPage.menuOnMainPage);
        mainPage.menuOnMainPage.click();
        BrowserUtils.wait(5);
        Assert.assertTrue(mainPage.menuOnMenuPage.isDisplayed());

    }

    @Then("user should be able to see Specials")
    public void user_should_be_able_to_see_Specials() {
        Assert.assertNotNull(mainPage.specialsOnMainPage);
        mainPage.specialsOnMainPage.click();
        BrowserUtils.wait(3);
    }

    @Then("user should be able to see Loyalty Points")
    public void user_should_be_able_to_see_Loyalty_Points() {
        Assert.assertNotNull(mainPage.loyaltyOnMainPage);
        mainPage.loyaltyOnMainPage.click();
        BrowserUtils.wait(3);

    }

    @Then("user should be able to see phone number")
    public void user_should_be_able_to_see_phone_number() {

        Assert.assertTrue(mainPage.phoneNumberOnMainPage.getText().equals("Call Us Now: (770)-213-3834"));
    }

    @Then("user should be able to see advertisement text")
    public void user_should_be_able_to_see_advertisement_text() {
        Assert.assertNotNull(mainPage.advTextOnMainPage);
    }
}
