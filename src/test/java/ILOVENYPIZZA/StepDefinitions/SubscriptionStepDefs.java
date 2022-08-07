package ILOVENYPIZZA.StepDefinitions;


import ILOVENYPIZZA.Pages.MainPage;
import ILOVENYPIZZA.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SubscriptionStepDefs {

   MainPage mainPage= new MainPage();



    @Then("user should be able to send email address")
    public void user_should_be_able_to_send_email_address() {

        Assert.assertNotNull(mainPage.subscriptionOnMainPage);
        mainPage.subscriptionOnMainPage.sendKeys("sdet.mustafa@gmail.com");
        BrowserUtils.wait(1);
//        mainPage.subscribeButtonOnMainPage.click();
//        System.out.println(mainPage.emailApproveMessageOnOrderPage.getText());
//        BrowserUtils.wait(3);
    }

    @Then("user should be able to verify email address")
    public void user_should_be_able_to_verify_email_address() {
        Assert.assertNotNull(mainPage.subscribeButtonOnMainPage);
        mainPage.subscribeButtonOnMainPage.click();
        BrowserUtils.wait(2);
        Assert.assertNotNull(mainPage.emailApproveMessageOnOrderPage);
        BrowserUtils.wait(2);
    }

    @Then("user should be able to send invalid email address")
    public void user_should_be_able_to_send_invalid_email_address() {

        Assert.assertNotNull(mainPage.subscriptionOnMainPage);
        mainPage.subscriptionOnMainPage.sendKeys("123456789");
        BrowserUtils.wait(2);
        mainPage.subscribeButtonOnMainPage.click();
        BrowserUtils.wait(3);
    }

    @Then("user should be able to see error message")
    public void user_should_be_able_to_see_error_message() {

       Assert.assertNotNull(mainPage.emailErrorMessageOnOrderPage);
    }







}
