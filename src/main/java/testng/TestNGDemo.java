package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDemo {

    @Test
    public void createNewUserTest(){
        User firsUser = new User("John",30);
        Assert.assertNotNull(firstUser);
    }
    @Test(dependsOnMethods = "createNewUserTest")
    public void loginTest(){
        Assert.assertTrue(true);
    }
    @DataProvider
    public static Object[][]numbers(){
        return new Object[][]{
                {"j"},
                {0,10,10},
                {-10,20,10}
        };
    }
    @Test(dataProvider = "inputValues")
       public void testLoginFun(String username,String password){
        System.out.println(username + "" + password);
    }
}
