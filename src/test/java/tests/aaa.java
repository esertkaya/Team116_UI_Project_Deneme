package tests;

import org.junit.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;

public class aaa {
    @Test
    public void test01(){
        //1-Open browser
        UserDashboard userDashboard = new UserDashboard();
        //2-Navigate to "qa.hausehaven.com"
        Driver.getDriver().get(ConfigReader.getProperty("hauseHeavenUrl"));
        //3-Verify that the home page is displayed successfully
        Assert.assertTrue(userDashboard.hauseHeaveHomePageTest.isDisplayed());
        //4-Click on Sign In button in the header section
        userDashboard.signIn.click();
        //5-Verify "Login" is visible
        Assert.assertTrue(userDashboard.loginVisibleTest.isDisplayed());
        //6-Enter correct email/username, password and click login
        userDashboard.nameUsername.sendKeys(ConfigReader.getProperty("hauseHeavenInvalidUsername"));
        userDashboard.password.sendKeys(ConfigReader.getProperty("hauseHeavenInvalidPassword"));
        userDashboard.login.click();
        //7-Verify the username is visible in the header section
        Assert.assertTrue(userDashboard.invalidLoginText.isDisplayed());

    }
}
