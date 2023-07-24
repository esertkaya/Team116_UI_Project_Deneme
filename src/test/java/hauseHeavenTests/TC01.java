package hauseHeavenTests;

import org.junit.Assert;
import org.testng.annotations.Test;
import pages.HauseHeavenPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC01 {
    @Test
    public void test01(){
        //1- Browser acilir
        HauseHeavenPage hauseHeavenPage=new HauseHeavenPage();
        //2- "qa.hauseheaven.com" anasayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("hauseHeavenUrl"));
        //3-"qa.hauseheaven.com" sayfaya erisilebildigi dogrulanir
        Assert.assertTrue(hauseHeavenPage.hauseHeaveHomePageTest.isEnabled());


    }

}
