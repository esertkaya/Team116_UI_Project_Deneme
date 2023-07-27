package tests;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.xml.namespace.QName;

public class ornek1 {
    @Test

    public void test01() {

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
        userDashboard.nameUsername.sendKeys(ConfigReader.getProperty("hauseHeavenemail"));
        userDashboard.password.sendKeys(ConfigReader.getProperty("hauseHeavenpassword"));
        userDashboard.login.click();
        //7-Verify the username is visible in the header section
        Assert.assertTrue(userDashboard.userNameVisibleTest.isDisplayed());

    }


    @Test
    public void test02() {
        UserDashboard userDashboard = new UserDashboard();
        //7-Click on Projects
        userDashboard.clickOnProjects.click();
        //8-Verify Projects page is enabled
        String expectedTitle = "All Projects";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertNotEquals(expectedTitle, actualTitle);
        //9-Verify the number of project announcements and the projects are displayed
        Assert.assertTrue(userDashboard.numberOfProjectsVisibleTest.isDisplayed());
        Assert.assertTrue(userDashboard.allProjectsList.isDisplayed());
    }

    @Test
    public void test03() {
        UserDashboard userDashboard = new UserDashboard();
        //1-Click on Projects
        userDashboard.clickOnProjects.click();
        //2-Verify Projects page is enabled
        String expectedTitle = "All Projects";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertNotEquals(expectedTitle, actualTitle);
        //3-Verify the number of project announcements and the projects are displayed
        Assert.assertTrue(userDashboard.numberOfProjectsVisibleTest.isDisplayed());
        Assert.assertTrue(userDashboard.allProjectsList.isDisplayed());
        //4-Verify the details of the projects are visible
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        userDashboard.firstProject.click();
        Assert.assertTrue(userDashboard.firstProjectDetails.isDisplayed());
        userDashboard.allowCookies.click();
        actions.sendKeys(Keys.PAGE_UP).perform();
        userDashboard.clickOnProjects.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        userDashboard.secondProject.click();
        Assert.assertTrue(userDashboard.secondProjectDetails.isDisplayed());
        actions.sendKeys(Keys.PAGE_UP).perform();
        userDashboard.clickOnProjects.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        userDashboard.thirdProject.click();
        Assert.assertTrue(userDashboard.thirdProjectDetails.isDisplayed());
        actions.sendKeys(Keys.PAGE_UP).perform();
        userDashboard.clickOnProjects.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        userDashboard.fourthProject.click();
        Assert.assertTrue(userDashboard.fourthProjectDetails.isDisplayed());
        actions.sendKeys(Keys.PAGE_UP).perform();
        userDashboard.clickOnProjects.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        userDashboard.fifthProject.click();
        Assert.assertTrue(userDashboard.fifthProjectDetails.isDisplayed());
        actions.sendKeys(Keys.PAGE_UP).perform();
        userDashboard.clickOnProjects.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        userDashboard.sixthtProject.click();
        Assert.assertTrue(userDashboard.sixthProjectDetails.isDisplayed());
        actions.sendKeys(Keys.PAGE_UP).perform();
        userDashboard.clickOnProjects.click();
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        JavascriptExecutor jse=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();",userDashboard.seventhProject);
        ReusableMethods.bekle(3);
        Assert.assertTrue(userDashboard.seventhProjectDetails.isDisplayed());
        actions.sendKeys(Keys.PAGE_UP).perform();
        userDashboard.clickOnProjects.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        jse.executeScript("arguments[0].click();",userDashboard.eighthProject);
        Assert.assertTrue(userDashboard.eighthProjectDetails.isDisplayed());
        actions.sendKeys(Keys.PAGE_UP).perform();
        userDashboard.clickOnProjects.click();
        jse.executeScript("arguments[0].click();",userDashboard.ninthProject);
        ReusableMethods.bekle(3);
        Assert.assertTrue(userDashboard.ninthProjectDetails.isDisplayed());
        actions.sendKeys(Keys.PAGE_UP).perform();
        userDashboard.clickOnProjects.click();
    }

        @Test
        public void test04 () {
            UserDashboard userDashboard=new UserDashboard();
            //1-Verify that the results are obtained when information is selected from country,state,city and category
            // buttons and click on Search
            Select select = new Select(userDashboard.countryOnProjects);
            select.selectByVisibleText("Canada");
            userDashboard.countryOnProjects.click();

            select = new Select(userDashboard.stateOnProjects);
            select.selectByIndex(1);
            userDashboard.stateOnProjects.click();

            select = new Select(userDashboard.cityOnProjects);
            select.selectByIndex(1);
            userDashboard.cityOnProjects.click();

            select = new Select(userDashboard.categoryOnProjects);
            select.selectByVisibleText("Villa");
            userDashboard.categoryOnProjects.click();

            //2-Verify that the details of the results are displayed
            String expectedResult="9";
            String actualResult=ConfigReader.getProperty("projectsSearchExpectedResult");
            Assert.assertEquals(expectedResult,actualResult);
        }

        @Test
    public void test05(){
        UserDashboard userDashboard=new UserDashboard();
        userDashboard.logOut.click();
        //4-Click on Sign In button in the header section
        userDashboard.signIn.click();
        // 5-Verify "Login" is visible
        userDashboard.loginVisibleTest.click();
        //6-Enter wrong email/username, password and click login
        userDashboard.nameUsername.sendKeys(ConfigReader.getProperty("hauseHeavenInvalidUsername"));
        userDashboard.password.sendKeys(ConfigReader.getProperty("hauseHeavenInvalidPassword"));
        userDashboard.login.click();
        //7-Verify that login cannot be done with wrong email adress and password
        Assert.assertTrue(userDashboard.invalidLoginText.isDisplayed());



    }



}


