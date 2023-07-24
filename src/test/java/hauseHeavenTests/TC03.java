package hauseHeavenTests;


import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HauseHeavenPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class TC03 {
    @Test
    public void test03(){
        //1- Browser acilir
        HauseHeavenPage hauseHeavenPage=new HauseHeavenPage();
        //2- "qa.hauseheaven.com" ana sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("hauseHeavenUrl"));
        //3- "qa.hauseheaven.com" anasayfanin gorunur olup olmadigi test edilir
        Assert.assertTrue(hauseHeavenPage.hauseHeaveHomePageTest.isDisplayed());
        //4- "qa.hauseheaven.com" sayfasinin body bolumundeki fonksiyonlarin aktif ve gorunur oldugu dogrulanir
        Assert.assertTrue(hauseHeavenPage.searchForLocation.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.minPrice.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.maxPrice.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.propertyType.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.bedRooms.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.propertyLocation.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.searchResult.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.howItWorksVisibleTest.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.exploreGoodPlacesVisibleTest.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.findByLocationsVisibleTest.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.clickOnView1.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.clickOnView2.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.clickOnView3.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.clickOnView4.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.clickOnView5.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.clickOnView6.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.browseMoreProperties.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.location1.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.location2.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.location3.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.location4.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.location5.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.location6.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.location7.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.location8.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.browseByLocations.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.goodReviewsByCustomersVisibleTest.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.allReviewsVisibleTest.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.seeOurPackagesVisibleTest.isDisplayed());
      //  Assert.assertTrue(hauseHeavenPage.recentlyViewedPropertiesVisibleTest.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.choosePlan1.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.choosePlan2.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.choosePlan3.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.wantToBecameEstateAgentVisibleTest.isDisplayed());
        Assert.assertTrue(hauseHeavenPage.signUpToday.isDisplayed());
        //5. "qa.hauzeheaven.com" sayfasinin search bölümünde arama yapıp sonuç sayısı görüntülenebildigini doğrulayin.
        Actions actions=new Actions(Driver.getDriver());
        hauseHeavenPage.searchForLocation.click();
        actions.sendKeys(ConfigReader.getProperty("searchForLocation")).sendKeys(Keys.ENTER).perform();
        System.out.println(hauseHeavenPage.foundResults.getText());

    }

}
