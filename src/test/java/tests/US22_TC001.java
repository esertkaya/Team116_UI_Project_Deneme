package tests;

import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.HauseHeavenPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class US22_TC001 {
    @Test
    public void test22() {
        //1-Open browser
        HauseHeavenPage hauseHeavenPage=new HauseHeavenPage();
        //2-Navigate to "qa.hausehaven.com"
        Driver.getDriver().get(ConfigReader.getProperty("hauseHeavenUrl"));
        //3-Verify that the home page is displayed successfully
        Assert.assertTrue(hauseHeavenPage.hauseHeaveHomePageTest.isDisplayed());
        //4-Click on Sign In button in the header section
        hauseHeavenPage.signIn.click();
        //5-Verify "Login" is visible
        Assert.assertTrue(hauseHeavenPage.loginVisibleTest.isDisplayed());
        //6-Enter correct email/username, password and click login
        hauseHeavenPage.nameUsername.sendKeys(ConfigReader.getProperty("hauseHeavenemail"));
        hauseHeavenPage.password.sendKeys(ConfigReader.getProperty("hauseHeavenpassword"));
        hauseHeavenPage.login.click();
        //7-Verify the username is visible in the header section
        Assert.assertTrue(hauseHeavenPage.userNameVisibleTest.isDisplayed());
        //8-Click on Projects
        hauseHeavenPage.clickOnProjects.click();
        //9-Verify Projects page is enabled
        String expectedTitle="All Projects";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertNotEquals(expectedTitle,actualTitle);
        //10-Verify the number of project announcements and the projects are displayed
        Assert.assertTrue(hauseHeavenPage.numberOfProjectsVisibleTest.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.allProjectsList.isDisplayed());
        //11-Verify the details of the projects are visible
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hauseHeavenPage.firstProject.click();
        Assert.assertTrue(hauseHeavenPage.firstProjectDetails.isDisplayed());
        hauseHeavenPage.allowCookies.click();
        actions.sendKeys(Keys.PAGE_UP).perform();
        hauseHeavenPage.clickOnProjects.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        hauseHeavenPage.secondProject.click();
        Assert.assertTrue(hauseHeavenPage.secondProjectDetails.isDisplayed());
        actions.sendKeys(Keys.PAGE_UP).perform();
        hauseHeavenPage.clickOnProjects.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        hauseHeavenPage.thirdProject.click();
        Assert.assertTrue(hauseHeavenPage.thirdProjectDetails.isDisplayed());
      //  hauseHeavenPage.allowCookies.click();
        actions.sendKeys(Keys.PAGE_UP).perform();
        hauseHeavenPage.clickOnProjects.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        hauseHeavenPage.fourthProject.click();
        Assert.assertTrue(hauseHeavenPage.fourthProjectDetails.isDisplayed());
        actions.sendKeys(Keys.PAGE_UP).perform();
        hauseHeavenPage.clickOnProjects.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        hauseHeavenPage.fifthProject.click();
        Assert.assertTrue(hauseHeavenPage.fifthProjectDetails.isDisplayed());
        actions.sendKeys(Keys.PAGE_UP).perform();
        hauseHeavenPage.clickOnProjects.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        hauseHeavenPage.sixthtProject.click();
        Assert.assertTrue(hauseHeavenPage.sixthProjectDetails.isDisplayed());
        actions.sendKeys(Keys.PAGE_UP).perform();
        hauseHeavenPage.clickOnProjects.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
     //   hauseHeavenPage.allowCookies.click();
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        hauseHeavenPage.seventhProject.click();
        Assert.assertTrue(hauseHeavenPage.seventhProjectDetails.isDisplayed());
        actions.sendKeys(Keys.PAGE_UP).perform();
        hauseHeavenPage.clickOnProjects.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(7);
        hauseHeavenPage.eighthProject.click();
        Assert.assertTrue(hauseHeavenPage.eighthProjectDetails.isDisplayed());
        actions.sendKeys(Keys.PAGE_UP).perform();
        hauseHeavenPage.clickOnProjects.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(7);
        hauseHeavenPage.ninthProject.click();
        Assert.assertTrue(hauseHeavenPage.ninthProjectDetails.isDisplayed());
        actions.sendKeys(Keys.PAGE_UP).perform();
        hauseHeavenPage.clickOnProjects.click();
        //12-Verify that the results are obtained when information is selected from country,state,city and category
        // buttons and click on Search
        Select select=new Select(hauseHeavenPage.countryOnProjects);
        hauseHeavenPage.countryOnProjects.click();
        select=new Select(hauseHeavenPage.stateOnProjects);
        hauseHeavenPage.stateOnProjects.click();
        select=new Select(hauseHeavenPage.countryOnProjects);
        hauseHeavenPage.countryOnProjects.click();
        select=new Select(hauseHeavenPage.cityOnProjects);
        hauseHeavenPage.cityOnProjects.click();
        select=new Select(hauseHeavenPage.categoryOnProjects);
        hauseHeavenPage.categoryOnProjects.click();
        hauseHeavenPage.searchOnProjects.click();
        //13-Verify that the details of the results are displayed
    }
}
