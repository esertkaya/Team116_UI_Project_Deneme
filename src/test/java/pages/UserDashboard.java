package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserDashboard {
    //-Elif - -Suleyman
    public UserDashboard() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    //HEADER LOCATES ON USER DASHBOARD
    @FindBy(xpath = "(//*[@href='https://qa.hauseheaven.com'])[2]")
    public WebElement hauseHeaveHomePageTest;
    @FindBy(xpath = "//a[@href='https://qa.hauseheaven.com']")
    public WebElement clickOnHomeImage;
    @FindBy(xpath ="//*[@class='current-menu-item']")
    public WebElement clickOnHomeLink;
    @FindBy(xpath = "//a[@href='https://qa.hauseheaven.com/properties?layout=sidebar']")
    public WebElement clickOnListing;

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
    @FindBy(xpath = "//input[@placeholder='Email/Username']")
    public WebElement nameUsername;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement login;
    @FindBy(xpath = "//*[@class='fas fa-sign-out-alt']")
    public WebElement logOut;
    @FindBy(xpath = "//*[text()='These credentials do not match our records.']")
    public WebElement invalidLoginText;
    @FindBy(xpath = "//table[@id='botble-real-estate-tables-account-property-table']")
    public WebElement registeredPropertyVisible;
    @FindBy(xpath = "//i[@class='fas fa-user']")
    public WebElement headerUserName;
    @FindBy(xpath = "//*[@class='current-menu-item']")
    public WebElement userDashboardLogOut;
    @FindBy(xpath = "(//a[text()=' Wishlist('])[1]")
    public WebElement wishList;




    //REGISTERED USER HOME PAGE BODY
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




    //REGISTERED USER FOOTER
    @FindBy(xpath = "//div[@class='col-lg-3 col-md-4']")
    public WebElement footerContactInformation;
    @FindBy(xpath = "//h4[text()='About']")
    public WebElement footerAboutText;
    @FindBy(xpath = "//span[text()='About us']")
    public WebElement footerAboutUs;
    @FindBy(xpath = "//span[text()='Contact us']")
    public WebElement footerContacUs;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement contactName;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement contactEmail;
    @FindBy(xpath = "//input[@name='subject']")
    public WebElement contactSubject;
    @FindBy(xpath = "//input[@name='phone']")
    public WebElement contactPhone;
    @FindBy(xpath = "//input[@name='content']")
    public WebElement contactContent;
    @FindBy(xpath = "//button[text()='Send message']")
    public WebElement contactSendMessageButton;
    @FindBy(xpath = "//div[@class='address']")
    public WebElement adressOnMap;
    @FindBy(xpath = "//div[@class='contact-info']")
    public WebElement contactInfoOnContacPage;
    @FindBy(xpath = "//span[text()='Terms & Conditions']")
    public WebElement termsAndConditions;
    @FindBy(xpath = "(//div[@class='container'])[4]")
    public WebElement termsAndConditionsVisible;
    @FindBy(xpath = "//h4[text()='MORE INFORMATION']")
    public WebElement moreInformationText;
    @FindBy(xpath = "//span[text()='All properties']")
    public WebElement allProperties;
    @FindBy(xpath = "//input[@id='cp-sale']")
    public WebElement forSaleRadioButton;
    @FindBy(xpath = "//input[@id='cp-rent']")
    public WebElement forRentRadioButton;
    @FindBy(xpath = "//input[@id='cp-hsd']")
    public WebElement okRadioButton;
    @FindBy(xpath = "//input[@placeholder='Search for a location']")
    public WebElement propertiesSearchForLocation;
    @FindBy(xpath = "//button[text()='Search']")
    public WebElement propertiesSearchButton;
    @FindBy(xpath = "//h4[@class='m-0']")
    public WebElement houseForSaleSearchResults;
    @FindBy(xpath = "//div[@class='col-lg-12 col-md-12 list-layout']")
    public WebElement houseForSaleListVisible;
    @FindBy(xpath = "//div[@class='container']")
    public WebElement houseForRentListVisible;
    @FindBy(xpath = "//h4[@class='m-0']")
    public WebElement houseForRentSearchResults;
    @FindBy(xpath = "//span[@id='select2-sort_by-container']")
    public WebElement sortBy;
    @FindBy(xpath = "//i[@class='ti-layout-grid2']")
    public WebElement grid1;
    @FindBy(xpath = "//i[@class='ti-view-list']")
    public WebElement grid2;
    @FindBy(xpath = "//h4[text()='NEWS']")
    public WebElement newsTextVisible;
    @FindBy(xpath = "//span[text()='The Benefits Of Investing In Emerging Real Estate Markets']")
    public WebElement firstNews;
    @FindBy(xpath = "//div[@id='app']")
    public WebElement firstNewsPage;
    @FindBy(xpath = "//span[text()='//span[text()='A Guide To Negotiating The Best Deal On Your Dream Home']']")
    public WebElement secondNews;
    @FindBy(xpath = "//div[@id='app']")
    public WebElement secondNewsPage;
    @FindBy(xpath = "//span[text()='The Rise Of Sustainable Homes: Building For A Greener Future']")
    public WebElement thirdNews;
    @FindBy(xpath = "//div[@id='app']")
    public WebElement thirdNewsPage;
    @FindBy(xpath = "//span[text()='How to Stage Your Home for a Quick and Profitable Sale']")
    public WebElement fourthNews;
    @FindBy(xpath = "//div[@id='app']")
    public WebElement fourthNewsPage;
    @FindBy(xpath = "//span[text()='Investing in Vacation Rental Properties: A Lucrative Opportunity']")
    public WebElement fifthNews;
    @FindBy(xpath = "//div[@id='app']")
    public WebElement fifthNewsPage;
    @FindBy(xpath = "//*[text()='Download Apps']")
    public WebElement downloadAppsText;
    @FindBy(xpath = "(//*[@class='os-app-caps'])[1]")
    public WebElement googlePlay;
    @FindBy(xpath = "(//*[@class='os-app-caps'])[2]")
    public WebElement appStore;
    @FindBy(xpath = "//span[text()='Subscribe']")
    public WebElement subscribeText;
    @FindBy(xpath = "//input[@placeholder='Enter your email']")
    public WebElement enterYourEmail;
    @FindBy(xpath = "//button[text()='Subscribe']")
    public WebElement subscribeButton;






    //USER DASHBOARD LEFT MENU
    @FindBy(xpath = "//section[@class='bg-light']")
    public WebElement adminDashboardVisible;
    @FindBy(xpath = "//div[@class='d-user-avater']")
    public WebElement userProfileImageAndText;
    @FindBy(xpath = "//a[@title='Profile']")
    public WebElement dashBoard;
    @FindBy(xpath = "//a[@title='Settings']")
    public WebElement settings;
    @FindBy(xpath ="//a[@title='credits']")
    public WebElement buyCredits;
    @FindBy(xpath = "//span[@class='badge badge-info']")
    public WebElement creditBalanceText;
    @FindBy(xpath = "//a[@title='Properties']")
    public WebElement properties;
    @FindBy(xpath = "//a[@title='Write a property']")
    public WebElement writeAProperty;
    @FindBy(xpath = "//i[@class='ti-unlock']")
    public WebElement security;
    @FindBy(xpath = "//span[text()='Logout']")
    public WebElement leftMenuLogOut;






















    //USER DASHBOARD MAIN
    @FindBy(tagName = "(//h4)[3]")
    public WebElement currentCreditsText;
    @FindBy(xpath = "//div[@class='dashboard-stat widget-1']")
    public WebElement approvedProperties;
    @FindBy(xpath = "//div[@class='dashboard-stat widget-2']")
    public WebElement pendingApproveProperties;
    @FindBy(xpath = "//div[@class='dashboard-stat widget-3']")
    public WebElement rejectedProperties;
    @FindBy(xpath = "//a[text()='Activity Logs']")
    public WebElement activityLogsText;
    @FindBy(xpath = "//div[@class='bg-white br2 pa3']")
    public WebElement allRecentActivityLogs;
    @FindBy(xpath = "//a[text()='Load more']")
    public WebElement loadMore;





    //USER DASHBOARD SETTING MAIN
    @FindBy(xpath = "//div[@class='container-fluid']")
    public WebElement settingsPageVisible;
    @FindBy(xpath = "//h4[text()='Account Information']")
    public WebElement accountInformationText;
    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstNameInput;
    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastNameInput;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement userNameInput;
    @FindBy(xpath = "//input[@id='phone']")
    public WebElement phoneInput;
    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement shortDescriptionInput;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailInput;
    @FindBy(xpath = "//small[@class='f7 green']")
    public WebElement verifiedEmailText;
    @FindBy(xpath = "//label[text()='Birthday']")
    public WebElement birthdayText;
    @FindBy(xpath = "//select[@id='year']")
    public WebElement selectYear;
    @FindBy(xpath = "//select[@id='month']")
    public WebElement selectMonth;
    @FindBy(xpath = "//select[@id='day']")
    public WebElement selectDay;
    @FindBy(xpath = "//label[text()='Gender']")
    public WebElement genderText;
    @FindBy(xpath = "//select[@id='gender']")
    public WebElement selectGender;
    @FindBy(xpath = "(//button[text()='Save'])[1]")
    public WebElement saveButton;





    //USER DASHBOARD PROFILE IMAGE
    @FindBy(xpath = "(//div[@class='form-group'])[9]")
    public WebElement profileImage;
    @FindBy(xpath = "//strong[text()='Change avatar']")
    public WebElement changeAvatarText;
    @FindBy(xpath = "//label[text()='New image']")
    public WebElement newImageText;
    @FindBy(xpath = "//input[@id='avatarInput']")
    public WebElement chooseFileButton;
    @FindBy(xpath = "//button[text()='Close']")
    public WebElement closeAvatarButton;
    @FindBy(xpath = "(//button[text()='Save'])[2]")
    public WebElement saveAvatarButton;
    @FindBy(xpath = "//div[@class='col-md-3 avatar-preview-wrapper']")
    public WebElement imagesOnRightAvatar;





    //USER DASHBOARD BUY CREDITS
    @FindBy(xpath = "(//div[@class='container-fluid'])[1]")
    public WebElement buyCreditsPageVisible;
    @FindBy(xpath = "( //h4[@class='with-actions'])[1] ")
    public WebElement packagesText;
    @FindBy(xpath = "//div[@class='alert alert-info current-package']")
    public WebElement yourCreditsText;
    @FindBy(xpath = "(//div[@class='card-block'])[1] ")
    public WebElement Post1Text;
    @FindBy(xpath = "(//button[text()='Purchase'])[1] ")
    public WebElement purchaseButton1;
    @FindBy(xpath = "(//div[@class='card-block'])[2] ")
    public WebElement Post2Text;
    @FindBy(xpath = "(//button[text()='Purchase'])[2] ")
    public WebElement purchaseButton2;
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
    @FindBy(xpath = "(//h4[@class='with-actions'])[2] ")
    public WebElement transactionsText;
    @FindBy(xpath = "(//div[@class='main-dashboard-form'])[2]")
    public WebElement transactionsDetails;





    //USER DASHBOARD PROPERTIES
    //Sadece Ilk recordlar locate edildi.
    @FindBy(xpath = "(//div[@class='container-fluid'])[1]")
    public WebElement propertiesPageVisible;
    @FindBy(xpath = "//input[@type='search'] ")
    public WebElement propertiesSearchInput;
    @FindBy(xpath = "//span[@data-action='create'] ")
    public WebElement createButton;
    @FindBy(tagName = "(//span)[10] ")
    public WebElement reloadButton;
    @FindBy(xpath = "//*[@title='ID']")
    public WebElement idSelect;
    @FindBy(xpath = "//*[@title='Image']")
    public WebElement imageSelect;
    @FindBy(xpath = "//*[@title='Name']")
    public WebElement nameSelect;
    @FindBy(xpath = "//*[@title='Created At']")
    public WebElement createdAtSelect;
    @FindBy(xpath = "//*[@title='Moderation status']")
    public WebElement moderationStatusSelect;
    @FindBy(xpath = "//*[@title='Expire date']")
    public WebElement expireDateSelect;
    @FindBy(xpath = "//*[@title='Operations']")
    public WebElement operationsSelect;
    @FindBy(xpath = "(//*[@class='column-key-id dtr-control'])[1]")
    public WebElement idRecord1;
    @FindBy(xpath = "(//*[@width='50'])[1]")
    public WebElement imageRecord1;
    @FindBy(xpath = "(//*[@class=' text-start column-key-name'])[1]")
    public WebElement nameRecord1;
    @FindBy(xpath = "(//*[@class=' text-start column-key-created_at'])[1]")
    public WebElement createdAtRecord1;
    @FindBy(xpath = "(//*[@class='label-info status-label'])[1]")
    public WebElement moderationStatusRecord1;
    @FindBy(xpath = "(//*[@class='column-key-expire_date sorting_1'])[1]")
    public WebElement expireDateRecord1;
    @FindBy(xpath = "(//*[@class='fa fa-check text-success'])[1]")
    public WebElement countryStatus1;
    @FindBy(xpath = "(//*[@class='fa fa-edit'])[1]")
    public WebElement editButton1;
    @FindBy(xpath = "(//*[@class='btn btn-icon btn-sm btn-danger deleteDialog'])[1]")
    public WebElement deleteButton1;
    @FindBy(xpath = "(//*[@class='fas fa-sync-alt'])[1]")
    public WebElement reloadButton1;
    @FindBy(xpath = "//span[@class='dt-length-records']")
    public WebElement showFromRecordText;





    //USER DASHBOARD WRITE A PROPERTY
    @FindBy(xpath = "(//div[@class='container-fluid'])[1]")
    public WebElement writeAPropertyPageVisible;
    @FindBy(xpath = "//div[@class='note note-success']")
    public WebElement languageVersionText;
    @FindBy(xpath = "//input[@id='name']")
    public WebElement titleInput;
    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement descriptionInput;
    @FindBy(xpath = "//div[@class='ck ck-toolbar ck-toolbar_grouping']")
    public WebElement toolBar;
    @FindBy(xpath = "//div[@aria-label='Editor editing area: main']")
    public WebElement contentTextInput;
    @FindBy(xpath = "//label[@for='images']")
    public WebElement imagesText;
    @FindBy(xpath = "//div[@class='dz-message needsclick']")
    public WebElement imagesUpload;
    @FindBy(xpath = "//label[@for='city_id']")
    public WebElement cityText;
    @FindBy(xpath = "//span[@id='select2-city_id-container']")
    public WebElement citySelect;
    @FindBy(xpath = "//label[@for='location']")
    public WebElement propertyLocationText;
    @FindBy(xpath = "//input[@id='location']")
    public WebElement propertyInput;
    @FindBy(xpath = "//label[@for='latitude']")
    public WebElement latitudeText;
    @FindBy(xpath = "//input[@id='latitude']")
    public WebElement latitudeInput;
    @FindBy(xpath = "(//a[@class='help-block'])[1]")
    public WebElement latitudeFromAdressLink;
    @FindBy(xpath = "//label[@for='longitude']")
    public WebElement longitudeText;
    @FindBy(xpath = "//input[@id='longitude']")
    public WebElement longitudeInput;
    @FindBy(xpath = "(//a[@class='help-block'])[2]")
    public WebElement longitudeFromAdressLink;
    @FindBy(xpath = "//label[@for='number_bedroom']")
    public WebElement numberBedroomText;
    @FindBy(xpath = "//input[@id='number_bedroom']")
    public WebElement numberBedroomInput;
    @FindBy(xpath = "//label[@for='number_bathroom']")
    public WebElement numberBathroomText;
    @FindBy(xpath = "//input[@id='number_bathroom']")
    public WebElement numberBathroomInput;
    @FindBy(xpath = "//label[@for='number_floor']")
    public WebElement numberFloorText;
    @FindBy(xpath = "//input[@id='number_floor']")
    public WebElement numberFloorInput;
    @FindBy(xpath = "//label[@for='square']")
    public WebElement squareText;
    @FindBy(xpath = "//input[@id='square']")
    public WebElement squareInput;
    @FindBy(xpath = "//label[@for='price']")
    public WebElement priceText;
    @FindBy(xpath = "//input[@id='price-number']")
    public WebElement priceInput;
    @FindBy(xpath = "//label[@for='currency_id']")
    public WebElement currencyText;
    @FindBy(xpath = "//span[@id='select2-currency_id-container']")
    public WebElement currency;
    @FindBy(xpath = "//span[@class='onoffswitch-switch']")
    public WebElement renewAutomaticallyButton;
    @FindBy(xpath = "(//label[@for='auto_renew'])[1]")
    public WebElement renewAutomaticallyText;
    @FindBy(xpath = "//label[@for='label']")
    public WebElement propertLabelText;
    @FindBy(xpath = "//input[@id='label']")
    public WebElement propertyLabelInput;
    @FindBy(xpath = "//span[text()=' Distance key between facilities']")
    public WebElement distanceKeyText;
    @FindBy(xpath = "//select[@class='ui-select']")
    public WebElement selectFacility;
    @FindBy(xpath = "(//input[@class='form-control'])[12]")
    public WebElement distanceInput;
    @FindBy(xpath = "(//*[@class='fa fa-times'])[1]")
    public WebElement xButton;
    @FindBy(xpath = "//button[@class='btn btn-info']")
    public WebElement addNewButton;
    @FindBy(xpath = "(//label[@for='description'])[2]")
    public WebElement typeText;
    @FindBy(xpath = "//select[@name='type_id']")
    public WebElement typeSelect;
    @FindBy(xpath = "//span[text()=' Features']")
    public WebElement featuresText;
    @FindBy(xpath = "(//div[@class='widget-body'])[3]")
    public WebElement featuresBodySelect;
    @FindBy(xpath = "(//input[@name='features[]'])[1]")
    public WebElement wifiSelect;

    @FindBy(xpath = "//span[text()='Search Engine Optimize']")
    public WebElement searchEngineText;
    @FindBy(xpath = "//*[text()='Edit SEO meta']")
    public WebElement editSeoMeta;
    @FindBy(xpath = "//*[@class='default-seo-description ']")
    public WebElement seoMetaText;
    @FindBy(xpath = "//label[@for='seo_title']")
    public WebElement seoTitleText;
    @FindBy(xpath = "//input[@id='seo_title']")
    public WebElement seoTitleInput;
    @FindBy(xpath = "//label[@for='seo_description']")
    public WebElement seoDescriptionText;
    @FindBy(xpath = "//textarea[@id='seo_description']")
    public WebElement seoDescriptionInput;




    //WRITE A PROPERTY RIGHT SIDE
    @FindBy(xpath = "//span[text()='Publish']")
    public WebElement publishText;
    @FindBy(xpath = "//button[@class='btn btn-sm btn-info']")
    public WebElement saveAndExitButton;
    @FindBy(xpath = "//button[@class='btn btn-sm btn-success']")
    public WebElement writePropertySaveButton;
    @FindBy(xpath = "//label[@for='category_id']")
    public WebElement categoryText;
    @FindBy(xpath = "//span[@id='select2-category_id-container']")
    public WebElement categorySelect;





    //USER DASHBOARD SECURITY
    @FindBy(xpath = "//section[@class='bg-light']")
    public WebElement securityPageVisible;
    @FindBy(xpath = "//h4[text()='Security']")
    public WebElement securityText;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInput;
    @FindBy(xpath = "//input[@id='password_confirmation']")
    public WebElement confirmationPasswordInput;
    @FindBy(xpath = "//button[text()='Update password']")
    public WebElement updatePasswordButton;





    //PROJECTS PAGE
    @FindBy(xpath = "//a[@href='https://qa.hauseheaven.com/projects']")
    public WebElement clickOnProjects;
    @FindBy(tagName = "(//div)[2]")
    public WebElement projectsPageVisible;
    @FindBy(xpath = "//h4[@class='mb-0']")
    public WebElement numberOfProjectsVisibleTest;
    @FindBy(xpath = "//div[@class='container mt-5']")
    public WebElement allProjectsList;
    @FindBy(xpath = "(//div[@class='col-lg-4 col-md-6 col-sm-12'])[1]")
    public WebElement firstProjectDetails;
    @FindBy(xpath = "(//div[@class='col-lg-4 col-md-6 col-sm-12'])[2]")
    public WebElement secondProjectDetails;
    @FindBy(xpath = "(//*[text()='Coastal Harmony Estates'])[2]")
    public WebElement secondProjectTitleDetails;
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
    @FindBy(xpath = "(//a[@title='Palm Paradise Residences'])[2]")
    public WebElement seventhProject;
    @FindBy(xpath = "(//a[@class='prt-link-detail text-uppercase'])[8]")
    public WebElement eighthProject;
    @FindBy(xpath = "(//a[@class='prt-link-detail text-uppercase'])[9]")
    public WebElement ninthProject;
    @FindBy(xpath = "//span[text()='Country']")
    public WebElement countryOnProjects;
    @FindBy(xpath = " //*[@id='select2-filter_country_id-result-z2st-1']")
    public WebElement firstCountrySelect;
    @FindBy(xpath = "//h2[text()='Login']")
    public WebElement loginVisibleTest;
    @FindBy(xpath = "//i[@class='fas fa-user']")
    public WebElement userNameVisibleTest;
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
    @FindBy(xpath = "(//div[@class='infor'])[1]")
    public WebElement firstProjectMainPageDetails;
    @FindBy(xpath = "(//div[@class='infor'])[2]")
    public WebElement secondProjectMainPageDetails;
    @FindBy(xpath = "(//div[@class='infor'])[3]")
    public WebElement thirdProjectMainPageDetails;
    @FindBy(xpath = "(//div[@class='infor'])[4]")
    public WebElement fourthProjectMainPageDetails;
    @FindBy(xpath = "(//div[@class='infor'])[5]")
    public WebElement fifthProjectMainPageDetails;
    @FindBy(xpath = "(//div[@class='infor'])[6]")
    public WebElement sixthProjectMainPageDetails;
    @FindBy(xpath = "(//div[@class='infor'])[7]")
    public WebElement seventhProjectMainPageDetails;
    @FindBy(xpath = "(//div[@class='infor'])[8]")
    public WebElement eighthProjectMainPageDetails;
    @FindBy(xpath = "(//div[@class='infor'])[9]")
    public WebElement ninthProjectMainPageDetails;

    @FindBy(xpath = "//span[@class='select2-selection__arrow']")
    public WebElement countrySelectArrow;






    //BLOG PAGE
    @FindBy(xpath = "(//a[@class='bl-continue'])[1]")
    public WebElement continue1;
    @FindBy(xpath = "(//a[@class='bl-continue'])[2]")
    public WebElement continue2;
    @FindBy(xpath = "(//a[@class='bl-continue'])[3]")
    public WebElement continue3;
    @FindBy(xpath = "(//a[@class='bl-continue'])[4]")
    public WebElement continue4;
    @FindBy(xpath = "(//a[@class='bl-continue'])[5]")
    public WebElement continue5;
    @FindBy(xpath = "(//a[@class='bl-continue'])[6]")
    public WebElement continue6;
    @FindBy(xpath = "(//a[@class='bl-continue'])[7")
    public WebElement continue7;
    @FindBy(xpath = "(//a[@class='bl-continue'])[8]")
    public WebElement continue8;
    @FindBy(xpath = "(//a[@class='bl-continue'])[9]")
    public WebElement continue9;
    @FindBy(xpath = "(//a[@class='bl-continue'])[10]")
    public WebElement continue10;
    @FindBy(xpath = "(//a[@class='bl-continue'])[11]")
    public WebElement continue11;
    @FindBy(xpath = "(//a[@class='bl-continue'])[12]")
    public WebElement continue12;
    @FindBy(xpath = "//h4[text()='Categories']")
    public WebElement categories;
    @FindBy(xpath = "//h4[text()='Featured properties']")
    public WebElement featuredProperties;
    @FindBy(xpath = "//i[@class='fab fa-facebook-f']")
    public WebElement facebook;
    @FindBy(xpath = "//i[@class='fab fa-linkedin-in']")
    public WebElement linkedin;
    @FindBy(xpath = "//i[@class='fab fa-twitter']")
    public WebElement twitter;






    //    US20
    //    Kayıtlı kullanıcı olarak sitedeki mülklerin listelendiği list sayfasına ulaşabildiğimi,
    @FindBy(xpath = "//h1[text()='Properties']")
    public WebElement PropertiesText;

    //    var olan mülk sayısının görüntülendiğini,
    @FindBy(xpath = "//h4[@class='m-0']")
    public WebElement ProperttiesListTotalText;

    //    görüntülenen ilanların ayrıntılarına ulaşılabildiğini ve
    @FindBy(xpath ="(//a[@class='prt-view'])[1]")
    public WebElement PropertyViewButton;

    //    çıkan sonuçların ayrıntılarına ulaşılabildiğini doğrulayabilmeliyim


    // US21
    // Kayıtlı kullanıcı olarak sitedeki mülklerin bilgi ayrıntılarına ulaşıp
    //    @FindBy(xpath ="(//a[@class='prt-view'])[1]")
    //    public WebElement PropertyViewButton;

    // ilgili ilanın sosyal medyada paylaşılabilir durumda olduğunu,

    @FindBy(xpath = "//i[@class='fas fa-share']")
    public WebElement shareButton;
    // Bu linkte javascript ile uc secenek aciliyor locate edemedim (fb,tw,linkedin)


    // wishliste eklenebildiğini,
    @FindBy(xpath = "//a[@class='btn btn-likes add-to-wishlist']")
    public WebElement WhitelistSaveButton;

    // Added to wishlist successfully! yazisi javascript olarak aciliyor locate edemedim


    // puan verilebildiğini ve
    // Yildizli gruplarin locate i alinacak degisiyorlar ?

    @FindBy(xpath = "//h4[@class='high user_commnet_avg_rate']")
    public WebElement averageRatingText;

    // yorum yazılabildiğini doğrulayabilmeliyim
    @FindBy(xpath = "//textarea[@placeholder='Messages']")
    public WebElement YorumMessagesInput;

    @FindBy(xpath = "//button[@class='btn btn-theme-light-2 rounded']")
    public WebElement submitReviewButton;

    // US23
    // Kayıtlı kullanıcı olarak siteye kayıtlı emlakçıların listelendiği agents sayfasına ulaşılabildiğini,

    @FindBy(xpath = "//h1[@class='ipt-title']")
    public WebElement allAgentTitleText;

    // emlakçıların kayılı olan ilan sayısının
    @FindBy(xpath = "(//span[@class='fr-position'])[1]")
    public WebElement AgentAdverticeTotalText;

    // ve diğer bilgilerinin görüntülenebilir olduğunu,

    //Agent Name Locate edemedim
    @FindBy(xpath = "//i[@class='ti-email']")
    public WebElement agentEmailButton;

    @FindBy(xpath = "(//div[@class='fr-grid-info'])[1]")
    public WebElement agentPhoneAndEmail;


















}
