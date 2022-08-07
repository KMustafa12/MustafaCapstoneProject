package ILOVENYPIZZA.APITests;

import ILOVENYPIZZA.Utilities.APIRequests;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APITests {

    APIRequests apiRequests=new APIRequests();

    @Test
    public void getStatusCode(){
        String URL= "https://ilovenyphickoryflat.com/";
//
//        RestAssured.baseURI=URL;
        Response resp= RestAssured.get(URL);   // to get the URL
        int code=resp.getStatusCode();  // status shown on the postman

        Assert.assertTrue(code==200);

        System.out.println("Response time: "+resp.getTime());
  //      System.out.println(resp.headers());
        System.out.println(resp.prettyPrint());
//        System.out.println(resp.prettyPrint());
//        System.out.println(resp.cookies());


//        Response response=apiRequests.GETRequest();
//        System.out.println(response.prettyPrint());



    }

}
