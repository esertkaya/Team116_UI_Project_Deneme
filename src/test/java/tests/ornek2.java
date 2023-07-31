package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;
import java.text.CompactNumberFormat;

public class ornek2 {
    @Test
    public void test01(){
        UserHomepage userHomepage=new UserHomepage();
        Driver.getDriver().get(ConfigReader.getProperty("hauseHeavenUrl"));
     //  Actions actions=new Actions(Driver.getDriver());
      // actions.sendKeys(Keys.PAGE_DOWN).perform();
      //  actions.moveToElement(userHomepage.view1).click().perform();
        userHomepage.allowCookiesButton.click();
        userHomepage.view1.click();
    }
}
