package tests;

import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.HauseHeavenPage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class US22_TC001 {
    @Test
    public void test22() {

        //Open browser
        UserDashboard userDashboard=new UserDashboard();
        Driver.getDriver().get(ConfigReader.getProperty("hauseHeavenUrl"));
        //Navigate to projects page and verify the page is displayed successfully.
        userDashboard.clickOnProjects.click();
        String expectedTitle1="Projects";
        String actualTitle1=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle1,actualTitle1);


        //Test Case 2: Check Project Listings
        Assert.assertTrue(userDashboard.allProjectsList.isDisplayed());
        //On projects page, verify project announcement count is visible and accurate.
        String expectedResult=ConfigReader.getProperty("projectsFoundResult");
        String actualResult=userDashboard.numberOfProjectsVisibleTest.getText();
        Assert.assertEquals(expectedResult,actualResult);


        //Test Case 3: View Project Details
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(userDashboard.firstProjectMainPageDetails.isDisplayed());
        actions.sendKeys(Keys.TAB).perform();
        Assert.assertTrue(userDashboard.secondProjectMainPageDetails.isDisplayed());
        actions.sendKeys(Keys.TAB).perform();
        Assert.assertTrue(userDashboard.thirdProjectMainPageDetails.isDisplayed());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(userDashboard.fourthProjectMainPageDetails.isDisplayed());
        actions.sendKeys(Keys.TAB).perform();
        Assert.assertTrue(userDashboard.fifthProjectMainPageDetails.isDisplayed());
        actions.sendKeys(Keys.TAB).perform();
        Assert.assertTrue(userDashboard.sixthProjectMainPageDetails.isDisplayed());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(userDashboard.seventhProjectMainPageDetails.isDisplayed());
        actions.sendKeys(Keys.TAB).perform();
        Assert.assertTrue(userDashboard.eighthProjectMainPageDetails.isDisplayed());
        actions.sendKeys(Keys.TAB).perform();
        Assert.assertTrue(userDashboard.ninthProjectMainPageDetails.isDisplayed());



        //Select a project and verify that the project details are visible and accurate
        actions.sendKeys((Keys.PAGE_UP)).perform();
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_UP).perform();
        userDashboard.fifthProject.click();
        String expectedTitle="Tropical Haven Residences";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

        //Test Case 4: Search Functionality
        //Use the search feature on the projects page.
        ReusableMethods.bekle(3);
        userDashboard.clickOnProjects.click();
        userDashboard.countryOnProjects.click();
        Select select=new Select(userDashboard.countrySelectArrow);
        select.selectByVisibleText("Canada");
        select.getWrappedElement().click();

        //the selection of state
        Select select1=new Select(userDashboard.stateOnProjects);
        select1.selectByIndex(1);
        select.getFirstSelectedOption().click();

        //The selection of city
        Select select2=new Select(userDashboard.cityOnProjects);
        select2.selectByIndex(1);
        select2.getFirstSelectedOption().click();

        //The selection of categories
        Select select3=new Select(userDashboard.categoryOnProjects);
        select3.selectByVisibleText("Villa");
        select.getFirstSelectedOption().click();

        //Verify that search results correspond to the entered query.


        //Test Case 5: View Details of Searched Projects
        //Select a project from the search results.
        //Verify that the details of the searched project are visible and accurate.


        //Test Case 1: Access the Projects Page
        //Log in to the system with registered user credentials.
        //Navigate to the projects page from the main menu or dashboard.
        //Confirm that the projects page loads successfully and without any errors.
        //Verify that the page title or heading correctly identifies it as the projects page.
        //Test Case 2: Verify Project Announcements and Listings
        //On the projects page, identify the section where the number of project announcements and projects are displayed.
        //Check the visibility and legibility of this section.
        //Verify the accuracy of the displayed number of project announcements and projects against a known data source or database.
        //Verify the presence of all expected projects in the listings.
        //Test Case 3: View Project Details
        //Select a project from the listings.
        //Confirm that the project's detailed information page opens successfully.
        //Check the visibility and accuracy of the project details, such as the project name, description, timeline, etc.
        //Test Case 4: Test Search Functionality on the Projects Page
        //Locate the search bar or search functionality on the projects page.
        //Enter a known project name or keyword related to a project into the search bar.
        //Verify that the search results load successfully and display the correct projects related to the search term.
        //Check that no unrelated projects appear in the search results.
        //Test Case 5: Verify Details of Projects from Search Results
        //From the search results, select a project to view its details.
        //Confirm that the project's detailed information page opens successfully.
        //Verify the visibility and accuracy of the project details from the search results.
        //Cross-check the project details against known information to ensure accuracy.

    }
}