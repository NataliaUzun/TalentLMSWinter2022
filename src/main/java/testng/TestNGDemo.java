package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDemo {

    @Test
    public void createNewUserTest(){
        User firsUser = null;
        Assert.assertNotNull(firstUser);
    }
    @Test(dependsOnMethods = "createNewTest")
    public void loginTest(){
        Assert.assertTrue(true);
    }
    @DataProvider
    public static Object[][]numbers(){
        return new Object[][]{
                {"john@gmail.com","ValidPass"},
                {"johngmail.com","ValidPass"},
                {"john@gmail.com","InvalidPass"}
        };
    }
    @Test(dataProvider = "inputValues")
       public void testLoginFun(String username,String password){
        System.out.println(username + " " + password);
    }
}
