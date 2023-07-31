package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminDashboard {
    // -Firdevs hanim -Metin -Yusuf bey -Enver Bey
    public AdminDashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //user name is located on admin log in page
    @FindBy(xpath = "//*[@name='username']")
    public WebElement textBoxAdminUserNameOnLogInPage;

    //password is located on admin log in page
    @FindBy(xpath = "//*[@name='password']")
    public WebElement textBoxAdminPassword;

    //login button is located on admin log in page
    @FindBy(xpath = "//*[@class='btn btn-block login-button']")
    public WebElement adminLogInButton;

    //admin dashboard button is based on slide bar in admin page
    @FindBy(xpath = "//*[@id='cms-core-dashboard']/a")
    public WebElement adminDasboardButton;

    //active properties Button is based on body in admin page
    @FindBy(xpath = "(//*[@class='desc'])[1]")
    public WebElement activePropertiesButton;

    //pending properties Button is based on body in admin page
    @FindBy(xpath = "(//*[@class='desc'])[2]")
    public WebElement pendingPropertiesButton;

    //expired properties Button is based on body in admin page
    @FindBy(xpath = "(//*[@class='desc'])[3]")
    public WebElement expiredPropertiesButton;

    //agents Button is based on body in admin page
    @FindBy(xpath = "(//*[@class='desc'])[4]")
    public WebElement agentsButton;

    //agents Button is based on body in admin page
    @FindBy(xpath = "//*[@class='no-sort column-key-updated_at sorting_disabled']")
    public WebElement labelNumberOfRealEstate;

    //This button is based on admin header
    @FindBy(xpath = "//*[@class='d-none d-sm-inline']")
    public WebElement viewWebsiteButton;

    //This button is based on left side of header
    @FindBy(xpath = "//div[@class='menu-toggler sidebar-toggler']")
    public WebElement sideBarButton;

    //This button that shows us notification is based on right side of header
    @FindBy(xpath = "//*[@class='fas fa-bell']")
    public WebElement notificationButton;

    //This Text that shows us notifications is based inside of notification on right side of header
    @FindBy(xpath = "//h5[text()='No notifications here']")
    public WebElement LabelNotificationsHereText;

    //This button that shows us Admin features is based on right side of header
    @FindBy(xpath = "//*[@class='fa fa-angle-down']")
    public WebElement adminFeaturesButton;

    //This button that goes us Admin profile is based inside of admin features on right side of header
    @FindBy(xpath = "//*[@href='https://qa.hauseheaven.com/admin/system/users/profile/5']")
    public WebElement adminProfileButton;

    //This button that shows us Admin information is located on admin profile page
    @FindBy(xpath = "//*[@class='nav-link active']")
    public WebElement adminUserProfileButton;

    //This button that shows us Admin first name is located on admin profile page
    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public WebElement textBoxAdminFirstName;

    //This button that shows us Admin last name is located on admin profile page
    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public WebElement textBoxAdminLastName;

    //This button that shows us Admin user name is located on admin profile page
    @FindBy(xpath = "(//input[@class='form-control'])[3]")
    public WebElement textBoxAdminUserName;

    //This button that shows us Admin email is located on admin profile page
    @FindBy(xpath = "(//input[@class='form-control'])[4]")
    public WebElement textBoxAdminEmail;

    //This button that shows us Admin password information is located on admin profile page
    @FindBy(xpath = "//*[@href='#tab_1_3']")
    public WebElement adminChangePasswordButton;

    //This button that shows us Admin password information is located on admin profile page
    @FindBy(xpath = "(//input[@class='form-control'])[5]")
    public WebElement textBoxAdminCurrentPassword;

    //This button that shows us Admin password information is located on admin profile page
    @FindBy(xpath = "(//input[@class='form-control'])[6]")
    public WebElement textBoxAdminNewtPassword;

    //This button that shows us Admin password information is located on admin profile page
    @FindBy(xpath = "(//input[@class='form-control'])[7]")
    public WebElement textBoxAdminConfirmNewPassword;

    //This button that update us Admin password information is located on admin profile page
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement adminUpdateNewPasswordButton;

    //This button that log out us from admin page
    @FindBy(xpath = "//*[@href='https://qa.hauseheaven.com/admin/logout']")
    public WebElement adminLogOutButton;

    //This button that goes us to blog button is located inside of left side bar
    @FindBy(xpath = "(//span[@class='title'])[2]")
    public WebElement blogButton;

    //This button that goes us to post button is located inside of blog button
    @FindBy(xpath = "(//a[@class='nav-link'])[1]")
    public WebElement postButton;

    //This button that goes us to post button is located inside of blog button
    @FindBy(xpath = "(//a[@class='nav-link'])[2]")
    public WebElement categoriesButton;

    //This button that goes us to post button is located inside of blog button
    @FindBy(xpath = "(//a[@class='nav-link'])[3]")
    public WebElement tagsButton;

    // blog-posts-create
    @FindBy(xpath = "//*[@id='botble-blog-tables-post-table_wrapper']")
    public WebElement blogPostCreateButton;

    // create posts verify text
    @FindBy(xpath = "(//*[@class='breadcrumb-item active'])[1]")
    public WebElement labelCreatePostVerifyText;

    // blog/edit/name textbox
    @FindBy(xpath = "//input[@id='name']")
    public WebElement textBoxBlogPostName;

    // blog/edit/description text area
    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement textBoxBlogPostDescription;

    // blog/edit/content text area
    @FindBy(xpath = "//*[@class='ck ck-editor__main']")
    public WebElement textBoxBlogPostContent;

    //(blog/edit/save-exit button)
    @FindBy(xpath = "(//button[@name='submit'])[1]")
    public WebElement blogPostSaveExitButton;

    //(blog/edit/save button)
    @FindBy(xpath = "(//button[@name='submit'])[2]")
    public WebElement blogPostSaveButton;

    // (blog/posts/delete button)
    @FindBy(xpath = "(//a[@data-bs-original-title='Delete'])[1]")
    public WebElement blogPostDeleteButton;

    // (blog/posts/delete confirm button)
    @FindBy(xpath = "//*[@class='float-end btn btn-danger delete-crud-entry']")
    public WebElement blogPostDeleteConfirmButton;

    //  (blog/posts/ delete confirm message text)
    @FindBy(xpath = "//*[@class='toast-message']")
    public WebElement labelBlogPostDeleteConfirm;

    //categories text is on categories body in catergories page
    @FindBy(xpath = "(//li[@class='breadcrumb-item active'])[1]")
    public WebElement labelCategories;

    //Create button is based on categories body in the page
    @FindBy(xpath = "//*[text()=' Create                            ']")
    public WebElement categoriesCrateButton;

    //Editigin text is basd on categories body in the page
    @FindBy(xpath = "//*[@class='note note-success']")
    public WebElement labelEditing;

    //This is a delete button for Latest News file on based near the file in categories page
    @FindBy(xpath = "(//*[@class='btn btn-icon btn-danger deleteDialog'])[1]")
    public WebElement categoriesDeleteButton;

    // place holder is for name textbox in categories page
    @FindBy(xpath = "//*[@placeholder='Name']")
    public WebElement textBoxCategoryName;

    //select box is for parent in categories page
    @FindBy(xpath = "//*[@name='parent_id']")
    public WebElement textBoxCategorySelectParent;

    //description textarea is for create categories in categories page
    @FindBy(xpath = "(//*[@name='description'])[2]")
    public WebElement textBoxCategoryDescription;

    //switch button is for is default text on create categories
    @FindBy(xpath = "(//*[@class='onoffswitch-switch'])[1]")
    public WebElement categoryDefaultSwitchButton;

    //switch button is for is featured text on create categories
    @FindBy(xpath = "(//*[@class='onoffswitch-switch'])[2]")
    public WebElement categoryFeaturedSwitchButton;

    //text box is for icon on create categories
    @FindBy(xpath = "//*[@name='icon']")
    public WebElement textBoxCategoryIcon;

    //number box is for order on create categories
    @FindBy(xpath = "//*[@name='order']")
    public WebElement textBoxCategoryOrder;

    //select box is for status on create categories
    @FindBy(xpath = "//*[@name='status']")
    public WebElement textBoxCategorySelectStatus;

    //save&exit button is for publis on create categories
    @FindBy(xpath = "(//*[@value='save'])[1]")
    public WebElement saveExitButton;

    //save button is for publis on create categories
    @FindBy(xpath = "(//*[@value='apply'])[1]")
    public WebElement saveButton;

    //This the success message is for both delete and create buttons in categories page
    @FindBy(xpath = "//*[@class='toast toast-success']")
    public WebElement labelCategoryCreatedSuccessMessage;

    //Dashboard/blogs/tags/create button
    @FindBy(xpath = "//*[@class='btn btn-secondary action-item']")
    public WebElement tagsCrateButton;

    //Dashboard/testimonialsButton
    @FindBy(xpath = "//*[@id='cms-plugins-testimonial']")
    public WebElement testimonialsButton;

    //Dashboard/testimonialsButton/Records
    @FindBy(xpath = "//span[@class='dt-length-records']")
    public WebElement labelTestimonialsRecords;

    //Dashboard/testimonialsButton/Create
    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public WebElement testimonialsCreateButton;

    //Dashboard/testimonialsButton/Create/position/CompanyInput
    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public WebElement textBoxCompanyInput;

    //Dashboard/testimonialsButton/Create/SaveButton
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement testimonialsCreateSaveButton;

    //Dashboard/testimonialsButton/Create/Save&ExitButton
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement testimonialsSaveButton;

    //Dashboard/testimonialsButton/Delete
    @FindBy(xpath = "(//*[@data-bs-original-title='Delete'])[9]")
    public WebElement testimonialsDeleteButton;

    //Dashboard/testimonialsButton/edit
    @FindBy(xpath = "(//*[@class='fa fa-edit'])[10]")
    public WebElement testimonialsEditButton;

    //Dashboard/testimonialsButton/delete/confirmDelete
    @FindBy(xpath = "//button[@class='float-end btn btn-danger delete-crud-entry']")
    public WebElement testimonialsConfirmDeleteButton;

    //Dashboard/testimonialsButton/delete/confirmDelete/successfullDelete
    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement labelSuccessfullDelete;

    //Real Estate button is on side bar in admin page
    @FindBy(xpath = "(//*[@class='nav-link nav-toggle'])[4]")
    public WebElement realEstateButton;

    //Properties button is under Real Estate button in admin page
    @FindBy(xpath = "//*[@id='cms-plugins-property']")
    public WebElement realEstatePropertiesButton;

    //Features button is under Real Estate button in admin page
    @FindBy(xpath = "//*[@id='cms-plugins-re-feature']")
    public WebElement realEstateFeatureButton;

    //Facilities button is under Real Estate button in admin page
    @FindBy(xpath = "//*[@id='cms-plugins-facility']")
    public WebElement realEstateFacilityButton;

    //Categories button is under Real Estate button in admin page
    @FindBy(xpath = "//*[@id='cms-plugins-real-estate-category']")
    public WebElement realEstateCategoryButton;

    //Types button is under Real Estate button in admin page
    @FindBy(xpath = "//*[@id='cms-plugins-real-estate-type']")
    public WebElement realEstateTypeButton;

    // properties / records
    @FindBy(xpath = "//span[@class='badge bg-secondary bold badge-dt']")
    public WebElement labelPropertiesRecords;

    // properties / create
    @FindBy(xpath = "//span[@data-action='create']")
    public WebElement propertiesCreateButton;

    // properties / create/Title text box
    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public WebElement textBoxPropertiesTitle;

    // properties / create/first switch
    @FindBy(xpath = "(//span[@class='onoffswitch-inner'])[1]")
    public WebElement propertiesFeaturedSwitchButton;

    // properties / create/description
    @FindBy(xpath = "(//textarea[@class='form-control'])[1]")
    public WebElement textBoxPropertiesDescription;

    // properties / create/Content /show/Hideeditor button
    @FindBy(xpath = "//button[@class='btn btn-primary show-hide-editor-btn']")
    public WebElement propertiesShowHideeditorButton;

    // properties / create/content add media
    @FindBy(xpath = "//a[@class='btn_gallery btn btn-primary']")
    public WebElement propertiesContentAddMediaButton;

    // properties / create/content shortcode
    @FindBy(xpath = "//button[@class='btn btn-primary dropdown-toggle add_shortcode_btn_trigger']")
    public WebElement propertiesContentShortcodeButton;

    // properties / create/Add image button
    @FindBy(xpath = "(//*[@data-name='images[]'])[3]")
    public WebElement PropertiesAddImageButton;

    // properties / create/Upload Button
    @FindBy(xpath = "//*[@class='btn btn-success js-dropzone-upload dz-clickable']")
    public WebElement PropertiesUploadButton;

    // properties / media/
    @FindBy(xpath = "//*[@class='btn btn-danger btn-lg js-insert-to-editor']")
    public WebElement PropertiesInsertButton;

    // properties / create/select city
    @FindBy(xpath = "//*[@id='city_id']")
    public WebElement propertiesSelectCity;

    // properties / create/location
    @FindBy(xpath = "//*[@id='location']")
    public WebElement propertiesLocationInput;

    // properties / create/latitude
    @FindBy(xpath = "//*[@id='latitude']")
    public WebElement propertiesLatitudeIpnput;

    // properties / create/longitude
    @FindBy(xpath = "//*[@id='longitude']")
    public WebElement propertieslongitudeIpnput;

    // properties / create/number of bedrooms
    @FindBy(xpath = "//*[@id='number_bedroom']")
    public WebElement textBoxpropertiesNumberOfBedrooms;

    // properties / create/number of bathroom
    @FindBy(xpath = "//*[@id='number_bathroom']")
    public WebElement textBoxpropertiesNumberOfBathroom;

    // properties / create///number of floor
    @FindBy(xpath = "//*[@id='number_floor']")
    public WebElement textBoxpropertiesNumberOfFloor;

    // properties / create/square
    @FindBy(xpath = "//*[@id='square']")
    public WebElement textBoxpropertiesSquare;

    // properties / create/price number
    @FindBy(xpath = "//*[@id='price-number']")
    public WebElement textBoxpropertiesPriceNumber;

    // properties / create/currency id
    @FindBy(xpath = "//*[@id='currency_id']")
    public WebElement textBoxpropertiesCurrencyId;

    // properties / create/content Paragraph
    @FindBy(xpath = "")
    public WebElement textBoxpropertiesContentParagraph;

    // properties / create/facilities
    @FindBy(xpath = "//*[@name='facilities[][id]']")
    public WebElement textBoxpropertiesFacilities;

    // properties / create/distance
    @FindBy(xpath = "//*[@name='facilities[][distance]']")
    public WebElement textBoxPropertiesdistance;

    // properties / create/Add new button
    @FindBy(xpath = "(//*[@class='btn btn-info'])[1]")
    public WebElement PropertiesAddNewButton;

    // properties / create/Select types
    @FindBy(xpath = "//*[@class='form-control ui-select is-valid']")
    public WebElement textBoxPropertiesSelectTypes;

    // properties / create/Name is for video URL
    @FindBy(xpath = "//*[@name='video[url]']")
    public WebElement textBoxPropertiesVideoUrl;

    // properties / create/Save&exit button
    @FindBy(xpath = "(//*[@class='btn btn-info'])[2]")
    public WebElement propertiesSaveExitButton;

    // admin/real estate/facilities menu link-facilities
    @FindBy(xpath = "(//*[@class='breadcrumb-item active'])[1]")
    public WebElement facilitiesLinkFacilitiesButton;

    // admin/real estate/facilities7/number of records
    @FindBy(xpath = "//*[@id='botble-real-estate-tables-facility-table_info']")
    public WebElement labelFacilitiesNumberOfRecords;

    // admin/real estate/facilities/first content detail page/create facilities
    @FindBy(xpath = "//*[@data-action='create']")
    public WebElement facilitiesCreateFacilitiesButton;

    // create facility page/name textbox
    @FindBy(xpath = "//input[@id='name']")
    public WebElement textBoxFacilitiesName;

    // create facility page/icon selector
    @FindBy(xpath = "//*[@id='select2-icon-container']")
    public WebElement facilitiesIconSelector;

    // create facility page/save&exit button
    @FindBy(xpath = "(//*[@value='save'])[1]")
    public WebElement facilitiesSaveFacilitiesButton;

    // left side bar/Dashboard/Newsletters
    @FindBy(xpath = "(//*[@class='nav-link nav-toggle'])[5]")
    public WebElement newsLettersButton;

    //left side bar/Dashboard/Consults
    @FindBy(xpath = "(//*[@class='nav-link nav-toggle'])[6]")
    public WebElement consultsButton;

    //Admin page/Consults/concults text
    @FindBy(xpath = "//*[@class='breadcrumb-item active']")
    public WebElement labelConsultsText;

    //Admin page/Consults/Total Record comes from concults records
    @FindBy(xpath = "//*[@class='badge bg-secondary bold badge-dt']")
    public WebElement labelConsultsResultsText;

    //left side bar/Dashboard/Accounts
    @FindBy(xpath = "(//*[@class='nav-link nav-toggle'])[7]")
    public WebElement accountsButton;

    //Dashboard/Accounts//Accounts text
    @FindBy(xpath = "//*[@class='breadcrumb-item active']")
    public WebElement labelAccountsText;

    //Admin page/accounts/Total Record comes from accounts records
    @FindBy(xpath = "//*[@class='badge bg-secondary bold badge-dt']")
    public WebElement labelAccountsResultsText;

    //Dashboard/Accounts/create button
    @FindBy(xpath = "//*[@class='btn btn-secondary action-item']")
    public WebElement accountsCreateButton;

    //Dashboard/contact
    @FindBy(xpath = "(//*[@class='nav-link nav-toggle'])[9]")
    public WebElement contactButton;

    //Dashboard/contact/records of contact
    @FindBy(xpath = "//span[@class='dt-length-records']")
    public WebElement labelContactRecords;

    //Dashboard/contact
    @FindBy(xpath = "//*[@class='breadcrumb-item active']")
    public WebElement labelContactText;


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
    @FindBy(xpath = "(//i[@class='fa fa-edit'])[2]")
    public WebElement editButton;
    @FindBy(xpath = "(//i[@class='fa fa-trash'])[1]")
    public WebElement deleteButton;
    @FindBy(xpath = "(//button[text()='Delete'])[1]")
    public WebElement confirmDeleteButton;
    @FindBy(xpath = "//*[@class='toast toast-success']")
    public WebElement deleteSuccessfullyText;

    //Dashboard/Locations
    @FindBy(xpath = "(//span[@class='title'])[11]")
    public WebElement locationsButton;

    //Dashboard/Locations/countries
    @FindBy(xpath = "(//*[@class='nav-link'])[10]")
    public WebElement locationsCountriesButton;

    //Dashboard/Locations/states
    @FindBy(xpath = "(//*[@class='nav-link'])[11]")
    public WebElement locationsStatesButton;

    //Dashboard/Locations/cities
    @FindBy(xpath = "(//*[@class='nav-link'])[12]")
    public WebElement locationsCitiesButton;

    //Dashboard/Locations/countries/countriesText
    @FindBy(xpath = "(//*[@class='breadcrumb-item active'])[2]")
    public WebElement labelCountriesText;

    //Dashboard/Locations/countries/stateText
    @FindBy(xpath = "(//*[@class='breadcrumb-item active'])[2]")
    public WebElement labelStateText;

    //Dashboard/Locations/countries/citiesText
    @FindBy(xpath = "(//*[@class='breadcrumb-item active'])[2]")
    public WebElement labelCitiesText;


    //Dashboard/Payments/Transactions
    @FindBy(xpath = "(//span[@class='title'])[10]")
    public WebElement transactionsButton;

    //Dashboard/Payments/Transactions
    @FindBy(xpath = "//*[@class='breadcrumb-item active']")
    public WebElement labelPaymentsText;

    //Dashboard/Payments/Transactions/ID title
    @FindBy(xpath = "//*[@class='column-key-id sorting_desc']")
    public WebElement labelPaymentsIdTitle;

    //Dashboard/Payments/Transactions/Charge id title
    @FindBy(xpath = "//*[@class='text-start column-key-charge_id sorting']")
    public WebElement labelPaymentsChargeIdTitle;

    //Dashboard/Payments/Transactions/Payer Name title
    @FindBy(xpath = "//*[@class='text-start column-key-customer_id sorting']")
    public WebElement labelPaymentsPayerNameTitle;

    //Dashboard/Payments/Transactions/ChargeAmount title
    @FindBy(xpath = "//*[@class='text-start column-key-amount sorting']")
    public WebElement labelPaymentsChargeAmountTitle;

    //Dashboard/Payments/Transactions/PaymentChanel title
    @FindBy(xpath = "//*[@class='text-start column-key-payment_channel sorting']")
    public WebElement labelPaymentsPaymentChanelTitle;

    //Dashboard/Payments/Transactions/CreatedAt title
    @FindBy(xpath = "//*[@class='column-key-created_at sorting']")
    public WebElement labelPaymentsCreatedAtTitle;

    //Dashboard/Payments/Transactions/Status title
    @FindBy(xpath = "//*[@class='column-key-status sorting']")
    public WebElement labelPaymentsStatusTitle;

    //Dashboard/Payments/Transactions/Record of Payments
    @FindBy(xpath = "//span[@class='badge bg-secondary bold badge-dt']")
    public WebElement labelPaymentsRecordOfPayments;

    //Dashboard/Locations/cities/create/NameTextBox
    @FindBy(xpath = "//*[@class='text-start column-key-charge_id sorting']")
    public WebElement textBoxCitiesName;

    //Dashboard/Locations/cities/create/slugTextBox
    @FindBy(xpath = "//*[@class='text-start column-key-customer_id sorting']")
    public WebElement textBoxCitiesSlug;

    //Dashboard/Locations/cities/create/state select button
    @FindBy(xpath = "//*[@class='text-start column-key-amount sorting']")
    public WebElement locationsCitiesStateSelect;

    //Dashboard/Locations/cities/create/country select button
    @FindBy(xpath = "//*[@class='text-start column-key-payment_channel sorting']")
    public WebElement locationsCitiesCountrySelect;

    //Dashboard/Locations/cities/create/status select button
    @FindBy(xpath = "//*[@class='column-key-created_at sorting']")
    public WebElement locationsCitiesStatusSelect;

    //Dashboard/Locations/cities/create/edit button
    @FindBy(xpath = "//*[@class='column-key-status sorting']")
    public WebElement locationsCitiesEditButton;

    //Dashboard/Locations/cities/create/delete button
    @FindBy(xpath = "//span[@class='badge bg-secondary bold badge-dt']")
    public WebElement locationsCitiesDeleteButton;

    //Dashboard/media/upload
    @FindBy(xpath = "//*[@class='text-start column-key-customer_id sorting']")
    public WebElement mediaUpload;

    //Dashboard/media/create folder
    @FindBy(xpath = "//button[@class='btn btn-success js-create-folder-action']")
    public WebElement creatfolderButton;

    //Dashboard/media/filter button
    @FindBy(xpath = "(//span[@class='js-rv-media-filter-current'])[1]")
    public WebElement filterButton;

    //Dashboard/media/image button
    @FindBy(xpath = "(//*[@class='js-rv-media-change-filter'])[9]")
    public WebElement imageButton;




    // ==================metin's locators start

    @FindBy(xpath = "(//*[@class='js-rv-media-change-filter'])[9]")
    public WebElement dropDownModerationStatus;

    @FindBy(xpath = "//*[@class='dropdown dropdown-user']")
    public WebElement adminUserButtonOnHeader;


    //===================metin's locators finsih

  //=======yusuf===========

    // admin dahsboard creat button
    @FindBy(xpath = "(//span[@class='onoffswitch-switch'])[1]")
    public WebElement IsfeaturedButton;


    // admin dahsboard creat button
    //@FindBy(xpath = "//button[@class='btn btn-secondary']")
    //public WebElement IsfeaturedButton; // us_37 kullanacagim


    // admin dahsboard button icinde properties yazi
    @FindBy(xpath = "(//*[@class='breadcrumb-item active'])[2]")
    public WebElement propertiesYaizisiButton;


    // dahsboard yazisi
    @FindBy(xpath = "//*[@class='breadcrumb-item active']")
    public WebElement dahsboardYazisiYusuf;


    // real estate altinda categories icindeki id categori
    @FindBy(xpath = "//*[@title='ID']")
    public WebElement idCategoryYusuf;

    // real estate altinda categories icindeki name categori
    @FindBy(xpath = "//*[@title='Name']")
    public WebElement nameCategoryYusuf;


    // real estate altinda categories icindeki parent categori
    @FindBy(xpath = "//*[@title='Parent']")
    public WebElement parentCategoryYusuf;

    // real estate altinda categories icindeki Created At categori
    @FindBy(xpath = "//*[@title='Created At']")
    public WebElement createdAtCategoryYusuf;

    // real estate altinda categories icindeki Status categori
    @FindBy(xpath = "//*[@title='Status']")
    public WebElement statusCategoryYusuf;

    // real estate altinda categories icindeki Operations categori
    @FindBy(xpath = "//*[@title='Operations']")
    public WebElement operationsCategoryYusuf;


    // real estate altinda categories icindeki cateories sonuclar
    @FindBy(xpath = "//span[@class='dt-length-records']")
    public WebElement categoriesResultYusuf;

    // creat icindeki New category yazisi
    @FindBy(xpath = "//*[@class='breadcrumb-item active'][2]")
    public WebElement newCategoryYazisiYusuf;

    // real estate altinda categories icinde reload
    @FindBy(xpath = "//button[@class='btn btn-secondary buttons-reload']")
    public WebElement reloadButtonYusuf;


    // new categories creat name
    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement nameTexyBoxYusuf;


    // new categories creat Is default
    @FindBy(xpath = "//*[@class='onoffswitch-label']")
    public WebElement isdefaultYusuf;

    // new categories creat status
    @FindBy(xpath = "//select[@name='status']")

    public WebElement statusSelectPendingYusuf;


    // kayit islemini  silme tusu tikla
    @FindBy(xpath = "//select[@name='//*[@class='btn btn-icon btn-sm btn-danger deleteDialog']']")
    public WebElement deleteButtonYusuf;



    // Admin Blog Categories menu link Latest News - Firdevs

    @FindBy(xpath = "//a[@class='fetch-data category-name active']")
    public WebElement linkBlogCategoriesLatestNews;


    //Admin Blog Categories Save&Exit Button - Firdevs
    @FindBy(xpath = "(//*[@class='btn btn-info'])[1]")
    public WebElement linkBlogCategoriesSaveExitButton;


    // Admin Blog Categories Name - Firdevs
    @FindBy(xpath = "//input[@id='name']")
    public WebElement blogCategoriesWriteName;

    // Admin Blog Categories Parent - Firdevs
    @FindBy(xpath = "//*[@id='select2-parent_id-container']")
    public WebElement blogCategoriesWriteParent;


    // Admin Blog Categories Description - Firdevs
    @FindBy(xpath ="//*[@id='description']")
    public WebElement blogCategorieswriteDescription;

    // Admin Blog Categories Published Button - Firdevs
    @FindBy(xpath = "//*[@class='form-control ui-select ui-select']")
    public  WebElement blogCategoriesPublishedButton;

    // Blog Create link--Firdevs
    @FindBy (xpath = "//a[@href='https://qa.hauseheaven.com/admin/blog/categories/create']")
    public WebElement buttonBlogCategoriesCreate;

    // Blog categories add dropdown menu select -- Firdevs
    @FindBy (xpath = "//select[@name='parent_id']")
    public WebElement dropdownSelectionBlogCategories;

    // Blog categories Collapse All Button -- Firdevs
    @FindBy (xpath = "(//button[@type='button'])[1]")
    public WebElement buttonBlogCollapseAll;


    // Dashboard Packages Link Button -- Firdevs
    @FindBy(xpath ="(//*[@class='nav-link nav-toggle'])[8]")
    public WebElement dashboardPackageslinkButton;


    // Dashboard Packages Link Goruntulenen ilk Element -- Firdevs
    @FindBy(xpath = "//*[@class='text-start column-key-name sorting_1'])[1]")
    public WebElement dashboardPackagesIlkElement;


    // kayit islemini  silme onayla
    @FindBy(xpath = "//button[@class='float-end btn btn-danger delete-crud-entry']")
    public WebElement deleteConfirmButtonYusuf;

    //================elif=================

    @FindBy(xpath = "//(//a[@class='btn btn-icon btn-sm btn-primary'])[1]")
    public WebElement editButtonElif;
    @FindBy(xpath = "//span[@class='username d-none d-sm-inline']")
    public WebElement adminUserNameAdminHeader;
    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    public WebElement tagsRadioButton;
    @FindBy(xpath = "(//button[text()='Delete'])[1]")
    public WebElement confirmDeleteButtonElif;
    @FindBy(xpath = "//*[@class='login-form']")
    public WebElement adminLoginBox;
    @FindBy(xpath = "//table[@id='botble-blog-tables-tag-table']")
    public WebElement adminTagsWebTable;
    @FindBy(xpath = "//span[@class='dt-length-records']")
    public WebElement numberOfStatesRecord;
    @FindBy(xpath = "//*[@class='fa fa-plus']")
    public WebElement locationsStatesCreateButton;
    @FindBy(xpath = "//input[@id='name']")
    public WebElement locationsStatesCreateNameInput;
    @FindBy(xpath = "//input[@id='abbreviation']")
    public WebElement locationsStatesCreateAbbrInput;
    @FindBy(xpath = "//select[@name='country_id']")
    public WebElement locationsStatesSelectCountry;
    @FindBy(xpath = "//input[@id='order']")
    public WebElement locationStatesOrder;
    @FindBy(xpath = "(//*[@class='fa fa-save'])[1]")
    public WebElement locationsStatesSaveAndExit;
    @FindBy(xpath = "//span[@id='order-error']")
    public WebElement orderError;
    @FindBy(xpath = "//input[@id='dial_code']")
    public WebElement statesDialCode;
    @FindBy(xpath = "(//tr[@role='row'])[2]")
    public WebElement statesAddedState;
    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    public WebElement statesRadioButton;



}
