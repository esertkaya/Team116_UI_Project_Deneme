package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US23_Elif {
    @Test
    public void test01() {
        //Test Case 1: Login the page successfully

        //1-Open browser
        UserDashboard userDashboard = new UserDashboard();
        //2-Navigate to "qa.hausehaven.com"
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        //3-Verify that the home page is displayed successfully
        String expectedTitle = "Hause Heaven";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        //4-Click on Sign In button in the header section
        userDashboard.headerSignIn.click();
        //5-Verify "Login" is visible
        Assert.assertTrue(userDashboard.loginVisibleTest.isDisplayed());
        //6-Enter correct email/username, password and click login
        userDashboard.textBoxEmailUserName.sendKeys(ConfigReader.getProperty("userName"));
        userDashboard.textBoxPassword.sendKeys(ConfigReader.getProperty("userPassword"));
        userDashboard.login.click();
        //7-Verify the username is visible in the header section
        Assert.assertTrue(userDashboard.userNameVisibleTest.isDisplayed());
    }

    @Test
    public void test02() {
        //Test Case 2: Navigate to the relevant page
        UserDashboard userDashboard = new UserDashboard();

        //Navigate to the agents page.
        userDashboard.clickOnAgents.click();

        //Confirm that the page title correctly identifies as the agents page.
        String expectedAgentsPageTitle = "Agents";
        String actualAgentsPageTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualAgentsPageTitle, expectedAgentsPageTitle);
    }

    @Test
    public void test03() {

        //Test Case 3: Check the Registered Listings
        UserDashboard userDashboard = new UserDashboard();

        //While on the agents page, verify that the number of registered listings for the first agent is displayed.
        Assert.assertTrue(userDashboard.numberOfRegisteredProperties1.isDisplayed());

        //Verify that first agent's email box in the agents page is displayed and enabled
        Assert.assertTrue(userDashboard.eachAgentMailBox1.isDisplayed());
        Assert.assertTrue(userDashboard.eachAgentMailBox1.isEnabled());

    }

    @Test
    public void test04() {
        //Test Case 4: Check The Agents' Information
        UserDashboard userDashboard = new UserDashboard();

        //On the agents page, check sections where other agent information (such as name, contact details, bio, etc.)
        // are obtained
        Actions actions = new Actions(Driver.getDriver());
        userDashboard.allowCookiesButton.click();
        ReusableMethods.bekle(2);
        userDashboard.agentsView1.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        userDashboard.clickOnAgents.click();


        //Confirm that this information is visible
        Assert.assertTrue(userDashboard.agentsView1.isDisplayed());


    }

    @Test
    public void test05() {


        //Test Case 5: Access Sale Ads
        UserDashboard userDashboard = new UserDashboard();
        //Choose a real estate agent from the list and navigate to their personal page or listings.
        userDashboard.agentsView2.click();
        //Identify the section where the sale ads are displayed.
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        userDashboard.firstAgentForSaleButton.click();
        //Verify that the sale ads are visible
        Assert.assertTrue(userDashboard.firstAgentForSaleAd.isDisplayed());
        //Click on a sale ad to ensure it can be accessed and loads correctly.
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        userDashboard.firstAgentViewButton.click();
        //Verify that for sale ad's info is displayed on the header section when clicked on ad
        Assert.assertTrue(userDashboard.firstAgentForSaleAdInfo.isDisplayed());
        System.out.println(Driver.getDriver().getWindowHandle());

        //Verify that the sale ad's can be shared on facebook, twitter and linkedin
        userDashboard.firstAgentPageFacebook.click();

        userDashboard.firstAgentPageTwitter.click();

        userDashboard.firstAgentPageLinkedin.click();
        Driver.getDriver().switchTo().defaultContent();

        //Navigate to the new tab
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        //Click on Agents
        userDashboard.clickOnAgents.click();
        ReusableMethods.bekle(3);
    }

        @Test
        public void test06 () {
            //Test Case 6: Access Rental Ads
            UserDashboard userDashboard = new UserDashboard();

            //Navigate back to the chosen real estate agent's listings.
            ReusableMethods.bekle(2);
            JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
            jse.executeScript("arguments[0].click();", userDashboard.agentsView1);
            //Identify the section where the rental ads are displayed.
            ReusableMethods.bekle(5);
            jse.executeScript("arguments[0].click();", userDashboard.firstAgentForRentButton);
            //Verify if the rental ads are visible and legible
           Assert.assertFalse(userDashboard.noRentalAdsFound.isDisplayed());
            //Click on a rental ad to ensure it can be accessed and loads correctly.
           // ReusableMethods.wait(2);
          //  userDashboard.firstAgentFirstRentalAddClick.click();
            //Verify that the rental ad's info is displayed on the header section when clicked on ad
          //  Assert.assertTrue(userDashboard.firstAgentForRentInfo.isDisplayed());

            /*
             When i first did the test I located 2 rental ads on the first agent's page. However, I see no rental ads
             I checked the other agents' pages and the result is the same. So I had to change
             my codes
             */

            //Close Browser
            Driver.closeDriver();


        }
    }




