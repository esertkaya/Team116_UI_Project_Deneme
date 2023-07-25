package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserHomepage {
    public UserHomepage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
