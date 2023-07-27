package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HauseHeavenPage {

    public HauseHeavenPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //Ust kisimdaki Home Linki
    @FindBy(xpath = "//*[@class='current-menu-item']")
    public WebElement hauseHeaveHomePageTest;
    @FindBy(xpath ="//a[@href='https://qa.hauseheaven.com/']")
    public WebElement clickOnHome;
    @FindBy(xpath = "//a[@href='https://qa.hauseheaven.com/properties?layout=sidebar']")
    public WebElement clickOnListing;
    @FindBy(xpath = "//a[@href='https://qa.hauseheaven.com/projects']")
    public WebElement clickOnProjects;
    @FindBy(xpath = "//a[@href='https://qa.hauseheaven.com/agents']")
    public WebElement clickOnAgents;
    @FindBy(xpath = "//a[@href='https://qa.hauseheaven.com/blog']")
    public WebElement clickOnBlog;
    @FindBy(xpath = "(//a[@href='https://qa.hauseheaven.com/contact'])[1]")
    public WebElement clickOnContact;
    @FindBy(xpath = "(//a[@href='https://qa.hauseheaven.com/login'])[1]")
    public WebElement clickOnSignup;
    @FindBy(xpath = "//a[text()=' Add Property']")
    public WebElement addProperty;
    @FindBy(xpath = "//a[text()='Sign In']")
    public WebElement signIn;
    @FindBy(xpath = "(//a[text()=' Wishlist('])[1]")
    public WebElement wishList;
    @FindBy(xpath = "//h1[text()='Find accessible homes to rent']")
    public WebElement findAccessibleHomeToRentVisibleTest;
    @FindBy(xpath = "//input[@placeholder='Search for a location']")
    public WebElement searchForLocation;
    @FindBy(xpath = "//span[@id='select2-minprice-container']")
    public WebElement minPrice;
    @FindBy(xpath = "//span[@id='select2-maxprice-container']")
    public WebElement maxPrice;
    @FindBy(xpath = "//span[text()='Category']")
    public WebElement propertyType;
    @FindBy(xpath = "//span[@id='select2-select-bedroom-container']")
    public WebElement bedRooms;
    @FindBy(xpath = "//span[@id='select2-city_id-container']")
    public WebElement propertyLocation;
    @FindBy(xpath = "//button[text()='Search Result']")
    public WebElement searchResult;
    @FindBy(xpath = "(//div[@class='container'])[4]")
    public WebElement howItWorksVisibleTest;
    @FindBy(xpath = "//h2[text()='Explore Good Places']")
    public WebElement exploreGoodPlacesVisibleTest;
    @FindBy(xpath = "(//a[text()='View'])[1]")
    public WebElement clickOnView1;
    @FindBy(xpath = "(//a[text()='View'])[2]")
    public WebElement clickOnView2;
    @FindBy(xpath = "(//a[text()='View'])[3]")
    public WebElement clickOnView3;
    @FindBy(xpath = "(//a[text()='View'])[4]")
    public WebElement clickOnView4;
    @FindBy(xpath = "(//a[text()='View'])[5]")
    public WebElement clickOnView5;
    @FindBy(xpath = "(//a[text()='View'])[6]")
    public WebElement clickOnView6;
    @FindBy(xpath = "//a[text()='Browse More Properties']")
    public WebElement browseMoreProperties;
    @FindBy(xpath = "//h2[text()='Find By Locations']")
    public WebElement findByLocationsVisibleTest;
    @FindBy(xpath = "(//i[@class='ti-angle-right'])[1]")
    public WebElement location1;
    @FindBy(xpath = "(//i[@class='ti-angle-right'])[2]")
    public WebElement location2;
    @FindBy(xpath = "(//i[@class='ti-angle-right'])[3]")
    public WebElement location3;
    @FindBy(xpath = "(//i[@class='ti-angle-right'])[4]")
    public WebElement location4;
    @FindBy(xpath = "(//i[@class='ti-angle-right'])[5]")
    public WebElement location5;
    @FindBy(xpath = "(//i[@class='ti-angle-right'])[6]")
    public WebElement location6;
    @FindBy(xpath = "(//i[@class='ti-angle-right'])[7]")
    public WebElement location7;
    @FindBy(xpath = "(//i[@class='ti-angle-right'])[8]")
    public WebElement location8;
    @FindBy(xpath = "//a[text()='Browse By Locations']")
    public WebElement browseByLocations;
    @FindBy(xpath = "//h2[text()='Good Reviews By Customers']")
    public WebElement goodReviewsByCustomersVisibleTest;
    @FindBy(xpath = "//div[@class='col-lg-12 col-md-12']")
    public WebElement allReviewsVisibleTest;
    @FindBy(xpath = "//h2[text()='See Our Packages']")
    public WebElement seeOurPackagesVisibleTest;
    @FindBy(xpath = "(//a[text()='Choose Plan'])[1]")
    public WebElement choosePlan1;
    @FindBy(xpath = "(//a[text()='Choose Plan'])[2]")
    public WebElement choosePlan2;
    @FindBy(xpath = "(//a[text()='Choose Plan'])[3]")
    public WebElement choosePlan3;
    @FindBy(xpath = "//*[text()='Recently Viewed Properties']")
    public WebElement recentlyViewedPropertiesVisibleTest;
    @FindBy(xpath = "//div[@class='call-to-act-head']")
    public WebElement wantToBecameEstateAgentVisibleTest;
    @FindBy(xpath = "//a[text()='Sign Up Today']")
    public WebElement signUpToday;
    @FindBy(xpath = "//h4[@class='m-0']")
    public WebElement foundResults;
    @FindBy(xpath = "//input[@placeholder='Email/Username']")
    public WebElement nameUsername;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement login;
    @FindBy(xpath = "//h4[@class='mb-0']")
    public WebElement numberOfProjectsVisibleTest;
    @FindBy(xpath = "//div[@class='container mt-5']")
    public WebElement allProjectsList;
    @FindBy(xpath = "(//div[@class='col-lg-4 col-md-6 col-sm-12'])[1]")
    public WebElement firstProjectDetails;
    @FindBy(xpath = "(//div[@class='col-lg-4 col-md-6 col-sm-12'])[1]")
    public WebElement secondProjectDetails;
    @FindBy(xpath = "(//div[@class='col-lg-4 col-md-6 col-sm-12'])[1]")
    public WebElement thirdProjectDetails;
    @FindBy(xpath = "(//div[@class='col-lg-4 col-md-6 col-sm-12'])[1]")
    public WebElement fourthProjectDetails;
    @FindBy(xpath = "(//div[@class='col-lg-4 col-md-6 col-sm-12'])[1]")
    public WebElement fifthProjectDetails;
    @FindBy(xpath = "(//div[@class='col-lg-4 col-md-6 col-sm-12'])[1]")
    public WebElement sixthProjectDetails;
    @FindBy(xpath = "(//div[@class='col-lg-4 col-md-6 col-sm-12'])[1]")
    public WebElement seventhProjectDetails;
    @FindBy(xpath = "(//div[@class='col-lg-4 col-md-6 col-sm-12'])[1]")
    public WebElement eighthProjectDetails;
    @FindBy(xpath = "(//div[@class='col-lg-4 col-md-6 col-sm-12'])[1]")
    public WebElement ninthProjectDetails;
    @FindBy(xpath = "(//a[@class='prt-link-detail text-uppercase'])[1]")
    public WebElement firstProject;
    @FindBy(xpath = "(//a[@class='prt-link-detail text-uppercase'])[2]")
    public WebElement secondProject;
    @FindBy(xpath = "(//a[@class='prt-link-detail text-uppercase'])[3]")
    public WebElement thirdProject;
    @FindBy(xpath = "(//a[@class='prt-link-detail text-uppercase'])[4]")
    public WebElement fourthProject;
    @FindBy(xpath = "(//a[@class='prt-link-detail text-uppercase'])[5]")
    public WebElement fifthProject;
    @FindBy(xpath = "(//a[@class='prt-link-detail text-uppercase'])[6]")
    public WebElement sixthtProject;
    @FindBy(xpath = "(//a[@class='prt-link-detail text-uppercase'])[7]")
    public WebElement seventhProject;
    @FindBy(xpath = "(//a[@class='prt-link-detail text-uppercase'])[8]")
    public WebElement eighthProject;
    @FindBy(xpath = "(//a[@class='prt-link-detail text-uppercase'])[9]")
    public WebElement ninthProject;
    @FindBy(xpath = "//span[text()='Country']")
    public WebElement countryOnProjects;
    @FindBy(xpath = "//span[@title='State']")
    public WebElement stateOnProjects;
    @FindBy(xpath = "//span[@title='City']")
    public WebElement cityOnProjects;
    @FindBy(xpath = "//span[text()='Category']")
    public WebElement categoryOnProjects;
    @FindBy(xpath = "//button[text()='Search']")
    public WebElement searchOnProjects;
    @FindBy(xpath = "//button[@class='js-cookie-consent-agree cookie-consent__agree']")
    public WebElement allowCookies;





















}
