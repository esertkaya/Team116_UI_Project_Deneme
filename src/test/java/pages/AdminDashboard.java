package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminDashboard {
    // -Firdevs hanim -Metin -Yusuf bey -Enver Bey
    AdminDashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //USER STORY 44--PAYMENTS
    @FindBy(xpath = "(//span[@class='title'])[10]")
    public WebElement payments;
    @FindBy(xpath = "(//a[@class='nav-link'])[9]")
    public WebElement transactionsUnderPayments;


    //USER STORY 46--
    @FindBy(xpath = "//i[@class='fas fa-user']")
    public WebElement userNameHeader;
    @FindBy(xpath ="//a[@title='credits']")
    public WebElement buyCredits;
    @FindBy(xpath = "(//button[text()='Purchase'])[1] ")
    public WebElement purchaseButton1;
    @FindBy(xpath =  "//li[@class='list-group-item']")
    public WebElement payOnlineViaStripe;
    @FindBy(xpath = "//p[text()='Payment with Stripe']")
    public WebElement paymentWithStripeText;
    @FindBy(xpath = "//div[@class='jp-card-front']")
    public WebElement creditCartFront;
    @FindBy(xpath = "//input[@id='stripe-number']")
    public WebElement cardNumber;
    @FindBy(xpath = "//input[@id='stripe-name']")
    public WebElement fullName;
    @FindBy(xpath = "//input[@id='stripe-exp']")
    public WebElement mMYY;
    @FindBy(xpath = "//input[@id='stripe-cvc']")
    public WebElement cVC;
    @FindBy(xpath = "//button[text()='Checkout']")
    public WebElement checkOut;
    @FindBy(xpath = "(//a[@rel='nofollow'])[2]")
    public WebElement logOutHeader;
    @FindBy(xpath = "(//div[@class='checkbox checkbox-primary table-checkbox'])[1]")
    public WebElement paymentVisible;




    //USER STORY 48---
    @FindBy(xpath = "(//span[@class='title'])[11]")
    public WebElement locations;
    @FindBy(xpath = "(//a[@class='nav-link'])[10]")
    public WebElement countriesUnderLocations;
    @FindBy(xpath = "//div[@class='page-content ']")
    public WebElement countriesPage;
    @FindBy(xpath = "//div[@class='datatables__info_wrap']")
    public WebElement recordedCountriesNumber;
    @FindBy(xpath = "//div[@class='portlet light bordered portlet-no-padding']")
    public WebElement itemsVisibleOnCountriesPage;
    @FindBy(xpath = "(//*[@class=' text-start column-key-name'])[1]")
    public WebElement itemsActiveOnCountriesPage;
    @FindBy(xpath = "(//*[@class='btn btn-secondary action-item'])[1]")
    public WebElement createOnCountriesPage;
    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameRegister;
    @FindBy(xpath = "//input[@id='nationality']")
    public WebElement nationalityRegister;
    @FindBy(xpath = "//input[@id='code']")
    public WebElement codeRegister;
    @FindBy(xpath = "//input[@id='dial_code']")
    public WebElement dialCodeRegister;
    @FindBy(xpath = "//input[@id='order']")
    public WebElement orderRegister;
    @FindBy(xpath = "(//button[@value='save'])[1]")
    public WebElement saveAndExitButton;
    @FindBy(xpath = "(//button[@value='save'])[2]")
    public WebElement saveButton;
    @FindBy(xpath = "(//i[@class='fa fa-edit'])[2]")
    public WebElement editButton;
    @FindBy(xpath = "(//i[@class='fa fa-trash'])[1]")
    public WebElement deleteButton;
    @FindBy(xpath = "(//button[text()='Delete'])[1]")
    public WebElement confirmDeleteButton;
    @FindBy(xpath = "//*[@class='toast toast-success']")
    public WebElement deleteSuccessfullyText;











}
