package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class aaaaa {
    @Test
    public void test01(){
        UserHomepage userHomepage=new UserHomepage();
        Driver.getDriver().get("https://qa.hauseheaven.com/properties/9876-elmwood-avenue");  //View tiklamadigim icin devamini yapabilmek icin eklendi kaldirilacak
        // ilgili ilanın sosyal medyada paylaşılabilir durumda olduğunu,

        Driver.getDriver()
                .findElement(By.xpath("//a[@class='btn btn-likes']"))
                .click();
       // userHomepage.iframeFacebook.click();

       // ReusableMethods.bekle(3);
        // wishliste eklenebildiğini,
        userHomepage.listingSaveButonu.click();  //save e tiklanir

        ReusableMethods.bekle(3);

        //** eklendigini soyleyen yaziyi nasil kontrol edebilirim ??? Javascript sanirim

        // emlakçısına mesaj gönderebildiğimi doğrulayabilmeliyim
      //  Driver.getDriver().switchTo().alert().accept();



         /*
         nameTestData = Name Surname
         phoneTestData = 0533 888 44 44
         emailTestData = name@hauseheaven.com
         messageTestData = Property Message Test Data
          */

        Actions actions=new Actions(Driver.getDriver());
        userHomepage.allowCookiesButton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();


        userHomepage.nameTextBox.sendKeys("Ali Kaya");


        userHomepage.phoneTextBox.sendKeys("01234567");
        userHomepage.emailTextBox.sendKeys("deneme@denem.com");
        userHomepage.messageTextBox.sendKeys("mesaj kutusu");
        userHomepage.sendMessageButton.click();
        ReusableMethods.bekle(3);
    }
}
