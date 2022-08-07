package ILOVENYPIZZA.StepDefinitions;

import ILOVENYPIZZA.Pages.MainPage;
import ILOVENYPIZZA.Utilities.BrowserUtils;
import ILOVENYPIZZA.Utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.ArrayList;

public class OrderPageStepDefs {


    MainPage mainPage=new MainPage();
    @Then("user should be able to click Order now")
    public void user_should_be_able_to_click_Order_now() {

        mainPage.orderOnMainPage.click();
        BrowserUtils.wait(2);
    }



    @Then("user should be able to jump into Order Page")
    public void user_should_be_able_to_jump_into_Order_Page() {
        BrowserUtils.wait(3);
        ArrayList<String> tabs= new ArrayList<>(Driver.get().getWindowHandles());
        Driver.get().switchTo().window(tabs.get(1));
        mainPage.acceptCookiesOnOrderPage.click();
        BrowserUtils.wait(2);
    }

    @Then("user should be able to see create an account page")
    public void user_should_be_able_to_see_create_an_account_page() {

        mainPage.signInOnOrderPage.click();
        BrowserUtils.wait(5);
        mainPage.createAnAccountOnOrderPage.click();
        BrowserUtils.wait(2);
        Assert.assertNotNull(mainPage.firstNameOnAccountOnOrderPage);
        Assert.assertNotNull(mainPage.lastNameOnAccountOnOrderPage);
        Assert.assertNotNull(mainPage.emailOnAccountOnOrderPage);
        Assert.assertNotNull(mainPage.phoneOnAccountOnOrderPage);
        mainPage.firstNameOnAccountOnOrderPage.sendKeys("Mustafa");
        mainPage.lastNameOnAccountOnOrderPage.sendKeys("North");
        mainPage.emailOnAccountOnOrderPage.sendKeys("mustafa@gmail.com");
        mainPage.phoneOnAccountOnOrderPage.sendKeys("123456789");
        BrowserUtils.wait(5);
        mainPage.passwordOnAccountOnOrderPage.sendKeys("NorthAmerican");
        mainPage.confirmPasswordOnAccountOnOrderPage.sendKeys("NorthAmerican");
        BrowserUtils.wait(2);
    }

    @Then("user should be able to continue without open an account")
    public void user_should_be_able_to_continue_without_open_an_account() {
        mainPage.closeOnAccountOnOrderPage.click();
        BrowserUtils.wait(3);
    }

    @Then("user should be able to see and choice users order")
    public void user_should_be_able_to_see_and_choice_users_order() {
        Assert.assertNotNull(mainPage.menuBarOnOrderPage);
        Assert.assertNotNull(mainPage.lambGyroOnMenuBarOnOrderPage);
        Assert.assertNotNull(mainPage.fiftyWingsOnMenuBarOnOrderPage);
        mainPage.menuBarOnOrderPage.click();
        BrowserUtils.wait(2);
        mainPage.gyrosOnMenuBarOnOrderPage.click();
        BrowserUtils.wait(3);
        mainPage.lambGyroOnMenuBarOnOrderPage.click();
        BrowserUtils.wait(5);
        mainPage.addToBagOnOrderPage.click();
        BrowserUtils.wait(5);
        mainPage.menuBarOnOrderPage.click();
        BrowserUtils.wait(2);
        mainPage.wingsOnMenuBarOnOrderPage.click();
        BrowserUtils.wait(2);
        mainPage.fiftyWingsOnMenuBarOnOrderPage.click();
        BrowserUtils.wait(2);
        mainPage.hotBuffaloForWingsOnMenuBarOnOrderPage.click();
        BrowserUtils.wait(2);
        mainPage.blueCheeseForWingsOnMenuBarOnOrderPage.click();
        BrowserUtils.wait(2);
        mainPage.addToBagOnOrderPage.click();
        BrowserUtils.wait(2);
        mainPage.menuBarOnOrderPage.click();
        BrowserUtils.wait(2);
        mainPage.lunchSpecialsOnMenuBarOnOrderPage.click();
        BrowserUtils.wait(2);
        mainPage.fridaySpecialOnOrderPage.click();
        BrowserUtils.wait(2);
        mainPage.lambGyroOnSpecialOnOrderPage.click();
        BrowserUtils.wait(2);
        mainPage.addToBagOnOrderPage.click();
        BrowserUtils.wait(7);
        mainPage.removeItemOnOrderPage.click();
        BrowserUtils.wait(5);


    }

    @Then("user should be able to adding bag and checking out")
    public void user_should_be_able_to_adding_bag_and_checking_out() {


        Assert.assertNotNull(mainPage.continueCheckoutOnOrderPage);
        mainPage.continueCheckoutOnOrderPage.click();
        BrowserUtils.wait(15);
    }

    @Then("user should be able to see credit card page and verify without entering credit card number")
    public void user_should_be_able_to_see_credit_card_page_and_verify_without_entering_credit_card_number() {
        mainPage.continueCreditCardCheckOnOrderPage.click();
        BrowserUtils.wait(3);
        Assert.assertTrue(mainPage.creditCardErrorMessageOnOrderPage.getText().equals("Please enter your ZIP code"));
    }

}
