package hauseHeavenTests;

import org.junit.Assert;
import org.testng.annotations.Test;
import pages.HauseHeavenPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC02 {
    @Test
    public void test02(){
        //1- Browser acilir
        HauseHeavenPage hauseHeavenPage=new HauseHeavenPage();
        //2- "qa.hauseheaven.com" ana sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("hauseHeavenUrl"));
        //3- "qa.hauseheaven.com" anasayfanin gorunur olup olmadigi test edilir
        Assert.assertTrue(hauseHeavenPage.hauseHeaveHomePageTest.isDisplayed());
        //4- qa.hauseheaven.com sayfasinin header bolumundeki menulerin aktif oldugu dogrulanir
        Assert.assertTrue(hauseHeavenPage.clickOnHome.isEnabled());
        Assert.assertTrue(hauseHeavenPage.clickOnListing.isEnabled());
        Assert.assertTrue(hauseHeavenPage.clickOnProjects.isEnabled());
        Assert.assertTrue(hauseHeavenPage.clickOnAgents.isEnabled());
        Assert.assertTrue(hauseHeavenPage.clickOnBlog.isEnabled());
        Assert.assertTrue(hauseHeavenPage.clickOnContact.isEnabled());
        Assert.assertTrue(hauseHeavenPage.clickOnSignup.isEnabled());
        Assert.assertTrue(hauseHeavenPage.addProperty.isEnabled());
        Assert.assertTrue(hauseHeavenPage.signIn.isEnabled());
        //5- "qa.hauseheaven.com" sayfasinin header bolumundeki menulerin gorunur olup olmadigi dogrulanir
        Assert.assertTrue(hauseHeavenPage.clickOnHome.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.clickOnListing.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.clickOnProjects.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.clickOnAgents.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.clickOnBlog.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.clickOnContact.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.clickOnSignup.isDisplayed());

    }
}
