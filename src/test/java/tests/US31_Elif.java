package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class US31_Elif {
    @Test
    public void Test01() {

        //Test Step 1: Login to the admin page successfully
        AdminDashboard adminDashboard = new AdminDashboard();

        //Navigate to the login page of the admin dashboard.
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        //Enter valid admin credentials and click the 'Login' button.
        adminDashboard.textBoxAdminUserNameOnLogInPage.sendKeys(ConfigReader.getProperty("admin01"));
        adminDashboard.textBoxAdminPassword.sendKeys(ConfigReader.getProperty("adminPassword"));
        adminDashboard.adminLogInButton.click();
        //Verify successful login by checking for admin name in the header
        Assert.assertTrue(adminDashboard.adminUserNameAdminHeader.isDisplayed());
    }

    @Test
    public void test02() {
        AdminDashboard adminDashboard = new AdminDashboard();

        //Navigate to the Blog section in the admin dashboard.
        adminDashboard.blogButton.click();
        //Click on the 'Tag' page under the blog section.
        adminDashboard.tagsButton.click();
        //Verify that the 'Tag' page opens successfully.
        String expectedTitle = "Tags | Hause Heaven";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

        //Verify the visibility and activity of each existing tags.
        List<WebElement> tagsList = Driver.getDriver().findElements(By.xpath("//table[@id='botble-blog-tables-tag-table']"));
        Assert.assertFalse(tagsList.isEmpty());

        for (WebElement eachTag : tagsList) {
            Assert.assertTrue(eachTag.isDisplayed());
            Assert.assertTrue(eachTag.isEnabled());
        }
    }

    @Test
    public void test03() {

        //Test Case 3: Adding New Tags:
        AdminDashboard adminDashboard = new AdminDashboard();
        //Click on the 'Create' button
        adminDashboard.tagsCrateButton.click();
        //Enter details for the new tag (Tag name, Tag description)
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();
        adminDashboard.textBoxBlogPostName.click();
        actions.sendKeys(faker.name().firstName());
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(faker.expression("Winter is coming")).perform();
        //Click the 'Save&Exit' button
        adminDashboard.blogPostSaveExitButton.click();
        //Verify the new tag is added
        String expectedText1 = "Success! Created successfully";
        Assert.assertEquals("Success! Created successfully", expectedText1);

    }

    @Test
    public void test04() {
        //Test Case:  Editing Tags
        AdminDashboard adminDashboard = new AdminDashboard();

        //Choose a tag to edit from the list of existing tags
        ReusableMethods.bekle(2);
        adminDashboard.tagsRadioButton.click();
        //Click on the 'Edit' button next to the chosen tag.
        adminDashboard.editButton.click();
        //Modify the details of the tag as required.
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();
        adminDashboard.textBoxBlogPostDescription.click();
        actions.sendKeys(faker.expression("Winter is really coming")).perform();
        //Click the 'Save&Exit' button.
        adminDashboard.saveExitButton.click();
        //Verify that the tag details are updated by checking the updated successfully message
        String expectedText = "Success! Updated successfully";
        String actualText=ConfigReader.getProperty("successText");
        Assert.assertEquals(actualText,expectedText);

    }

    @Test
    public void test05() {
        //Test Case:  Deleting Tags:
        AdminDashboard adminDashboard=new AdminDashboard();
        //Choose a tag to delete from the list of existing tags.
        ReusableMethods.bekle(2);
        adminDashboard.tagsRadioButton.click();
        //Click on the 'Delete' button next to the chosen tag.
        adminDashboard.deleteButton.click();
        //Confirm the deletion if a confirmation box appears.
        ReusableMethods.bekle(2);
        adminDashboard.confirmDeleteButtonElif.click();
        //Verify that the tag is deleted by checking its absence in the tag list.
        assertTrue(adminDashboard.deleteSuccessfullyText.isDisplayed());
    }
    @Test
    public void test06(){
        //Test Case: Login is unsuccessful with invalid username and password
        AdminDashboard adminDashboard=new AdminDashboard();

        //Click on admin username
        adminDashboard.adminUserNameAdminHeader.click();
        //Click on log out
        adminDashboard.adminLogOutButton.click();
        //Enter invalid email/username to the text box on admin sign in page
        adminDashboard.textBoxAdminUserNameOnLogInPage.sendKeys(ConfigReader.getProperty("adminInvalidUserName"));
        //Enter invalid password to the text box on admin sign in page
        adminDashboard.textBoxAdminPassword.sendKeys(ConfigReader.getProperty("adminInvalidPassword"));
        //Click on sign in
        adminDashboard.adminLogInButton.click();
        //7-Verify that login cannot be done with wrong email adress and password
        Assert.assertTrue(adminDashboard.adminLoginBox.isEnabled());
        //Close Browser
        Driver.closeDriver();



    }
}
