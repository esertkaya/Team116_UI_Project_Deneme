package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US22_Elif {
    @Test

    public void test01() {
        //Test case 1: Login the page successfully

        //1-Open browser
        UserDashboard userDashboard = new UserDashboard();
        //2-Navigate to "qa.hausehaven.com"
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        //3-Verify that the home page is displayed successfully
        String expectedTitle="Hause Heaven";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        //4-Click on Sign In button in the header section
        userDashboard.headerSignIn.click();
        //5-Verify "Login" is visible
        Assert.assertTrue(userDashboard.loginVisibleTest.isDisplayed());
        //6-Enter correct email/username, password and click login
        userDashboard.textBoxEmailUserName.sendKeys(ConfigReader.getProperty("userName"));
        userDashboard.textBoxPassword.sendKeys(ConfigReader.getProperty("userPassword"));
        userDashboard.loginButton.click();
        //7-Verify the username is visible in the header section
        Assert.assertTrue(userDashboard.userNameVisibleTest.isDisplayed());

    }


    @Test
    public void test02() {
        //Test Case 2: Projects verification on Projects page
        UserDashboard userDashboard = new UserDashboard();

        //1-Click on Projects
        userDashboard.clickOnProjects.click();
        //2-Verify Projects page is enabled
        String expectedTitle = "All Projects";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertNotEquals(expectedTitle, actualTitle);
        //3-Verify the number of project announcements and the projects are displayed
        Assert.assertTrue(userDashboard.numberOfProjectsVisibleTest.isDisplayed());

        //Verify all projects in the list are displayed and enabled
        List<WebElement> allProjectsList=Driver.getDriver().findElements(By.xpath("//div[@class='container mt-5']"));
        Assert.assertFalse(allProjectsList.isEmpty());

        for (WebElement eachList:allProjectsList) {
            Assert.assertTrue(eachList.isDisplayed());
            Assert.assertTrue(eachList.isEnabled());
        }
    }

    @Test
    public void test03() throws InterruptedException {
        UserDashboard userDashboard = new UserDashboard();
        //Test Case 3: The Project Details Verification

        //1-Click on Projects
        userDashboard.clickOnProjects.click();
        //2-Verify Projects page is enabled
        String expectedTitle = "All Projects";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertNotEquals(expectedTitle, actualTitle);
        //3-Verify the number of project announcements and the projects are displayed
        Assert.assertTrue(userDashboard.numberOfProjectsVisibleTest.isDisplayed());
        Assert.assertTrue(userDashboard.allProjectsList.isDisplayed());
        //4-Verify the details of the first project are visible
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        userDashboard.firstProject.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(userDashboard.firstProjectDetails.isDisplayed());


    }

    @Test
    public void test04 () {
        UserDashboard userDashboard=new UserDashboard();
        //Test Case 4: Search Projects By Filtering

        //Click on Projects
        userDashboard.clickOnProjects.click();

        //Verify that the results are obtained when information is selected from country,state,city and category
        // buttons and click on Search
        Select select = new Select(userDashboard.countryOnProjects);
        select.selectByIndex(1);
        ReusableMethods.bekle(3);


        select = new Select(userDashboard.stateOnProjects);
        select.selectByIndex(1);
        ReusableMethods.bekle(2);


        select = new Select(userDashboard.cityOnProjects);
        select.selectByIndex(0);
        ReusableMethods.bekle(2);


        select = new Select(userDashboard.categoryOnProjects);
        select.selectByIndex(2);
        ReusableMethods.bekle(2);


        //2-Verify that the details of the results are displayed
        String expectedResult="Found 1 - 9 Of 9 Results";
        String actualResult=ConfigReader.getProperty("projectFoundResult");
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void test05(){
        //Test Case 5: Unsuccessful login test with invalid username and password

        UserDashboard userDashboard=new UserDashboard();
        userDashboard.headerLogOutButton.click();
        //4-Click on Sign In button in the header section
        userDashboard.headerSignIn.click();
        // 5-Verify "Login" is visible
        userDashboard.loginVisibleTest.click();
        //6-Enter wrong email/username, password and click login
        userDashboard.textBoxEmailUserName.sendKeys(ConfigReader.getProperty("userUrl"));
        userDashboard.textBoxPassword.sendKeys(ConfigReader.getProperty("userPassword"));
        userDashboard.loginButton.click();
        //7-Verify that login cannot be done with wrong email adress and password
        Assert.assertTrue(userDashboard.invalidLoginText.isDisplayed());
        //Close Browser
        Driver.closeDriver();


    }
}