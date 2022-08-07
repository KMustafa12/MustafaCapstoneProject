package ILOVENYPIZZA.StepDefinitions;


import ILOVENYPIZZA.Pages.MainPage;
import ILOVENYPIZZA.Utilities.BrowserUtils;
import ILOVENYPIZZA.Utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SocialMediaStepDefs {

   MainPage mainPage= new MainPage();



    @Then("user should be able to jump into Instagram Page")
    public void user_should_be_able_to_jump_into_Instagram_Page() {
        Assert.assertNotNull(mainPage.instagramOnMainPage);
        mainPage.instagramOnMainPage.click();
        BrowserUtils.wait(4);
        String InstagramTitle=Driver.get().getTitle();
        Assert.assertTrue(InstagramTitle.equals("I Love NY Pizza & Wings | Food and Beverage"));
    }










}
