package first.com.restapi;


import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public void Test1(){
        Response baba = get("https://reqres.in/api/users?page=2");
        System.out.println("Status code"+ baba.getStatusCode());
        System.out.println("Header"+baba.getHeader("content-type"));
        System.out.println("Time taken"+ baba.getTime());
        System.out.println("Body"+baba.getBody());
        int statusCode=baba.statusCode();
        Assert.assertEquals(statusCode,200);



    }
    @Test
    void secondTest(){
        given().
                get("https://reqres.in/api/users?page=2").
                then().
                statusCode(200);


    }
}
