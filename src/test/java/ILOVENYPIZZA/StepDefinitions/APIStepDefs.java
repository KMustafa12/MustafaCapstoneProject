package ILOVENYPIZZA.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

public class APIStepDefs {

    String URL= "https://ilovenyphickoryflat.com/";
    String URLOrder="https://order.spoton.com/so-i-love-ny-pizza-and-wings-4667/canton-ga/60ca97319adef3ff8b4a1327";
    @Given("user given api url")
    public void user_given_api_url() {

//
//        RestAssured.baseURI=URL;
        Response resp= RestAssured.get(URL);   // to get the URL
    }

    @Then("user should be validate status code")
    public void user_should_be_validate_status_code() {
        Response resp= RestAssured.get(URL);   // to get the URL
        int code=resp.getStatusCode();  // status shown on the postman


        Assert.assertTrue(code==200);

      //  System.out.println("Response time: "+resp.getTime());
        //      System.out.println(resp.headers());
//        System.out.println(resp.prettyPrint());
//        System.out.println(resp.prettyPrint());
//        System.out.println(resp.cookies());

    }

    @Given("user given api order page url")
    public void user_given_api_order_page_url() {

        Response res1=RestAssured.get(URLOrder);
    }

    @Then("user should be validate status code of Order Page")
    public void user_should_be_validate_status_code_of_Order_Page() {
        Response res1= RestAssured.get(URLOrder);   // to get the URL
        int code1=res1.getStatusCode();  // status shown on the postman
     //   System.out.println(code1);
        Assert.assertTrue(code1==503);
    }


    @Given("user given api menu page url")
    public void user_given_api_menu_page_url() {
       Response resmenu=RestAssured.get(URL+"menu/");
//       int code2=resmenu.getStatusCode();
//        System.out.println(code2);
    }

    @Then("user should be validate status code of Menu Page")
    public void user_should_be_validate_status_code_of_Menu_Page() {

        Response resmenu=RestAssured.get(URL+"menu/");
        int code4=resmenu.getStatusCode();
//        System.out.println(code4);
        Assert.assertTrue(code4==200);
    }

    @Given("user given api specials page url")
    public void user_given_api_specials_page_url() {
        Response resSpecials=RestAssured.get(URL+"specials/");
//        int code3=resSpecials.getStatusCode();
//        System.out.println(code3);
    }

    @Then("user should be validate status code of Specials Page")
    public void user_should_be_validate_status_code_of_Specials_Page() {
        Response resSpecials=RestAssured.get(URL+"specials/");
        int code3=resSpecials.getStatusCode();
//        System.out.println(code3);
        Assert.assertTrue(code3==200);
    }

    @Given("user given api loyalty page url")
    public void user_given_api_loyalty_page_url() {
        Response resLoyalty=RestAssured.get(URL+"loyalty/");
//        int code4=resLoyalty.getStatusCode();
//        System.out.println(code4);
    }

    @Then("user should be validate status code of Loyalty Page")
    public void user_should_be_validate_status_code_of_Loyalty_Page() {
        Response resLoyalty=RestAssured.get(URL+"loyalty/");
        int code4=resLoyalty.getStatusCode();
//        System.out.println(code4);
        Assert.assertTrue(code4==200);

    }

    @Given("user given api contact page url")
    public void user_given_api_contact_page_url() {
        Response resContact=RestAssured.get(URL+"contact/");
//        int code5=resContact.getStatusCode();
//        System.out.println(code5);
    }

    @Then("user should be validate status code of Contact Page")
    public void user_should_be_validate_status_code_of_Contact_Page() {

        Response resContact=RestAssured.get(URL+"contact/");
      int code5=resContact.getStatusCode();
//        System.out.println(code5);
        Assert.assertTrue(code5==200);

    }


}
